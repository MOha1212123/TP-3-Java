package TP3;

public class TestParking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicule[] v = new Vehicule[4];
		
        v[0] = new Voiture("456-DEF", "Peugeot", 3);

		v[1] = new Voiture("123-ABC", "Renault", 5);
		v[2] = new Moto("456-DEF", "Peugeot", true);
		v[3] = new Camion( "012-JKL", "Mercedes", 18.5);
		
		
		System.out.println("=== Tous les véhicules ===");
        for (Vehicule veh : v) {
            veh.afficher();
            veh.stationner();
            System.out.println();
        }
        
        System.out.println("=== Seulement les voitures ===");
        for (Vehicule veh : v) {
            if (veh instanceof Voiture) {
                veh.afficher();
                System.out.println();
            }
        }
        
        Vehicule x = new Moto("11C22", "Yamaha", true);
        if (x instanceof Voiture) {
            Voiture v1 = (Voiture) x;
            System.out.println("Downcasting réussi !");
        } else {
            System.out.println("Erreur : x n'est pas une Voiture.");
        }
	}
}
