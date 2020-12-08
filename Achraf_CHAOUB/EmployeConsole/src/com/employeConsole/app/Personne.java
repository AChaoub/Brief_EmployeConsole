package com.employeConsole.app;

public abstract class Personne {
	
	private String nom;
	private int age ; 
	 
	public Personne(String nom , int age) {
		
		this.nom = nom;
		this.age = age;
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	public void afficher() {
		System.out.print( "Je suis "+getNom()+" , j’ai "+getAge()+" ans ");
	}
	
	
	
	
}
