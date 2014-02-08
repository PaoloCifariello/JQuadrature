package quadrature.core;

import java.io.IOException;
import java.util.Comparator;
import java.util.PriorityQueue;

import echo.EchoWriter;

import quadrature.fun.Integrand;
import quadrature.fun.Problem;


/**
 *  This class calculates the integral value of a given problem
 *  
 *  It maintains a priority queue of Interval ordered according to the error value
 * 
 * @authors Paolo Cifariello, Giada Fallo
 * 
 */
public class Engine implements Comparator<Interval> {
	
	/** flag to activate verbose behavior 
	 * (function name and result will be always print on the console) 
	 */
	public static boolean verbose = true;

	/** Problem */
	private Problem p;

	/** Limit number of bisections */
	private int limit;
	
	/** Error tolerances */
	private double absoluteGoal;

	/** Queue of Interval */
	private PriorityQueue<Interval> q;

	/** Number of computed intervals */
	public int computedIntervals;

	/** Global Error Estimate */
	public double globalError = Double.POSITIVE_INFINITY;

	/** Difference between exact integral and calculated integral*/
	private double realError = 0;
	
	/** Global Integral approximate value */
	public double integral = 0;

	/** Integration formula used */
	private EnumRules usedFormula;
	
	/** Result to print */
	private String result;

	/** Name of the problem to solve */
	private String functionName;
	
	EchoWriter eW;

	/**
	 * Constructor
	 * 
	 * @param functionName name of function to integrate
	 * @param absoluteGoal error tolerance
	 * @param limit limit number of bisections
	 * @param formula interpolation rule to use
	 * @param fileName name of file where to print results
	 */
	public Engine(String functionName, double absoluteGoal, int limit, EnumRules formula, String fileName ) {
		
		try {
			this.p = Integrand.getProblem(functionName);
			eW = new EchoWriter(fileName);
		
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage() + '\n');
			return;
		} catch (IOException e) {
			System.err.println(e.getMessage() + '\n');
		}
		
		eW.consoleEcho(Engine.verbose);
		
		this.absoluteGoal = absoluteGoal;
		this.limit = limit;
		this.usedFormula = formula;
		this.functionName = functionName;
		
		this.q = new PriorityQueue<Interval>(limit, this);
		
		Interval interval = new Interval(p.a(), p.b(), p, usedFormula);
		
		computedIntervals = 1;

		if ( !interval.singularityCase() ){
			integral = interval.integral;
			globalError = interval.error;
		}
		
		this.q.add(interval);
	}
	
	/**
	 * Constructor which does not print results on file
	 * 
	 * @param functionName name of function to integrate
	 * @param absoluteGoal error tolerance
	 * @param limit limit number of bisections
	 * @param formula interpolation rule to use
	 */
	public Engine(String functionName, double absoluteGoal, int limit, EnumRules formula ){
		
		this( functionName, absoluteGoal, limit, formula , null);
	}
	
	/** Expand the worst interval */

	public void expand() {
		
		computedIntervals++;
		
		Interval interval = q.poll();
		
		double a = interval.a;
		double b = interval.b;
		double mid = (a + b) / 2;
		
		Interval interval1 = new Interval( a, mid, p, usedFormula );
		Interval interval2 = new Interval( mid, b, p, usedFormula );
		
		if ( (!interval1.singularityCase() || !interval2.singularityCase()) 
				&& Double.isInfinite(globalError))
			globalError = 0.;
				
		if (!interval1.singularityCase() ){
			integral += interval1.integral;
			globalError += interval1.error;
		}
		if (!interval2.singularityCase()){
			integral += interval2.integral;
			globalError += interval2.error; 
		}
	
		if (!interval.singularityCase()){
			integral -= interval.integral;
			globalError -= interval.error;
		}
		
		this.q.add(interval1);
		this.q.add(interval2);
	}

	/**
	 * Perform a complete search until goal is reached or resources exhausted
	 * 
	 */
	public void integrate() {
		
		if (this.p == null)
			return;
		
		for(int i=1;i<limit;i++) {
		
			if ( globalError < absoluteGoal )
				break;
	
				expand();
		}
		
		this.realError = Math.abs(this.integral - this.p.exactIntegral());
		
		if ( this.realError <= this.absoluteGoal ) 
			this.result = "Success";
		else
			this.result = "Failure";
		
		
		eW.println(this.toString());
	}
	
	
	public String toString() {
		
			return 
				"\n/*************************************************************************************\n"+ 
				"** " + functionName + "\n" +
				"** " + usedFormula + " method" + "\n" +
				"** From " + p.a() + " to " + p.b() + 
				" with " + computedIntervals + " intervals " + "\n" +
				"** Approximate Value: " + integral  + "\n" +
				"** Approximate Error: " + globalError  + "\n" +
				"** Real Error: " + realError + "\n" +
				"** Result: " + result  + "\n" +
				"**************************************************************************************/\n";
	}

	
	/**
	 * Comparator for Priority Queue
	 * 
	 * @param arg0 first element to compare
	 * @param arg1 second element to compare
	 * 
	 * @return sign of the difference arg1.value()-arg0.value()
	 */
	public int compare(Interval arg0, Interval arg1) {
		if (Double.isInfinite(arg0.integral))return -1;
		else if (Double.isInfinite(arg1.integral)) return +1;
		return (int) Math.signum(arg1.error - arg0.error);
	}
}