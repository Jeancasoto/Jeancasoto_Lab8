/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeancasoto_lab8;

import java.io.Serializable;

/**
 *
 * @author jeansoto
 */
public class Hada implements Serializable{
    
    String nombre;
    int altura;
    int edad;
    double salud;
    double poder;
 private static final long SerialVersionUID = 991L;

    public Hada() {
    }
 
 
    public Hada(String nombre, int altura, int edad, double salud, double poder) {
        this.nombre = nombre;
        this.altura = altura;
        this.edad = edad;
        this.salud = salud;
        this.poder = poder;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalud() {
        return salud;
    }

    public void setSalud(double salud) {
        this.salud = salud;
    }

    public double getPoder() {
        return poder;
    }

    public void setPoder(double poder) {
        this.poder = poder;
    }

    @Override
    public String toString() {
        return "Hada{" + "nombre=" + nombre + ", salud=" + salud + ", poder=" + poder + '}';
    }

   
    
  
}
