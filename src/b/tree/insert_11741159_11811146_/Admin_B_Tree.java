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
        public int Claves [];

        public Nodo(Empleado x) {
            this.padre = null;
            this.r = null;
            this.l = null;
            this.clave = x.getCodigo();
            this.contenido = x.toString();
            this.hijos = new Empleado [orden];
            this.Claves = new int [max];
        }   

        public Nodo getPadre() {
            return padre;
        }

        public void setPadre(Nodo padre) {
            this.padre = padre;
        }

        public Nodo getR() {
            return r;
        }

        public void setR(Nodo r) {
            this.r = r;
        }

        public Nodo getL() {
            return l;
        }

        public void setL(Nodo l) {
            this.l = l;
        }

        public int getClave() {
            return clave;
        }

        public void setClave(int clave) {
            this.clave = clave;
        }

        public String getContenido() {
            return contenido;
        }

        public void setContenido(String contenido) {
            this.contenido = contenido;
        }

        public Empleado[] getHijos() {
            return hijos;
        }

        public void setHijos(Empleado[] hijos) {
            this.hijos = hijos;
        }
        
        
        
    }
    
    public void Crear(){
        root = null;
        
    }
    
    public boolean hoja (Nodo x){
        boolean resp = false;
        if (x.getHijos().length==0) {
            resp = true;
        }
        return resp;
    }
}
