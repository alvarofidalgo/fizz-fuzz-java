package fizzfuzz;

public final class MagicNumber implements NumberRule {
	
	public boolean numberFulfillRule(Integer number, Integer numberRule) {
		return number.equals(numberRule);
	}
}
