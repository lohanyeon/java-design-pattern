package bridge;

public class PrintMorseCode extends MorseCode {
	
	public PrintMorseCode(MorseCodeFunction morseCodeFunction) {
		super(morseCodeFunction);
		// TODO Auto-generated constructor stub
	}
	//lohan
	public PrintMorseCode l( ) {
		dash();dash();dot();space();
		return this;
	}
	public PrintMorseCode o() {
		dash();dash();dot();space();
		return this;
	}
	public PrintMorseCode h() {
		dot();dash();dash();dot();space();
		return this;
	}
	public PrintMorseCode a() {
		dash();dash();dot();space();
		return this;
	}
	public PrintMorseCode n() {
		dot();dash();dash();dot();space();
		return this;
	}

}
