package enums;

public enum CardColor {
        BLACK("\u001B[30m"), RED("\u001B[31m"), GREEN("\u001B[32m"), 
        YELLOW("\u001B[33m"), BLUE("\u001B[34m"), RESET("\u001B[35m");
		public String getValue() { return value; }

		private final String value;
		CardColor(String string) { 
			value = string;
			// TODO Auto-generated constructor stub 
		}
}