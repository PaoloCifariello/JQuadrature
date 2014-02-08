package quadrature.fun;


public class Function14 implements Problem {

	public double a() {
		return -1;
	}

	public double b() {
		return 6./5.;
	}

	public double exactIntegral() {
		return -1.74856729301010065959428374294;
	}

	public double f(double x) {
		if (x <= 1) return ( - Math.exp(x) );
		
		return Math.exp(x) ;
	}
}