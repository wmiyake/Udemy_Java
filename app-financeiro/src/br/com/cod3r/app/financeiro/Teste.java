package br.com.cod3r.app.financeiro;

import java.lang.reflect.Field;

import br.com.cod3r.app.calculo.CalculadoraImpl;
import br.com.cod3r.app.calculo.interno.OperacoesAritmeticas;

public class Teste {

	public static void main(String[] args) {
		
		CalculadoraImpl calc = new CalculadoraImpl();
		System.out.println(calc.soma(2, 3, 4));
		
		OperacoesAritmeticas op = new OperacoesAritmeticas();
		System.out.println(op.soma(4, 5, 6));
		
		System.out.println(CalculadoraImpl.class.getName());
		System.out.println(CalculadoraImpl.class.getDeclaredFields()[0].getName());
		
		try {
			Field fieldId = CalculadoraImpl.class.getDeclaredFields()[0];
			fieldId.setAccessible(true);
			System.out.println(fieldId.get(calc));
			fieldId.set(calc, "def");
			System.out.println(fieldId.get(calc));
			fieldId.setAccessible(false);
			
			System.out.println("Metodo recuperado por Getter & Setter => " + calc.getId());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		Calc c1 = new Calc1();
//		Calc c2 = new Calc2();
//		
//		System.out.println(c1.soma(1, 2, 3));
//		System.out.println(c2.soma(1, 2, 3));
	}
}
