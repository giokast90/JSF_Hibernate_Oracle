/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.veterinaria.control_mascota;

import Hibernate.NewHibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Giovanni Castillo
 */
public class RazaDAO {
    
    Session session = null;
    
    public RazaDAO(){
        this.session = NewHibernateUtil.getSessionFactory().getCurrentSession();
    }
    
}
