/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.veterinaria.control_mascota;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Giovanni Castillo
 */
@ManagedBean
@RequestScoped
public class AmoBean {

    private String idAmo;
     private String nombreAmo;
    
    public AmoBean() {
    }

    public String getIdAmo() {
        return idAmo;
    }

    public void setIdAmo(String idAmo) {
        this.idAmo = idAmo;
    }

    public String getNombreAmo() {
        return nombreAmo;
    }

    public void setNombreAmo(String nombreAmo) {
        this.nombreAmo = nombreAmo;
    }
    
}
