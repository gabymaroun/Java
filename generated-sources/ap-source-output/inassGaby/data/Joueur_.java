package inassGaby.data;

import inassGaby.data.Avatar;
import inassGaby.data.Equipe;
import inassGaby.data.Statistique;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-23T04:14:43")
@StaticMetamodel(Joueur.class)
public class Joueur_ { 

    public static volatile SingularAttribute<Joueur, String> password;
    public static volatile SingularAttribute<Joueur, String> ville;
    public static volatile SingularAttribute<Joueur, Avatar> idAvatar;
    public static volatile CollectionAttribute<Joueur, Equipe> equipeCollection1;
    public static volatile CollectionAttribute<Joueur, Statistique> statistiqueCollection;
    public static volatile CollectionAttribute<Joueur, Equipe> equipeCollection;
    public static volatile SingularAttribute<Joueur, Integer> idJoueur;
    public static volatile SingularAttribute<Joueur, String> sexe;
    public static volatile SingularAttribute<Joueur, String> pseudo;
    public static volatile SingularAttribute<Joueur, Integer> age;

}