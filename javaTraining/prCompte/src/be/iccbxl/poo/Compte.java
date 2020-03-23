package be.iccbxl.poo;

public class Compte {
	/**
	 * Représente un numero de compte 
	 */
	//Attributs
	private int numero;
	/**
	 * Définit le type de compte bancaire 
	 * 'C' pour un compte commun
	 * 'J' pour un compte joint 
	 */
	private char type;
	/**
	 * représente le montant disponible dans le compte bancaire. 
	 */
	private double solde;
	/**
	 * 
	 */
	
	//Constructeurs
	/**
	 * cree un objet de type compte en demandant à l'utilisateur d'entrer le numero et le type du compte au clavier 
	 * le solde sera defini à zero. 
	 * @throws inutMismatchException si utilisateur n'entre pas un entier
	 */
	public Compte() {
		
	}
	
	public Compte(int numero, char type) {
		this.numero = numero;
		this.type = type;
		this.solde = 0;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public char getType() {
		return type;
	}
	public void setType(char type) {
		this.type = type;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	private boolean testType() {
		return type=='J' || type=='C';
	}
	
}
