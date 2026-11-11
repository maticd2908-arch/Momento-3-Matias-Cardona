package com.colegio.cole.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "profesor")
public class Profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name = "nombre", length = 50, nullable = false)
    String nombre;
    @Column(name = "apellido", length = 50, nullable = false)
    String apellido;
    @Column(name = "materia", length = 50, nullable = false)
    String materia;
    public Profesor() {
    }
    public Profesor(int id, String nombre, String apellido, String materia) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.materia = materia;
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
    public String getMateria() {
        return materia;
    }
    public void setMateria(String materia) {
        this.materia = materia;
    }
    public void darclase(){
        System.out.println("El profesor cumple su deber");
    }
}
