package quadrature.fun;

import java.util.HashMap;

/**
 * This class contains functions to integrate
 * 
 * @authors Giada Fallo, Paolo Cifariello
 * 
 */
public class Integrand {

	private static HashMap<String,Problem> Integrands = new HashMap<String,Problem>();
	
	/*
	 * Constructor
	 * 
	 */
	public static void ImportFunctions(){
		Integrands.put("Function1", new Function1());
		Integrands.put("Function2", new Function2());
		Integrands.put("Function3", new Function3());
		Integrands.put("Function4", new Function4());
		Integrands.put("Function5", new Function5());
		Integrands.put("Function6", new Function6());
		Integrands.put("Function7", new Function7());
		Integrands.put("Function8", new Function8());
		Integrands.put("Function9", new Function9());
		Integrands.put("Function10", new Function10());
		Integrands.put("Function11", new Function11());
		Integrands.put("Function12", new Function12());
		Integrands.put("Function13", new Function13());
		Integrands.put("Function14", new Function14());
	}
	
	/**
	 * Get the problem idetified by name
	 * 
	 * @param name name of problem to get
	 * @return Problem identified by name passed
	 * @throws IllegalArgumentException passed string does not correspond to a Problem
	 */
	public static Problem getProblem(String name) {
		if ( Integrands.containsKey(name) )
			return Integrands.get(name);
		
		throw new IllegalArgumentException("Unknown name " + name);
	}
	
}
