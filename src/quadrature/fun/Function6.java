package quadrature.fun;


public class Function6 implements Problem {

	public double a() {
		return 0;
	}

	public double b() {
		return 1;
	}

	public double exactIntegral() {
		return 0.153846153846153846153846153846;
	}

	public double f(double x) {
		return Math.pow(x, 11./2.);
	}
}