package enums;

public enum Action{
    DISCART(1), BUY_IT(2);
	public int getValue() { return value; }

	private final int value;
	Action(int i) {
		value = i;
		// TODO Auto-generated constructor stub
	}
}