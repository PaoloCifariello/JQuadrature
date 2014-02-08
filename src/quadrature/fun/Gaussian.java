package quadrature.fun;


public class Gaussian implements Problem {

	public double a() {
		return -1;
	}

	public double b() {
		return 1;
	}

	public double exactIntegral() {
		return 1.49365;
	}

	public double f(double x) {
		return Math.exp( - ( Math.pow(x, 2) ) );
	}
}
