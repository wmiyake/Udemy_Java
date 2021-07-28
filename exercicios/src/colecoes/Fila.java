package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
public static void main(String[] args) {
	Queue<String> fila = new LinkedList<>();
	
	//Offer e Add --> Adicona elementos na fila
	//Diferença é o comportamento ocorre quando a fila está cheia !
	fila.add("Ana");// Retorna False
	fila.offer("Bia"); //Lança uma exceção
	fila.add("Carlos");
	fila.offer("Daniel");
	fila.add("Rafaela");
	fila.offer("Gui");
	
	//Peek e Element --> Obtem o proximo elementos na fila sem remover
	//Diferença é o comportamento ocorre quando a fila está Vazia !
	System.out.println(fila.peek());//Retorna NULL
	System.out.println(fila.peek()); 
	System.out.println(fila.element()); //Lança uma exceção
	System.out.println(fila.element()); 
	
	
	//Poll e Remove -> Obter o proximo elemento da Fila
	//e remove
	//Diferença é o comportamento ocorre quando a fila está Vazia !
	System.out.println(fila.poll()); //Retorna NULL
	System.out.println(fila.remove());//Lança uma Exceção
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
