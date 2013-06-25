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
public class RazaBean {

    private String idRaza;
    private String nombreRaza;
    
    public RazaBean() {
    }

    public String getIdRaza() {
        return idRaza;
    }

    public void setIdRaza(String idRaza) {
        this.idRaza = idRaza;
    }

    public String getNombreRaza() {
        return nombreRaza;
    }

    public void setNombreRaza(String nombreRaza) {
        this.nombreRaza = nombreRaza;
    }
    
}
