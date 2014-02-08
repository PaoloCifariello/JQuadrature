package quadrature.fun;

/**
 * This interface defines a Problem
 * 
 * A Problem has two bounds (a and b)
 * the exact value of its Integral in that interval 
 * and the function
 * 
 * @authors Paolo Cifariello, Giada Fallo
 * 
 */
public interface Problem {
	
	double a();
	double b();
	double exactIntegral();
	double f(double x);
}
