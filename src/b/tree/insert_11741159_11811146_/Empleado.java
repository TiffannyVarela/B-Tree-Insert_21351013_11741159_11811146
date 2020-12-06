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
public class Empleado {
    int codigo;
    String nombre;
    int edad;
    String cargo; 
    double sueldo;

    public Empleado() {
    }

    public Empleado(int codigo, String nombre, int edad, String cargo, double sueldo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean existe (Empleado x, Empleado y){
        boolean resp = false;
        if (x.getCodigo() == y.getCodigo()) {
            resp=true;
        }
        return resp;
    }

    @Override
    public String toString() {
        return "Empleado{" + "codigo=" + codigo + ", nombre=" + nombre + ", edad=" + edad + ", cargo=" + cargo + ", sueldo=" + sueldo + '}';
    }   
    
}
