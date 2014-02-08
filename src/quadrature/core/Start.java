package quadrature.core;
import quadrature.fun.*;

/**
 * 
 * @author Paolo Cifariello, Giada Fallo
 *
 */

public class Start {

	public static void main(String[] args) {

		Integrand.ImportFunctions();

		( new Engine(
			"Function1", 1E-6, 10000 , EnumRules.Trapezoidal,  "Stampe\\Function1.txt" ) ).integrate();
		
		( new Engine(
			"Function1", 1E-6, 10000 , EnumRules.Cavalieri ,  "Stampe\\Function1.txt" ) ).integrate();
		
		
		( new Engine(
			"Function2", 1E-10, 10000 , EnumRules.Trapezoidal, "Stampe\\Function2.txt") ).integrate();
	
		( new Engine(
			"Function2", 1E-10, 10000 , EnumRules.Cavalieri, "Stampe\\Function2.txt") ).integrate();
	

		( new Engine(
			"Function3", 1E-8, 10000 , EnumRules.Trapezoidal, "Stampe\\Function3.txt") ).integrate();

		( new Engine(
			"Function3", 1E-8, 10000 , EnumRules.Cavalieri, "Stampe\\Function3.txt") ).integrate();
		
	
		( new Engine(
			"Function4", 1E-4, 10000 , EnumRules.Trapezoidal, "Stampe\\Function4.txt") ).integrate();
		
		( new Engine(
			"Function4", 1E-4, 10000, EnumRules.Cavalieri, "Stampe\\Function4.txt") ).integrate();
	
		
		( new Engine(
			"Function5", 1E-1, 50000 , EnumRules.Trapezoidal, "Stampe\\Function5.txt") ).integrate();
	
		( new Engine(
			"Function5", 1E-1, 50000 , EnumRules.Cavalieri, "Stampe\\Function5.txt") ).integrate();
	

		( new Engine(
			"Function6", 1E-8, 10000 , EnumRules.Trapezoidal, "Stampe\\Function6.txt") ).integrate();

		( new Engine(
			"Function6", 1E-8, 10000 , EnumRules.Cavalieri, "Stampe\\Function6.txt") ).integrate();

	
		
		( new Engine(
			"Function7", 1E-8, 50000 , EnumRules.Trapezoidal, "Stampe\\Function7.txt") ).integrate();
		
		( new Engine(
			"Function7", 1E-8, 50000 , EnumRules.Cavalieri, "Stampe\\Function7.txt") ).integrate();
	
		
		( new Engine(
			"Function8", 1E-5, 10000 , EnumRules.Trapezoidal, "Stampe\\Function8.txt") ).integrate();
			
		( new Engine(
			"Function8", 1E-5, 10000 , EnumRules.Cavalieri, "Stampe\\Function8.txt") ).integrate();
	
		
		( new Engine(
			"Function9", 1E-6, 10000 , EnumRules.Trapezoidal, "Stampe\\Function9.txt") ).integrate();
				
		( new Engine(
			"Function9", 1E-6, 10000 , EnumRules.Cavalieri, "Stampe\\Function9.txt") ).integrate();
		
		
		( new Engine(
			"Function10", 1E-5, 100000 , EnumRules.Trapezoidal, "Stampe\\Function10.txt") ).integrate();
			
		( new Engine(
			"Function10", 1E-5, 100000 , EnumRules.Cavalieri, "Stampe\\Function10.txt") ).integrate();

		
		( new Engine(
			"Function11", 1E-5, 100000 , EnumRules.Trapezoidal, "Stampe\\Function11.txt") ).integrate();
				
		( new Engine(
			"Function11", 1E-5, 100000 , EnumRules.Cavalieri, "Stampe\\Function11.txt") ).integrate();
		
		( new Engine(
			"Function12", 1E-6, 10000 , EnumRules.Trapezoidal, "Stampe\\Function12.txt") ).integrate();
				
		( new Engine(
			"Function12", 1E-6, 10000 , EnumRules.Cavalieri, "Stampe\\Function12.txt") ).integrate();
		
		( new Engine(
			"Function13", 1E-10, 10000 , EnumRules.Trapezoidal, "Stampe\\Function13.txt") ).integrate();
					
		( new Engine(
			"Function13", 1E-10, 10000 , EnumRules.Cavalieri, "Stampe\\Function13.txt") ).integrate();
		
		( new Engine(
			"Function14", 1E-6, 10000 , EnumRules.Trapezoidal, "Stampe\\Function14.txt") ).integrate();
			
		( new Engine(
			"Function14", 1E-6, 10000 , EnumRules.Cavalieri, "Stampe\\Function14.txt") ).integrate();
		
	}
}