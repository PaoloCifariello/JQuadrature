package quadrature.fun;


public class Function5 implements Problem {

	public double a() {
		return 1./100.;
	}

	public double b() {
		return 1;
	}

	public double exactIntegral() {
		return 2.22222222000000000000000000000E8;
	}

	public double f(double x) {
		return Math.pow(x, -11./2.);
	}
}
