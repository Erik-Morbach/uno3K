package entity;

import enums.CardColor;

public class CommonCard extends Card {
	private Integer number;


    public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public CommonCard(Integer number, CardColor color) {
		super(color);
		this.number = number;
	}

//	public String toString(){
//        return this.color + String.valueOf(number) + this.color.RESET; 
	//should be
	// return this.color + String.valueOf(number) + CardColor.RESET;
//    }
}
