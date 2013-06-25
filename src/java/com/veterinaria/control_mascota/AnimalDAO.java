/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.veterinaria.control_mascota;

import Hibernate.NewHibernateUtil;
import java.util.ArrayList;
import org.hibernate.Session;

/**
 *
 * @author Giovanni Castillo
 */
public class AnimalDAO {
 
    Session session = null;
    
    public AnimalDAO(){
        this.session = NewHibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    public ArrayList<AnimalBean> listaranimales(){
        this.session = NewHibernateUtil.getSessionFactory().openSession();
        this.session.beginTransaction();
        ArrayList<AnimalBean> resultado = (ArrayList<AnimalBean>) session.createQuery("select a.nombreAnimal from Animal a").list();
        session.getTransaction().commit();
        return resultado;
    }
    
    public ArrayList<RazaBean> listarraza(Animal animal){
        this.session = NewHibernateUtil.getSessionFactory().openSession();
        this.session.beginTransaction();
        ArrayList<RazaBean> resultado = (ArrayList<RazaBean>) session.createQuery("select r.nombreRaza from Raza r where r.animal.nombreAnimal='"+animal.getNombreAnimal()+"'").list();
        session.getTransaction().commit();
        return resultado;
    }
    
}
