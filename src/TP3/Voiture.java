package TP3;

public class Voiture extends Vehicule{

	
	private int nbPortes;
	
	public Voiture(String matricule, String marque,int nbPortes) {

		super(matricule, marque);
		this.nbPortes=nbPortes;
	}
	
	public void SetVoiture(int nbPortes) {
		this.nbPortes=nbPortes;
	}
	
	public int getnbPortes() { 
		return nbPortes; 
		}

	
	

	@Override
	 public void stationner() {
		System.out.println("La Voiture se gare dans une place standard");
	}
	
	@Override
	 public void afficher( ) {
		super.afficher();
		System.out.println("Nb :"+nbPortes);
	}
	

}
