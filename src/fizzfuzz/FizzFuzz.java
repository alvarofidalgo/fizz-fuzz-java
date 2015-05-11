package fizzfuzz;

public final class FizzFuzz {
			
	private ConcatenatorsConfigurer _configurer;
	
	public FizzFuzz(ConcatenatorsConfigurer configurer){
		_configurer = configurer;
	}
		
	public String trabsformToStringWith(int number) {		
		StringBuffer returning = new StringBuffer();
		for (Concatenator concatenator:_configurer.concatenators())
			concatenator.concatValueNumberIn(returning, number);		
		return returning.toString();
	}
}
