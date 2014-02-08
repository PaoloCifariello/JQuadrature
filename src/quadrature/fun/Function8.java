package quadrature.fun;


public class Function8 implements Problem {

	public double a() {
		return 1./4.;
	}

	public double b() {
		return 1;
	}

	public double exactIntegral() {
		return 5.04314505090651871083753862097;
	}

	public double f(double x) {
		return Math.pow( 1. - ( 9999./10000. ) * Math.pow(x, 2.), -1. );
	}
}