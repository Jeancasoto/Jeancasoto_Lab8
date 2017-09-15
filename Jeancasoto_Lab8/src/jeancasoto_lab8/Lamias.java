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
public class Lamias extends Hada implements complementos{
    int aleta;
    int branquias;

    public Lamias() {
        super();
    }

    public Lamias(int aleta, int branquias, String nombre, int altura, int edad, double salud, double poder) {
        super(nombre, altura, edad, salud, poder);
        this.aleta = aleta;
        this.branquias = branquias;
    }

    
    public Lamias(int aleta, int branquias) {
        this.aleta = aleta;
        this.branquias = branquias;
    }

    public int getAleta() {
        return aleta;
    }

    public void setAleta(int aleta) {
        this.aleta = aleta;
    }

    public int getBranquias() {
        return branquias;
    }

    public void setBranquias(int branquias) {
        this.branquias = branquias;
    }

    @Override
    public int pelea(Hada h1, Hada h2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
