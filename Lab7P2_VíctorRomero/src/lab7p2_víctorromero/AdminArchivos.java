package lab7p2_víctorromero;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AdminArchivos {

    private ArrayList<Archivos> listaArchivos = new ArrayList();
    private File archivo = null;

    public AdminArchivos(String path) {
        archivo = new File(path);
    }

    public ArrayList<Archivos> getListaArchivos() {
        return listaArchivos;
    }

    public void setListaArchivos(ArrayList<Archivos> listaArchivos) {
        this.listaArchivos = listaArchivos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void cargarArchivo() {
        try {            
            listaArchivos = new ArrayList();
            Archivos temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Archivos) objeto.readObject()) != null) {
                        listaArchivos.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Archivos t : listaArchivos) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
    

}
