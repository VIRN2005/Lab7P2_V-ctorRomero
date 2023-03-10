package lab7p2_víctorromero;

import java.io.Serializable;

public class Archivos implements Serializable{

    private String nombre;
    private String link;
    private String extension;
    private double tamaño;

    public Archivos(){
    }

    public Archivos(String nombre, String link, String extension, double tamaño) {
        this.nombre = nombre;
        this.link = link;
        this.extension = extension;
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return ">>Archivos<<" + "\n"
                + "Nombre=" + nombre + "\n"
                + "Link=" + link + "\n"
                + "Extension=" + extension + "\n"
                + "Tama\u00f1o=" + tamaño + '}';
    }

}
