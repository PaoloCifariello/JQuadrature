package quadrature.fun;


public class CscTan implements Problem {

	public double a() {
		return - Math.PI / 4;
	}

	public double b() {
		return Math.PI / 4;
	}

	public double exactIntegral() {
		return -0.268996;
	}

	public double f(double x) {
		return Math.tan(x) / Math.sin( Math.exp(x) ) ;
	}
}
