package TP3;

public class Vehicule {

	protected String matricule;
	protected String marque;
	
	public Vehicule(String matricule, String marque) {
		this.matricule=matricule;
		this.marque=marque;
	}
	
	public void stationner() {
		System.out.println("La véhicule se gare dans le parking");
	}

	public void afficher() {
	
		System.out.println("matricule : "+matricule);
		System.out.println("marque : "+marque);
	}
	
	

}
