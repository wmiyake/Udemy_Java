package fundamentos;

public class Temperatura {
public static void main(String[] args) {
	//(F - 32) X 5/9 = C;
	final double FATOR = 5.0 / 9.0;
    final double AJUSTE = 32;
    
    double fahrenheit = 86; 
    double celsius = (fahrenheit - AJUSTE) * FATOR;
    System.out.println("O resultado � " + celsius + " C");
    
    fahrenheit = 150;
    celsius = (fahrenheit - AJUSTE) * FATOR;
    System.out.println("O resultado � " + celsius + " C");
    
    var a = 7;
    a = 9;
    int b = 8;
    b = 9;
    
    double soma = a + b;
    		
    System.out.println(soma);
}
}
