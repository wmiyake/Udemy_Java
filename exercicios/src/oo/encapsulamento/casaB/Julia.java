package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {
	
	void testeAcessos() {
	    Ana sogra = new Ana(); //Instancia
		
		//System.out.println(sogra.segredo);
		//System.out.println(sogra.facoDentroDeCasa);
		//System.out.println(sogra.formaDeFalar); //protected por heran?a
		System.out.println(sogra.todosSabem);
	
	}

}
