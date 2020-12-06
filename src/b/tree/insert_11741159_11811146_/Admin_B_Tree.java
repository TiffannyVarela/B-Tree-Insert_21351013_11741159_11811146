package b.tree.insert_11741159_11811146_;

import java.util.ArrayList;

public class Admin_B_Tree {
    
    public static int orden = 5;
    private int min = orden-1/2;
    private int max = orden-1;
    private  boolean esRaiz;
    private ArrayList<Integer> ingresados=new ArrayList();

    Nodo root;

    public Admin_B_Tree() {
        this.orden = orden / 2;
        root = new Nodo();
        esRaiz = true;
    }
     public void insertar(int valor) {
        
        if (root.tengoHijos == false) {
            int j = 0;
            for (int i = 0; i < root.valores.length; i++) {
                if (root.valores[i] == 0) {
                    root.valores[i] = valor;
                    ingresados.add(valor);
                    
                    j = i;
                    //ordenar(root.valores, 6);
                    break;
                }
            }
            if (j == 2 * orden) {
            }
        } else {
            setTengoHijos(root);
            ingresarEnHijos(root, valor);

        }
    }
    public void setTengoHijos(Nodo nodo) {
        
        if (nodo == root) {
            if (root.nodo[0] != null) {
                root.tengoHijos = true;
            }
        }
        
        for (int i = 0; i < nodo.nodo.length; i++) {
            if (nodo.nodo[i] != null) {
                nodo.tengoHijos = true;
                setTengoHijos(nodo.nodo[i]);
            }
        }
    }

    public void ingresarEnHijos(Nodo conHijos, int valor) {

        boolean entro = false;
        if (conHijos != null && !conHijos.tengoHijos) {
            //ubicarValorEnArreglo(conHijos, valor);
            entro = true;
        }
        
        for (int i = 0; conHijos != null && i < 2 * orden + 1 && !entro; i++) {
            if (valor < conHijos.valores[i] || conHijos.valores[i] == 0) {
                entro = true;
                ingresarEnHijos(conHijos.nodo[i], valor);
                i = 2 * orden;
            }
        }
    }
    /*public boolean hoja (Nodo x){
        boolean resp = false;
        if (x.getHijos().length==0) {
            resp = true;
        }
        return resp;
    }*/
}
