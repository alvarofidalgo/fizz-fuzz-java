package fizzfuzz;

import java.util.ArrayList;
import java.util.List;

public final class ConcatenatorsConfigurer {
	
	
	private List<Concatenator> _concatenators= new ArrayList<Concatenator>();
		
	public ConcatenatorsConfigurer buildRule(NumberRule numberRule,Integer number,String transformTo){
		NumberTransform numberTransform = new NumberTransform(number,new StringBuffer(transformTo));
		_concatenators.add(new Concatenator(numberRule, numberTransform));
		return this;
	}
	
	public List<Concatenator> concatenators(){
		  return _concatenators;
	}
}
