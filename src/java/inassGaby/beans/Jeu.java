package inassGaby.beans;

import java.util.ArrayList;
import java.util.List;


 /* la classe Jeu permet de créer le jeu complet de carte*/				

public class Jeu {

	
	 /* Création de toutes les cartes d'une même couleur pour les ajouter dans une liste*/
        
	
	private static List<Carte> getCarteCouleur(final Couleur couleur) {
		final List<Carte> cartes = new ArrayList<Carte>();
		for (int i = 0; i < 8; i++) {
			try {
				Carte carte = new Carte(couleur, i);
				cartes.add(carte);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return cartes;
	}

	/* on retourne la liste des cartes d'une même couleur*/
        
	public static List<Carte> getAllCartes() {
		final List<Carte> cartes = new ArrayList<Carte>();

		cartes.addAll(getCarteCouleur(Couleur.pique));
		cartes.addAll(getCarteCouleur(Couleur.trefle));
		cartes.addAll(getCarteCouleur(Couleur.carreau));
		cartes.addAll(getCarteCouleur(Couleur.coeur));

		return cartes;
	}

}
