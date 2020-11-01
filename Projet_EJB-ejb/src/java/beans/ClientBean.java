/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author HP
 */
@Stateless
public class ClientBean implements ClientBeanLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Projet_EJB-ejbPU");
    EntityManager em = emf.createEntityManager();
}
