package lab7p2_víctorromero;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AdminCarpeta {

    private ArrayList<Carpetas> listaCarpetas = new ArrayList();
    private File archivo = null;

    public AdminCarpeta(String path) {
        archivo = new File(path);
    }

    public AdminCarpeta() {
    }

    public ArrayList<Carpetas> gesetCarpetatListaCarpetas() {
        return listaCarpetas;
    }

    public void setListaCarpetas(ArrayList<Carpetas> listaCarpetas) {
        this.listaCarpetas = listaCarpetas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setCarpeta(Carpetas a){
        listaCarpetas.add(a);
    }
    
    public void cargarArchivo() {
        try {            
            listaCarpetas = new ArrayList();
            Carpetas temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Carpetas) objeto.readObject()) != null) {
                        listaCarpetas.add(temp);
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
            for (Carpetas t : listaCarpetas) {
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
