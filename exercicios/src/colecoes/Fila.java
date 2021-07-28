package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
public static void main(String[] args) {
	Queue<String> fila = new LinkedList<>();
	
	//Offer e Add --> Adicona elementos na fila
	//Diferen�a � o comportamento ocorre quando a fila est� cheia !
	fila.add("Ana");// Retorna False
	fila.offer("Bia"); //Lan�a uma exce��o
	fila.add("Carlos");
	fila.offer("Daniel");
	fila.add("Rafaela");
	fila.offer("Gui");
	
	//Peek e Element --> Obtem o proximo elementos na fila sem remover
	//Diferen�a � o comportamento ocorre quando a fila est� Vazia !
	System.out.println(fila.peek());//Retorna NULL
	System.out.println(fila.peek()); 
	System.out.println(fila.element()); //Lan�a uma exce��o
	System.out.println(fila.element()); 
	
	
	//Poll e Remove -> Obter o proximo elemento da Fila
	//e remove
	//Diferen�a � o comportamento ocorre quando a fila est� Vazia !
	System.out.println(fila.poll()); //Retorna NULL
	System.out.println(fila.remove());//Lan�a uma Exce��o
	System.out.println(fila.poll());  
	System.out.println(fila.poll());  
	System.out.println(fila.poll());  
	System.out.println(fila.poll());  
	System.out.println(fila.poll());  
	System.out.println(fila.poll());  
	System.out.println(fila.remove());
	
	//fila.size();
	//fila.clear();
	//fila.isEmpty();
	//fila.contains(...);	
}
}
