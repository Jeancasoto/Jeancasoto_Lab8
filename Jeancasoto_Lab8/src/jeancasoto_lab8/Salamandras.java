/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeancasoto_lab8;

/**
 *
 * @author jeansoto
 */
public class Salamandras extends Hada implements complementos{
   int alas;

    public Salamandras() {
        super();
    }

    public Salamandras(int alas, String nombre, int altura, int edad, double salud, double poder) {
        super(nombre, altura, edad, salud, poder);
        this.alas = alas;
    }
    
    

    public Salamandras(int alas) {
        this.alas = alas;
    }

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    @Override
    public int pelea(Hada h1, Hada h2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
   
    
}
