import bridge.DefaultMCF;
import bridge.PrintMorseCode;
import bridge.TestMCF;

public class MorseMain {
	public static void main(String[] args) {
		PrintMorseCode printMorseCode = new PrintMorseCode(new DefaultMCF());
		printMorseCode.l().o().h().a().n();
		
		PrintMorseCode printMorseCode1 = new PrintMorseCode(new TestMCF());
		printMorseCode1.l().o().h().a().n();
	}
}
