package quadrature.fun;


public class Function7 implements Problem {

	public double a() {
		return 0;
	}

	public double b() {
		return (5./2.)*Math.PI;
	}

	public double exactIntegral() {
		return 0.7151159002524090129933644175119180000954;
	}

	public double f(double x) {
		return x * 2 * Math.sin( Math.pow(x, 3) );
	}
}