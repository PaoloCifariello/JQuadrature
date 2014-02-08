package quadrature.core;

import quadrature.fun.Problem;

/**
 * This class defines an interval 
 * 
 * @authors Paolo Cifariello, Giada Fallo
 * 
 */
public class Interval {
	
	/** Bounds of the interval */
	public double a, b;
	
	/** Estimate value of the integral */
	public double integral;
	
	/**  Error evaluation */
	public double error;
	
	/** Integration formula used */
	private EnumRules usedFormula;
	
	/**
	 * Constructor 
	 * 
	 * @param a left bound
	 * @param b right bound
	 * @param p problem
	 * @param form interpolation rule to use
	 */
	public Interval(double a, double b, Problem p, EnumRules form) {
		
		this.usedFormula = form;
		this.a = a;
		this.b = b;
		double v1 = 0;

		switch ( usedFormula ) {

			case Trapezoidal: { 
				integral = Formulas.quad2(a, b, p);
				v1 = Formulas.quad1(a,b,p);
			} break;
			
			case Cavalieri:{
				integral = Formulas.quad3(a,b,p);
				v1 = Formulas.quad2(a,b,p);
			} break;
		}
		
		error = Math.abs(integral - v1);
		
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean singularityCase(){
		if (Double.isInfinite(integral) || Double.isNaN(integral))
			return true;
		return false;
	}
	
	public String toString(){
		return  "- (" + a + ", " + b + ") || Approximate value: " + integral + " || Approximate error: " + error;
				
	}
}
