package quadrature.fun;


public class Cosin implements Problem {

	public double a() {
		return 0;
	}

	public double b() {
		return Math.PI / 4;
	}

	public double exactIntegral() {
		return 1;
	}

	public double f(double x) {
		return ( 1 / ( Math.pow(Math.cos(x), 2) ) ) ;
	}
}
