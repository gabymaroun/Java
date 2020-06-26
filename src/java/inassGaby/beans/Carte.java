package inassGaby.beans;

public class Carte {

	private String nom;
	private Couleur couleur;
	private String image;
	private int valeurNormale;
	private int valeurAtout;

	/**
	 * Création d'une carte
	*/
	public Carte(final Couleur couleur, final int indice) throws Exception {
		this.couleur = couleur;

		switch (indice) {
		case 0:
			init("As", couleur + "-as.png", 11, 11);
			break;
		case 1:
			init("Roi", couleur + "-roi.png", 4, 4);
			break;
		case 2:
			init("Dame", couleur + "-dame.png", 3, 3);
			break;
		case 3:
			init("Valet", couleur + "-valet.png", 2, 20);
			break;
		case 4:
			init("10", couleur + "-10.png", 10, 10);
			break;
		case 5:
			init("9", couleur + "-9.png", 0, 14);
			break;
		case 6:
			init("8", couleur + "-8.png", 0, 0);
			break;
		case 7:
			init("7", couleur + "-7.png", 0, 0);
			break;
		default:
			throw new Exception("La carte demand�e n'existe pas.");
		}
	}

	
	private void init(final String nom, final String image,
			final int valeurNormale, final int valeurAtout) {
		this.nom = nom;
		this.image = image;
		this.valeurNormale = valeurNormale;
		this.valeurAtout = valeurAtout;
	}

	/*les Getters */

	public String getNom() {
		return nom;
	}

	public String getImage() {
		return image;
	}

	public int getValeurNormale() {
		return valeurNormale;
	}

	public int getValeurAtout() {
		return valeurAtout;
	}

	public Couleur getCouleur() {
		return couleur;
	}
}