package fizzfuzz;

public final class Concatenator {
	
	private NumberTransform _numberTransform;
	private NumberRule _rule;

	public Concatenator(NumberRule rule,NumberTransform numberTransform) {
		_rule = rule;
		_numberTransform = numberTransform;
	}

	public void concatValueNumberIn(StringBuffer buffer, Integer number) {
		if (_rule.numberFulfillRule(number, _numberTransform.number))
		    buffer.append(_numberTransform.toWord);
	}
}
