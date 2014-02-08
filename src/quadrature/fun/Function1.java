package quadrature.fun;


public class Function1 implements Problem {

	public double a() {
		return 0;
	}

	public double b() {
		return 1; 
	}

	public double exactIntegral() {
		return 0.166666666666666666666666666667;
	}

	public double f(double x) {
		return ( x + 1/2 ) * ( Math.pow(x, 2) - 1/4 ) ;
	}
}
