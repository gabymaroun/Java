package inassGaby.data;

import inassGaby.data.Joueur;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-23T04:14:43")
@StaticMetamodel(Avatar.class)
public class Avatar_ { 

    public static volatile SingularAttribute<Avatar, Integer> idAvatar;
    public static volatile CollectionAttribute<Avatar, Joueur> joueurCollection;
    public static volatile SingularAttribute<Avatar, String> url;

}