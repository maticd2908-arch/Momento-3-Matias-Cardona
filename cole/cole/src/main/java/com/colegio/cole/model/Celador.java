package com.colegio.cole.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table 
public class Celador {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column (name = "nombre", length = 50, nullable = false)
    String nombre;
    @Column (name = "apellido", length = 50, nullable = false)
    String apellido;
    @Column (name = "turno", length = 20, nullable = false)
    String turno;
    public Celador() {
    }
    public Celador(int id, String nombre, String apellido, String turno) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.turno = turno;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
    public void vigilar(){
        System.out.println("El celador cuida el colegio");
    }
}
