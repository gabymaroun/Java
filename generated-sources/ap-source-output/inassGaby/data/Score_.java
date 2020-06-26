package inassGaby.data;

import inassGaby.data.Equipe;
import inassGaby.data.Partie;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-23T04:14:43")
@StaticMetamodel(Score.class)
public class Score_ { 

    public static volatile SingularAttribute<Score, Partie> idPartie;
    public static volatile SingularAttribute<Score, Integer> score;
    public static volatile SingularAttribute<Score, Integer> idScore;
    public static volatile SingularAttribute<Score, Equipe> idEquipe;

}