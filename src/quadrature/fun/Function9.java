package quadrature.fun;


public class Function9 implements Problem {

	public double a() {
		return 1./4.;
	}

	public double b() {
		return 1;
	}

	public double exactIntegral() {
		return 2.31745428099294922525049446574;
	}

	public double f(double x) {
		return Math.pow( ( Math.pow( ( 3./20. ), 2. ) + ( 1. - Math.pow(x, 2.) )  ), -1. );
	}
}
