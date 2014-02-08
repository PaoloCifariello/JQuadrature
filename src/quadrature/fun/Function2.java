package quadrature.fun;


public class Function2 implements Problem {

	public double a() {
		return 0;
	}

	public double b() {
		return 1; 
	}

	public double exactIntegral() {
		return 0.00176486800784079347630733386366;
	}

	public double f(double x) {
		return Math.exp( -2 * Math.PI * x) * Math.sin( 180 * Math.PI * x );
	}
}
