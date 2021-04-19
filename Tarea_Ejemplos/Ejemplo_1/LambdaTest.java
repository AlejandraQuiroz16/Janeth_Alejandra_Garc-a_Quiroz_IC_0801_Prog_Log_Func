
package functiontest;

public class LambdaTest {
    public static void main(String[] args){
	//Expresión lambda ==> represena un objeto de una interfaz funcional 
	FunctionTest ft=() -> System.out.println("Hola Mundo"); // Implementación del método abstracto "saludar()"
								// de la Interfaz Funcional  
	ft.saludar();
	}
}