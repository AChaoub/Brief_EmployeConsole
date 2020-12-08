package com.employeConsole.app;

public class Opticienne extends Personne {

	public Opticienne(String nom, int age) {
		super(nom, age);

	}
	
	@Override
	public void afficher() {
		super.afficher();
		System.out.print(" et je travaille en tant que opticienne !\n");
	}

	
}
