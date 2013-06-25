
package com.veterinaria.control_mascota;

import Hibernate.NewHibernateUtil;
import org.hibernate.Session;

public class MascotaDAO {
    
    Session session = null;
    
    public MascotaDAO(){
        this.session = NewHibernateUtil.getSessionFactory().getCurrentSession();        
    }
    
    public void guardar_mascota(Mascota pet){
        this.session.beginTransaction();
        this.session.save(pet);
        this.session.flush();
        this.session.getTransaction().commit();
    }
}
