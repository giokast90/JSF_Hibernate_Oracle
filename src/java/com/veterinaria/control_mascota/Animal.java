package com.veterinaria.control_mascota;
// Generated May 11, 2013 8:51:19 PM by Hibernate Tools 3.2.1.GA


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Animal generated by hbm2java
 */
public class Animal  implements java.io.Serializable {


     private String idAnimal;
     private String nombreAnimal;
     private Set<Mascota> mascotas = new HashSet<Mascota>(0);
     private Set<Raza> razas = new HashSet<Raza>(0);
     private AnimalDAO dao;

    public Animal() {
        dao = new AnimalDAO();
    }

	
    public Animal(String idAnimal, String nombreAnimal) {
        this.idAnimal = idAnimal;
        this.nombreAnimal = nombreAnimal;
    }
    public Animal(String idAnimal, String nombreAnimal, Set<Mascota> mascotas, Set<Raza> razas) {
       this.idAnimal = idAnimal;
       this.nombreAnimal = nombreAnimal;
       this.mascotas = mascotas;
       this.razas = razas;
    }
   
    public String getIdAnimal() {
        return this.idAnimal;
    }
    
    public void setIdAnimal(String idAnimal) {
        this.idAnimal = idAnimal;
    }
    public String getNombreAnimal() {
        return this.nombreAnimal;
    }
    
    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }
    public Set<Mascota> getMascotas() {
        return this.mascotas;
    }
    
    public void setMascotas(Set<Mascota> mascotas) {
        this.mascotas = mascotas;
    }
    public Set<Raza> getRazas() {
        return this.razas;
    }
    
    public void setRazas(Set<Raza> razas) {
        this.razas = razas;
    }
    
    public ArrayList<AnimalBean> listaanimales(){
        return dao.listaranimales();
    }
    
    public ArrayList<RazaBean> listaraza(Animal animal){
        return dao.listarraza(animal);
    }

}


