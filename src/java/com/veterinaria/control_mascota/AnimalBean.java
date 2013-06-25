/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.veterinaria.control_mascota;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Giovanni Castillo
 */
@ManagedBean
@RequestScoped
public class AnimalBean {

    private String idAnimal;
    private String nombreAnimal;
    private Animal entidad;
    private ArrayList<RazaBean> listaraza; 

    public AnimalBean() {
        entidad = new Animal();
        listaraza = new ArrayList<RazaBean>();
    }
    
    public ArrayList<RazaBean> getListaraza() {
        return listaraza;
    }

    public void setListaraza(ArrayList<RazaBean> listaraza) {
        this.listaraza = listaraza;
    }

    public String getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(String idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }
    
    public ArrayList<AnimalBean> listpets(){
        return entidad.listaanimales();
    }
    
    public void cargarraza(){
        this.entidad.setNombreAnimal(this.nombreAnimal);
        this.listaraza = (ArrayList<RazaBean>)this.entidad.listaraza(entidad).clone() ;
    }
    
}
