package com.veterinaria.control_mascota;
// Generated May 11, 2013 8:51:19 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;

public class Mascota  implements java.io.Serializable {

     private String idMascota;
     private Animal animal;
     private Raza raza;
     private Amo amo;
     private String nombreMascota;
     private Date fechaNac;
     private String notas;
     private MascotaDAO dao;

    public Mascota() {
        dao = new MascotaDAO();
    }

    public Mascota(String idMascota, Animal animal, Raza raza, Amo amo, String nombreMascota, Date fechaNac, String notas) {
       this.idMascota = idMascota;
       this.animal = animal;
       this.raza = raza;
       this.amo = amo;
       this.nombreMascota = nombreMascota;
       this.fechaNac = fechaNac;
       this.notas = notas;
    }
   
    public String getIdMascota() {
        return this.idMascota;
    }
    
    public void setIdMascota(String idMascota) {
        this.idMascota = idMascota;
    }
    public Animal getAnimal() {
        return this.animal;
    }
    
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    public Raza getRaza() {
        return this.raza;
    }
    
    public void setRaza(Raza raza) {
        this.raza = raza;
    }
    public Amo getAmo() {
        return this.amo;
    }
    
    public void setAmo(Amo amo) {
        this.amo = amo;
    }
    public String getNombreMascota() {
        return this.nombreMascota;
    }
    
    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }
    public Date getFechaNac() {
        return this.fechaNac;
    }
    
    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }
    public String getNotas() {
        return this.notas;
    }
    
    public void setNotas(String notas) {
        this.notas = notas;
    }

    public void savepet(Mascota pet){
        pet.setAmo(amo);
        pet.setAnimal(animal);
        pet.setRaza(raza);
        this.dao.guardar_mascota(pet);
    }
    
}


