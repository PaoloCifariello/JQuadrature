package quadrature.fun;

public class Function3 implements Problem {

	public double a() {
		return 0;
	}

	public double b() {
		return 1;
	}

	public double exactIntegral() {
		return 0.909090909090909090909090909091;
	}

	public double f(double x) {
		return Math.pow( x, 1./10. ) ;
	}
	
}
