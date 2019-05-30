package bridge;

public class MorseCode {
	
	private MorseCodeFunction morseCodeFunction;
	
	public MorseCode(MorseCodeFunction morseCodeFunction) {
		this.morseCodeFunction = morseCodeFunction;
	}
	
	public void setMorseCodeFunction(MorseCodeFunction morseCodeFunction) {
		this.morseCodeFunction = morseCodeFunction;
	}


	public void dot() {
		morseCodeFunction.dot();
		//System.out.print(".");
	}
	
	public void dash() {
		morseCodeFunction.dash();
		//System.out.print("-");
	}
	
	public void space() {
		morseCodeFunction.space();
		//System.out.print(" ");
	}

}
