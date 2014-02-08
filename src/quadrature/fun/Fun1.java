package quadrature.fun;

public class Fun1 implements Problem {

	public double a() {
		return 0;
	}

	public double b() {
		return 1;
	}

	public double exactIntegral() {
		return 0;
	}

	public double f(double x) {
		return Math.pow( x, -1/4 ) * ( ( 3/4 ) * Math.cos( Math.log(x) ) - Math.sin( Math.log(x) ) );
	}
	
}
