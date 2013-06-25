/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.veterinaria.control_mascota;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class MascotaBean {

     private String idMascota;
     private String nombreMascota;
     private Date fechaNac;
     private String notas;
     private Mascota entidad;
     
    public MascotaBean() {
        entidad = new Mascota();
    }

    public String getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(String idMascota) {
        this.idMascota = idMascota;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }
    
    public void guardarmascota(){
        entidad.setIdMascota(idMascota);
        entidad.setNombreMascota(nombreMascota);
        entidad.setFechaNac(fechaNac);
        entidad.setNotas(notas);
        entidad.savepet(entidad);
    }
    
}
