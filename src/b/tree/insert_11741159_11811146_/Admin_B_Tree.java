/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b.tree.insert_11741159_11811146_;

/**
 *
 * @author Tiffanny
 */
public class Admin_B_Tree {
    private int orden = 5;
    private int min = orden-1/2;
    private int max = orden-1;
    
    Nodo root;

    public Admin_B_Tree() {
        root = null;
    }
    
    
    private class Nodo{
        public Nodo padre;
        public Nodo r;
        public Nodo l;
        public int clave;
        public String contenido;
        public Empleado hijos[];

        public Nodo(Empleado x) {
            this.padre = null;
            this.r = null;
            this.l = null;
            this.clave = x.getCodigo();
            this.contenido = x.toString();
            this.hijos = new Empleado [max];
        }
        
        
        
    }
}
