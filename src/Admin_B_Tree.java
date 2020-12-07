
import java.util.ArrayList;

public class Admin_B_Tree {
    
    public static int orden = 5;
    private int min = (orden-1)/2;
    private int max = orden-1;
    private  boolean esRaiz;
    private ArrayList<Integer> ingresados=new ArrayList();
    public static int nivel = 1;
    public static int imprimir = 1;
    public static String arbol = "";
    Nodo root;

    public Admin_B_Tree() {
        this.orden = orden / 2;
        root = new Nodo();

        esRaiz = true;
    }
    
    

    public Admin_B_Tree(String valor) {
        root = new Nodo();
        root.SetValor(valor);
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
                    ordenar(root.valores, 6);
                    break;
                }
            }
            if (j == 2 * orden) {
                split(root);
            }
        } else {
            setTengoHijos(root);
            ingresarEnHijos(root, valor);

        }
    }

    public void ordenar(int arr[], int longitud) {
        longitud = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                longitud++;
            } else {
                break;
            }
        }
        for (int ord = 0; ord < longitud; ord++) {
            for (int ord1 = 0; ord1 < longitud - 1; ord1++) {
                if (arr[ord1] > arr[ord1 + 1]) {
                    int tmp = arr[ord1];
                    arr[ord1] = arr[ord1 + 1];
                    arr[ord1 + 1] = tmp;

                }
            }
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
            ubicarValorEnArreglo(conHijos, valor);
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

    public void ubicarValorEnArreglo(Nodo nodoA, int valor) {
        int cont = 0;
        while (cont <= 2 * orden) {
            if (nodoA.valores[cont] == 0) {
                nodoA.valores[cont] = valor;
                ordenar(nodoA.valores, 5);
                ingresados.add(valor);
                
                if (cont == 2 * orden) {
                    split(nodoA);
                }
                break;
            }
            cont++;
        }
    }

    public void ordenarNodos(Nodo aOrdenar) {
        int i, j;
        i = 0;
        Nodo tmp;

        while (i < 2 * orden + 3 && aOrdenar.nodo[i] != null) {
            j = 0;
            while (j < 2 * orden + 2 && aOrdenar.nodo[j] != null && aOrdenar.nodo[j + 1] != null) {
                if (aOrdenar.nodo[j].valores[0] > aOrdenar.nodo[j + 1].valores[0]) {
                    tmp = aOrdenar.nodo[j];
                    aOrdenar.nodo[j] = aOrdenar.nodo[j + 1];
                    aOrdenar.nodo[j + 1] = tmp;
                }
                j++;
            }
            i++;
        }
    }

    public void split(Nodo nodo) {

        Nodo hijoIzq = new Nodo();
        Nodo hijoDer = new Nodo();

        //split general 
        if (nodo.nodo[0] != null) { //si tiene hijos antes de hacer el split entonces
            for (int i = 0; i < orden + 1; i++) { // los separa los hijos del nodo en hijoIzq e hijoDer
                hijoIzq.nodo[i] = nodo.nodo[i];
                hijoIzq.nodo[i].padre = hijoIzq;
                nodo.nodo[i] = null;
                hijoDer.nodo[i] = nodo.nodo[orden + 1 + i];
                hijoDer.nodo[i].padre = hijoDer;
                nodo.nodo[orden + 1 + i] = null;
            }
        }

        for (int i = 0; i < orden; i++) { //guarda los valores en hijoIzq e hijoDer
            hijoIzq.valores[i] = nodo.valores[i];
            nodo.valores[i] = 0;
            hijoDer.valores[i] = nodo.valores[orden + 1 + i];
            nodo.valores[orden + 1 + i] = 0;
        }
        nodo.valores[0] = nodo.valores[orden];
        nodo.valores[orden] = 0; //queda en nodo solo el valor que "subio"

        nodo.nodo[0] = hijoIzq; //asigna a nodo el nuevo hijo izquierdo (hijoIzq)
        nodo.nodo[0].padre = nodo; // se hizo en primer ciclo
        nodo.nodo[1] = hijoDer; // asigna a nodo el nuevo hijo derecho (hijoDer)
        nodo.nodo[1].padre = nodo; // se hizo en el primer ciclo        
        setTengoHijos(root);
        ordenarNodos(nodo);

        if (nodo.padre != null) { // luego del split y asignar los hijos (hijoIzq, hijoDer), subir el valor al padre
            boolean subido = false;
            for (int i = 0; i < nodo.padre.valores.length && subido == false; i++) {
                if (nodo.padre.valores[i] == 0) {
                    nodo.padre.valores[i] = nodo.valores[0];
                    subido = true;
                    nodo.valores[0] = 0;
                    ordenar(nodo.padre.valores, 5);
                }
            }
            int posHijos = 0;
            for (int i = 0; i < 2 * orden + 3; i++) {
                if (nodo.padre.nodo[i] != null) {
                    posHijos++;
                } else {
                    break;
                }
            }
            nodo.padre.nodo[posHijos] = nodo.nodo[0];
            nodo.padre.nodo[posHijos + 1] = nodo.nodo[1];
            nodo.padre.nodo[posHijos].padre = nodo.padre;
            nodo.padre.nodo[posHijos + 1].padre = nodo.padre;
            int aqui = 0;
            for (int i = 0; i < 2 * orden + 3 && nodo.padre.nodo[i] != null; i++) {
                if (nodo.padre.nodo[i].valores[0] == nodo.valores[0]) {
                    aqui = i;
                    break;
                }
            }
            Nodo papa = nodo.padre;
            nodo = null;
            int j = aqui;
            while (j < 2 * orden + 2 && papa.nodo[j] != null && papa.nodo[j + 1] != null) {
                papa.nodo[j] = papa.nodo[j + 1];
                j++;
            }
            papa.nodo[j] = null;
            ordenar(papa.valores, 5);
            ordenarNodos(papa);
            if (papa.valores[2 * orden] != 0) {
                split(papa);
            }
        }
    }

    public void eliminar(int valor) { //elimina de la lista el valor y vuelve a crear el arbol
        
        boolean encontrado = false;
        int j = 0;
        for (int i = 0; i < ingresados.size() && !encontrado; i++) {
            if (ingresados.get(i) == valor) {
                encontrado = true;
                j = i;
            }
        }
        if (encontrado == true) {

            ingresados.remove(j);
        } else {
            System.out.println("El valor a eliminar no se encuentra en el arbol B");
        }
        ArrayList<Integer> auxiliar = ingresados;
        ingresados = new ArrayList<Integer>();
        root = new Nodo();
        root.tengoHijos = false;
        for (int k = 0; k < auxiliar.size(); k++) {
            Integer y = auxiliar.get(k);
            int o = y.intValue();
            insertar(o);
        }
    }

    public boolean buscar(int valor, String  n) {

        String padre=n;
        Nodo n2 = root;
        n2.SetValor(padre);
        
        boolean esta = false;
        
        for (int i = 0; i < ingresados.size() && !esta; i++) {
            if (ingresados.get(i) == valor) {
                esta = true;
                System.out.println("El elemento buscado si se encuentra en el arbol B");
                return esta;
            }
        }
        
        for (int i = 0; i < n2.Valores().length; i++) {
            if(n2.Valores()[i]==valor){
                System.out.println("Nodo de ubicacion: "+n2);
                esta =true;
            }
        }
        
        return esta;
    }
    
    public int lastValue(Nodo n){
        int cont = 0;
        for (int i = 0; i < n.valores.length; i++) {
            if(n.valores[i]>0){
                cont++;
            }
        }
        return cont;
    }
    
    public boolean buscarEnNodo(int valor, Nodo n){
        
        boolean ret = false;
        for (int i = 0; i < n.valores.length; i++) {
            if(n.valores[i]==valor){
                ret = true;
                break;
            }
        }
        return ret;
    }

    public String recorrer(Nodo nodo) {
        
        arbol += "\n";
        for (int i = 0; i < 2 * orden + 1; i++) {
            if (nodo.nodo[i] != null) {
                if (i == 0) {
                    nivel++;
                    imprimir = 1;
                } else {
                    imprimir++;
                }
                recorrer(nodo.nodo[i]);
            }
            arbol += "[ ";
            for (int j = 0; nodo.nodo[i] != null && j < nodo.nodo[i].valores.length; j++) {
                if (nodo.nodo[i].valores[j] != 0) {
                    arbol += nodo.nodo[i].valores[j] + ", ";
                }
            }
            arbol += " ]";
        }
        if (arbol.length() > (2 * orden + 3) * 4) {
            System.out.println(arbol);
            return arbol;
        }
        return arbol;
    }

    public String llamarRecorrer() {
        String mostrar = recorrer(root);
        nivel = 1;
        imprimir = 1;
        return arbol;
    }

    public boolean esNumero(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
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
