
public class Calcapp {
	
	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		
		System.out.println( "Suma" );
		System.out.println( calc.suma("20.3", "33.44", "2.0", "77.88", "41.32") );
		
		System.out.println( "Suma" );
		System.out.println( calc.suma( 2, 2 ) );
		
		System.out.println( "Suma" );
		System.out.println( calc.suma( 2, 2, 2 ) );
		
		System.out.println( "Suma" );
		System.out.println( calc.suma( 2.2, 2.3 ) );
		
		System.out.println( "Suma" );
		System.out.println( calc.suma( 2.2, 2.3, 2.4 ) );
		
	}

}
