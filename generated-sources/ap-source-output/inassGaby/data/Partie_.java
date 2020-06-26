package inassGaby.data;

import inassGaby.data.Equipe;
import inassGaby.data.Score;
import inassGaby.data.Statistique;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-23T04:14:43")
@StaticMetamodel(Partie.class)
public class Partie_ { 

    public static volatile SingularAttribute<Partie, Integer> idPartie;
    public static volatile SingularAttribute<Partie, Integer> idWinner;
    public static volatile CollectionAttribute<Partie, Score> scoreCollection;
    public static volatile SingularAttribute<Partie, Equipe> idEquipe2;
    public static volatile CollectionAttribute<Partie, Statistique> statistiqueCollection;
    public static volatile SingularAttribute<Partie, Equipe> idEquipe1;

}