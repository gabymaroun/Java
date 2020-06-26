package inassGaby.beans;

import java.util.Date;

/*
 Une partie est faite de plusieurs donnes.
 */
public class Partie {

	private int id;

	private Equipe equipe1;
	private Equipe equipe2;
	private Equipe equipeVainqueur; // = equipe 1 | equipe2;

	private Date datePartie;

}