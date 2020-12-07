
public class Nodo{
    
    public int []valores;
    public Nodo []nodo;
    public static int numValores;
    public boolean tengoHijos = false;
    public int ocupados = 0;
    public Nodo padre;
    String valor;
    
    public Nodo(){
       nodo = new Nodo [Admin_B_Tree.orden * 2 + 3];
       valores = new int [Admin_B_Tree.orden * 2 + 1];
    }
    
    public String getValor(){
        return valor;
    }
    
    public void SetValor(String valor){
        this.valor=valor;
    }
}
