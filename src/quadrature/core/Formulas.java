package quadrature.core;
import quadrature.fun.Problem;

/**
 * This class contains the interpolation functions that can be used
 * 
 * @authors Paolo Cifariello, Giada Fallo
 * 
 */
public class Formulas {
	
	/**
	 * Interpolation function: polynomial of degree 0 (Bisection)
	 * 
	 * @param a left bound of the interval
	 * @param b right bound of the interval
	 * @param p the Problem
	 * 
	 * @return the approximate value of the integral in  [a,b] interval
	 */
	public static double quad1(double a, double b, Problem p) {
		return  ( (b-a) * ( (p.f(a)+p.f(b)) / 2 ) );
	}

	/**
	 * Interpolating function: polynomial of degree 1 (Trapezoidal)
	 * 
	 * @param a left bound of the interval
	 * @param b right bound of the interval
	 * @param p the Problem
	 * 
	 * @return the approximate value of the integral in [a,b] interval
	 */
	public static double quad2(double a, double b, Problem p) {
		return ( (b-a) * ( ( p.f(a) + 2 * p.f((a+b) / 2) + p.f(b) ) / 4 ) );
	}
	
	/**
	 * Interpolation function: polynomial of degree 2 (Cavalieri)
	 * 
	 * @param a left bound of the interval
	 * @param b right bound of the interval
	 * @param p the Problem
	 * 
	 * @return the approximate value of the integral in [a,b] interval
	 */
	public static double quad3(double a, double b, Problem p){
		return ( (b-a) * ( ( p.f(a) + 4 * p.f((a + b) / 2) + p.f(b) ) / 6 ) );
	}
}
