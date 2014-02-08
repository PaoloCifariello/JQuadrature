package quadrature.fun;


public class Function10 implements Problem {

	public double a() {
		return 0;
	}

	public double b() {
		return 1;
	}

	public double exactIntegral() {
		return -0.250000000000000000000000000000;
	}

	public double f(double x) {
		return ( x * Math.log(x) );
	}
}

