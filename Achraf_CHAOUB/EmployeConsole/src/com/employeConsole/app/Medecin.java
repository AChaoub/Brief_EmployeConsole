package com.employeConsole.app;

public class Medecin extends Personne{

	public Medecin(String nom, int age) {
		super(nom, age);
	}
	
	
	@Override
	public void afficher(){
		super.afficher();
		System.out.print(" et je travaille en tant que médecin !\n") ;
	}
	
	

}
