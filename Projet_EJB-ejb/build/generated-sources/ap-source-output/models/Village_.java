package models;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Client;
import models.User;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-11-01T17:39:12")
@StaticMetamodel(Village.class)
public class Village_ { 

    public static volatile SingularAttribute<Village, String> nomVillage;
    public static volatile SingularAttribute<Village, Integer> id;
    public static volatile ListAttribute<Village, Client> clientList;
    public static volatile SingularAttribute<Village, User> userId;

}