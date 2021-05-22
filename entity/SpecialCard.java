package entity;

import enums.CardColor;
import enums.Special;

public class SpecialCard extends Card {
    private Special special;

	public SpecialCard(Special special) {
		super(CardColor.BLACK);
		this.special = special;
	}

	public Special getSpecial() {
		return special;
	}

	public void setSpecial(Special special) {
		this.special = special;
	}

    // public String toString(){
    //     if(statusEffect == StatusEffect.SWAP_ORIENTATION)
    //         return this.color + "<->" + Color.RESET;

    //     string prefix = this.color;
    //     switch(this.plusEffect){
    //         case PlusEffect.NOTHING:
    //             return prefix + "Choose" +  Color.RESET;
    //         case PlusEffect.PLUS2:
    //             return prefix + "+2" + Color.RESET;
    //         case plusEffect.PLUS4:
    //             return prefix + "+4" + Color.RESET;
    //     }
    //     return "";
    // }

}
