package quadrature.fun;

public class Exp implements Problem{

	public double a() {
		return -1;
	}

	public double b() {
		return Math.PI/2;
	}

	public double exactIntegral() {
		return 0;
	}

	public double f(double x) {
		if (x <= 0) return (- Math.exp(x));
		return (Math.exp(x));
	}

	
}
