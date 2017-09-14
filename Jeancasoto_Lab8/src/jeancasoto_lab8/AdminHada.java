/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeancasoto_lab8;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author jeansoto
 */
public class AdminHada {

    private ArrayList<Hada> listahadas = new ArrayList();
    private File archivo = null;

    public AdminHada(String path) {
        archivo = new File(path);
    }

    public ArrayList<Hada> getlistahadas() {
        return listahadas;
    }

    public void setlistahadas(ArrayList<Hada> listahadas) {
        this.listahadas = listahadas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    //MUTADOR EXTRA
    public void setPersona(Hada p) {
        this.listahadas.add(p);

    }

    public void cargarArchivo() {
        try {
            listahadas = new ArrayList();
            Hada temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Hada) objeto.readObject()) != null) {
                        listahadas.add(temp);
                    }
                } catch (EOFException e) {
                    //Encontro final del archivo
                }
                objeto.close();
                entrada.close();
                //fin if
            }
        } catch (Exception e) {

        }

    }//Fin del metodo

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;

        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Hada t : listahadas) {
                bw.writeObject(t);
            }
        } catch (Exception ex) {
        } finally {
            try {
                fw.close();
                bw.close();
            } catch (Exception e) {
            }
        }

    }

}
