package quadrature.fun;


public class Function13 implements Problem {

	public double a() {
		return 0;
	}

	public double b() {
		return 1;
	}

	public double exactIntegral() {
		return 0.00289590001524157902758725803993;
	}

	public double f(double x) {
		return Math.pow( (x - 1./3.) , 8.) ;
	}
}