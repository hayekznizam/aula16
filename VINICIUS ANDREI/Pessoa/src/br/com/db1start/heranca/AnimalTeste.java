package br.com.db1start.heranca;

public class AnimalTeste {

	public void ExemploTest() {

		Galinha galinha = new Galinha();
		galinha.respirar();
		Animal galinha2 = new Galinha();
		// nem todo animal é galinha galinha galinha3 = new Animal();
		Peixe peixe = new Peixe();
		peixe.respirar();
		peixe.nadar();
		// Animal tilapia = new Tilapia();
		Tilapia tilapia = new Tilapia();
		tilapia.nadar();
		tilapia.respirar();
		

	}
}
