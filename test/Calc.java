package test;

public class Calc {


	public int add( int zahl1, int zahl2) {
		int ergebnis = zahl1 + zahl2;
		return ergebnis;		
	}
	
	public int sub( int zahl1, int zahl2) {
		int ergebnis = zahl1 - zahl2;
		return ergebnis;		
	}	
	
	public int multi( int zahl1, int zahl2) {
		int ergebnis = zahl1 * zahl2;
		return ergebnis;		
	}	
	
	public int divide( int zahl1, int zahl2) {
		if(zahl2 == 0) throw new ArithmeticException("Keine Null!");
		int ergebnis = zahl1 / zahl2;
		return ergebnis;		
	}	
}