/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeancasoto_lab8;


public class Sifides extends Hada{
   int alas;

    public Sifides() {
        super();
        
    }

    public Sifides(int alas, String nombre, int altura, int edad, double salud, double poder) {
        super(nombre, altura, edad, salud, poder);
        this.alas = alas;
    }
    
    

    public Sifides(int alas) {
        this.alas = alas;
    }

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }
   
   
    
}
