package fizzfuzz;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public final class ConcatenatorTest {
	
	private StringBuffer _buffer;
	private Concatenator _concatenator;
	
	@Before public void setUp(){
		_buffer = new StringBuffer("existWord");
		_concatenator = new Concatenator(new DivisibleRule(),
				                         new NumberTransform(3, new StringBuffer("-fizz")));
	}
		
	
	@Test public void whenNumberIsDivisible(){
		_concatenator.concatValueNumberIn(_buffer,3);
		assertEquals(_buffer.toString(),"existWord-fizz");
		
	}
	
	@Test public void whenNumberIsNotDivisible(){
		_concatenator.concatValueNumberIn(_buffer,11);
		assertEquals(_buffer.toString(),"existWord");	
	}
}
