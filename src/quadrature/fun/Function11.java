package quadrature.fun;


public class Function11 implements Problem {

	public double a() {
		return 0;
	}

	public double b() {
		return 1;
	}

	public double exactIntegral() {
		return 0.200000000000000000000000000000;
	}

	public double f(double x) {
		return ( x * (-8./10.) * Math.log(x)  ) ;
	}
}