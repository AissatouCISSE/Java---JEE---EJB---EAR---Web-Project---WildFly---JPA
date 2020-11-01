package models;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.User;
import models.Village;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-11-01T17:39:12")
@StaticMetamodel(Client.class)
public class Client_ { 

    public static volatile SingularAttribute<Client, String> adresseClient;
    public static volatile SingularAttribute<Client, String> telephoneClient;
    public static volatile SingularAttribute<Client, Integer> id;
    public static volatile SingularAttribute<Client, User> userId;
    public static volatile SingularAttribute<Client, Village> villageId;
    public static volatile SingularAttribute<Client, String> nomClient;

}