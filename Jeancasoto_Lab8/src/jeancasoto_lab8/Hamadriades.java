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
public class Hamadriades extends Hada implements complementos{
    int arbol;
    double vidaarbol;

    public Hamadriades() {
        super();
        
    }

    public Hamadriades(int arbol, double vidaarbol, String nombre, int altura, int edad, double salud, double poder) {
        super(nombre, altura, edad, salud, poder);
        this.arbol = arbol;
        this.vidaarbol = vidaarbol;
    }
    
    

    public Hamadriades(int arbol, double vidaarbol) {
        this.arbol = arbol;
        this.vidaarbol = vidaarbol;
    }

    public int getArbol() {
        return arbol;
    }

    public void setArbol(int arbol) {
        this.arbol = arbol;
    }

    public double getVidaarbol() {
        return vidaarbol;
    }

    public void setVidaarbol(double vidaarbol) {
        this.vidaarbol = vidaarbol;
    }

    @Override
    public int pelea(Hada h1, Hada h2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
