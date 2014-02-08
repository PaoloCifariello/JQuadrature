package quadrature.fun;


public class Function4 implements Problem {

	public double a() {
		return 0;
	}

	public double b() {
		return 1;
	}

	public double exactIntegral() {
		return 1.11111111111111111111111111111;
	}

	public double f(double x) {
		return Math.pow(x, -1./10.);
	}
}
