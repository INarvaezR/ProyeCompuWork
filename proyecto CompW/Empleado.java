/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecompuword;

/**
 *
 * @author lava0
 */
public class Empleado {
    int id; 
    String nombre;
    String departamento;
    double salario;
    double puntaje;
    
     

    public Empleado(int id, String nombre,String departamento, double salario,double puntaje) {
        this.id = id;
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
        this.puntaje = puntaje;
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


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }
    
    @Override
    
    public String toString(){ // convierte el objeto al metodo que contenga el toString
        
        return  id + " id, " + nombre + " nombre, " +  departamento + " departamento, "  + salario + " salario, " +  puntaje + " puntaje";
    }  
}

