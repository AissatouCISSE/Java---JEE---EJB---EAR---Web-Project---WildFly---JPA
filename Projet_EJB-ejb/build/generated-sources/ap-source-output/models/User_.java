package models;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Client;
import models.Village;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-11-01T17:39:12")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile ListAttribute<User, Village> villageList;
    public static volatile SingularAttribute<User, String> password;
    public static volatile SingularAttribute<User, Integer> id;
    public static volatile ListAttribute<User, Client> clientList;
    public static volatile SingularAttribute<User, String> nom;
    public static volatile SingularAttribute<User, String> prenom;
    public static volatile SingularAttribute<User, String> email;

}