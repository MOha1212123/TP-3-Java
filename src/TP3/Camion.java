package TP3;

public class Camion extends Vehicule {

	private double chargeMax;
	
	public Camion(String matricule,String marque,double ChargeMax){
		super(matricule, marque);
	    this.chargeMax=ChargeMax;
	}
	
	
	public double getChargeMax() { 
		return chargeMax; 
		}
	

	
	@Override
	 public void stationner() {
		System.out.println("Le camion se gare dans une zone pour Véhicules lourds");
	}
	
	@Override
	 public void afficher() {
		super.afficher();
		System.out.println("Charge maximale : " + chargeMax + " tonnes");
	}
		
	
}
