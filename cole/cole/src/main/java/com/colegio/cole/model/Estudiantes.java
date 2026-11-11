package com.colegio.cole.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name = "students")
public class Estudiantes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    
    @Column(name = "edad", nullable = false)
    int edad;
    
    @Column(name = "nombre", length = 50, nullable = false)
    String nombre;

    @Column(name = "apellido", length = 50, nullable = false)
    String apellido;

    @Column(name = "grado", length = 50, nullable = false)
    String grado;
    
    
    public Estudiantes() {
    }
    public Estudiantes(int edad, String nombre, String apellido, String grado) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.grado = grado;
    }

    public Estudiantes(int id) {
        this.id = id;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
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
    public String getGrado() {
        return grado;
    }
    public void setGrado(String grado) {
        this.grado = grado;
    }

    public void hacertareas(){
        System.out.println("El estudiante cumple su deber");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
