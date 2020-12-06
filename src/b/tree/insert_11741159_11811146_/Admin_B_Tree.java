package b.tree.insert_11741159_11811146_;

public class Admin_B_Tree {
    
    public static int orden = 5;
    private int min = orden-1/2;
    private int max = orden-1;
    private  boolean esRaiz;

    Nodo root;

    public Admin_B_Tree() {
        this.orden = orden / 2;
        root = new Nodo();
        esRaiz = true;
    }
    
    /*public boolean hoja (Nodo x){
        boolean resp = false;
        if (x.getHijos().length==0) {
            resp = true;
        }
        return resp;
    }*/
}
