package b.tree.insert_11741159_11811146_;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author tiffa
 */
public class Admin_Empleados {

    private ArrayList<Empleado> Empleados = new ArrayList();
    private ArrayList<Empleado> temp = new ArrayList();
    private File archivo = null;

    private Empleado camp;

    public Admin_Empleados(String path) {
        archivo = new File(path);
    }

    public ArrayList<Empleado> getEmpleados() {
        return Empleados;
    }

    public void setEmpleados(ArrayList<Empleado> x) {
        this.Empleados = x;
    }

    public void addEmpleado(Empleado x) {
        this.Empleados.add(x);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Empleado> getTemp() {
        return temp;
    }

    public void setTemp(ArrayList<Empleado> temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "Write_Empleados{" + "Empleados=" + Empleados + ", archivo=" + archivo + '}';
    }

    public void Cargar() {
        try {
            Empleado temp;
            // if (archivo.exists()) {
            FileInputStream entrada = new FileInputStream("./Creados/" + archivo);
            ObjectInputStream objeto = new ObjectInputStream(entrada);
            try {
                while ((temp = (Empleado) objeto.readObject()) != null) {
                    Empleados.add(temp);
                }
            } catch (Exception e) {
            }
            objeto.close();
            entrada.close();
            //}
        } catch (Exception e) {
        }

//        FileReader fr = null;
//        BufferedReader br = null;
//        try {
//            fr = new FileReader("./Creados/" + archivo);
//            br = new BufferedReader(fr);
//            String linea;
//            while ((linea = br.readLine()) != null) {
//                System.out.println(linea);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (null != fr) {
//                    fr.close();
//                }
//            } catch (Exception e2) {
//                e2.printStackTrace();
//            }
//        }

//        try {
//            Empleados = new ArrayList();
//            Empleado temp;
//                FileInputStream entrada = new FileInputStream(archivo);
//                ObjectInputStream objeto = new ObjectInputStream(entrada);
//                try {
//                    while ((temp = (Empleado) objeto.readObject()) != null){
//                        Empleados.add(temp);
//                        
//                    }
//                } catch (Exception e) {
//                }
//                objeto.close();
//                entrada.close();
//        } catch (Exception e) {
//        }
    }

    public void Escribir() {
        try {
            FileOutputStream fileoutput = new FileOutputStream("./Creados/" + archivo);
            ObjectOutputStream file = new ObjectOutputStream(fileoutput);
            for (Empleado Empleado : Empleados) {
                file.writeObject(Empleado);
            }
            file.close();
        } catch (Exception e) {
        }
    }

    public boolean existe(Empleado x) {
        for (int i = 0; i < Empleados.size(); i++) {
            if (x.getNombre().equals(Empleados.get(i).getNombre())) {
                return true;
            }
        }
        return false;
    }

    public void borrar(int x) {
        Empleados.remove(x);
            archivo.delete();
            Escribir();

    }

    public void modificar(Empleado viejo, Empleado nuevo) {

    }

//        FileWriter fichero = null;
//        PrintWriter pw = null;
//        try
//        {
//            fichero = new FileWriter(archivo);
//            pw = new PrintWriter(fichero);
//
//            for (int i = 0; i < Empleados.size(); i++)
//                pw.println(Empleados.get(i));
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//           try {
//           // Nuevamente aprovechamos el finally para 
//           // asegurarnos que se cierra el fichero.
//           if (null != fichero)
//              fichero.close();
//           } catch (Exception e2) {
//              e2.printStackTrace();
//           }
//        }
//        FileOutputStream fw = null;
//        ObjectOutputStream bw = null;
//        try {
//            fw = new FileOutputStream(archivo);
//            bw = new ObjectOutputStream(fw);
//            for (Empleado Empleado : Empleados) {
//                bw.writeObject(Empleado);
//            }
//            bw.flush();
//        } catch (Exception e) {
//        } finally {
//            try {
//                bw.close();
//                fw.close();
//            } catch (Exception e) {
//            }
//        }
}
