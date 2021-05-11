public class Principal {
    
    public static void main(String[] args){
		Principal.engine((int x, int y) -> x + y);
		Principal.engine((int x, int y) -> x * y);
		Principal.engine((int x, int y) -> x / y);
		Principal.engine((int x, int y) -> x - y);
		Principal.engine((int x, int y) -> x % y);
                
        Principal.engine((long x, long y) -> x + y);
		Principal.engine((long x, long y) -> x * y);
		Principal.engine((long x, long y) -> x / y);
		Principal.engine((long x, long y) -> x - y);
		Principal.engine((long x, long y) -> x % y);
    }               
	
	//Sobrecarga de Métodos
	private static void engine(CalculadoraInt cal){
		int x=2, y=4;

		try{
			int resultado = cal.calcular(x, y);
		System.out.println("resultado Int= " + resultado);
		
		}catch(ArithmeticException e)
		{
			y=0;
			System.out.println("¡ERROR! No puedes dividir entre 0");
		}	
	}

	private static void engine(CalculadoraLong cal){
		long x=2, y=0;
		try{
		long resultado= cal.calcular(x, y);
		System.out.println("resultado Long=" + resultado);
		}catch(ArithmeticException e)
		{
			y=0;
			System.out.println("¡ERROR! No puedes dividir entre 0");
		}	
        }
}