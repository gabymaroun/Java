package inassGaby.beans;

/*
  La classe CarteJouee permet de savoir quelle carte a été jou�e 	
  par quel joueur.
 */
public class CarteJouee {
	final private Joueur joueur;
	final private Carte carte;

	public CarteJouee(final Joueur joueur, final Carte carte) {
		this.joueur = joueur;
		this.carte = carte;
	}

	public Joueur getJoueur() {
		return this.joueur;
	}

	public Carte getCarte() {
		return this.carte;
	}

}