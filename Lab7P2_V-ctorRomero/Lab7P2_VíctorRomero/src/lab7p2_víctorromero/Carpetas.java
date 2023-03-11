package lab7p2_víctorromero;

import java.io.Serializable;
import java.util.ArrayList;

public class Carpetas implements Serializable {

    private String nombreCarp;
    private String linkCarp;
    private ArrayList<Archivos> listaArchivos;
    private ArrayList<Carpetas> listaCarpetas;

    public Carpetas() {
    }

    public Carpetas(String nombreCarp, String linkCarp) {
        this.nombreCarp = nombreCarp;
        this.linkCarp = linkCarp;
    }

    public String getNombreCarp() {
        return nombreCarp;
    }

    public void setNombreCarp(String nombreCarp) {
        this.nombreCarp = nombreCarp;
    }

    public String getLinkCarp() {
        return linkCarp;
    }

    public void setLinkCarp(String linkCarp) {
        this.linkCarp = linkCarp;
    }

    public ArrayList<Archivos> getListaArchivos() {
        return listaArchivos;
    }

    public void setListaArchivos(ArrayList<Archivos> listaArchivos) {
        this.listaArchivos = listaArchivos;
    }

    public ArrayList<Carpetas> getListaCarpetas() {
        return listaCarpetas;
    }

    public void setListaCarpetas(ArrayList<Carpetas> listaCarpetas) {
        this.listaCarpetas = listaCarpetas;
    }

    @Override
    public String toString() {
        return ">>Carpetas<<" + "\n"
                + "Nombre Carpeta=" + nombreCarp + "\n"
                + "Link Carpeta=" + linkCarp + "\n"
                + "Lista Archivos=" + listaArchivos + "\n"
                + "Lista Carpetas=" + listaCarpetas + '}';
    }

}
