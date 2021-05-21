package enums;

public enum Orientation{
    CLOCK_WISE(true), COUNTER_CLOCK_WISE(false);
	private final boolean value;
	Orientation(boolean b) {
		value = b;
	}
	public boolean getValue() {
		return value;
	}
}