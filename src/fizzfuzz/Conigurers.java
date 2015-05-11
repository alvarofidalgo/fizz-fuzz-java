package fizzfuzz;

public final class Conigurers {
		
	public ConcatenatorsConfigurer deafult(){
		return  new  ConcatenatorsConfigurer().
		                     buildRule(new DivisibleRule(),3,"fizz").
		                     buildRule(new DivisibleRule(),5,"fuzz").
		                     buildRule(new MagicNumber(), 13, "magiNumber");		
	}
}
