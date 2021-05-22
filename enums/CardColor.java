package enums;

public enum CardColor {
        RED("VERMELHO"), 
        GREEN("VERDE"), 
        YELLOW("AMARELO"), 
        BLUE("AZUL"); 
        
		public String getValue() { return value; }

		private final String value;
		
		CardColor(String string) { 
			value = string;
			// TODO Auto-generated constructor stub 
		}
}