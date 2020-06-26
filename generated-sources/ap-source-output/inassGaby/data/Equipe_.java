package inassGaby.data;

import inassGaby.data.Joueur;
import inassGaby.data.Partie;
import inassGaby.data.Score;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-23T04:14:43")
@StaticMetamodel(Equipe.class)
public class Equipe_ { 

    public static volatile CollectionAttribute<Equipe, Score> scoreCollection;
    public static volatile SingularAttribute<Equipe, Integer> idEquipe;
    public static volatile CollectionAttribute<Equipe, Partie> partieCollection;
    public static volatile SingularAttribute<Equipe, Joueur> idJoueur1;
    public static volatile SingularAttribute<Equipe, Joueur> idJoueur2;
    public static volatile CollectionAttribute<Equipe, Partie> partieCollection1;

}