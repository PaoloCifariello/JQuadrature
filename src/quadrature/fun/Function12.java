package quadrature.fun;


public class Function12 implements Problem {

	public double a() {
		return 0;
	}

	public double b() {
		return 13./8.;
	}

	public double exactIntegral() {
		return -1.91875226827858472103183564447;
	}

	public double f(double x) {
		return Math.log(Math.abs(1-x)) ;
	}
}