package inassGaby.data;

import inassGaby.data.Joueur;
import inassGaby.data.Partie;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-23T04:14:43")
@StaticMetamodel(Statistique.class)
public class Statistique_ { 

    public static volatile SingularAttribute<Statistique, Partie> idPartie;
    public static volatile SingularAttribute<Statistique, Integer> nbrPrisesAtout;
    public static volatile SingularAttribute<Statistique, Integer> nbrAnnonces;
    public static volatile SingularAttribute<Statistique, Joueur> idJoueur;
    public static volatile SingularAttribute<Statistique, Integer> nbrCapots;
    public static volatile SingularAttribute<Statistique, Integer> idStats;

}