package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
	
	void testeAcessos() {
//		segredo
//		facoDentroDeCasa
//		formaDeFalar
//		todosSabem
		//Ana mae = new Ana(); //Instancia
		
		//System.out.println(mae.segredo);
		//System.out.println(facoDentroDeCasa);
		System.out.println(formaDeFalar); //protected por herança
		System.out.println(todosSabem);
		System.out.println(new Ana().todosSabem);
	}

}
