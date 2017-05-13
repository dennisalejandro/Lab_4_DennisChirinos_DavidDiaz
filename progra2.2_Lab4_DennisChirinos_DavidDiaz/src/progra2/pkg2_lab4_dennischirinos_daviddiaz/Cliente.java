/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2.pkg2_lab4_dennischirinos_daviddiaz;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author denni
 */
public class Cliente extends Persona {
    
    double Dinero;
    Date Compra;
    ArrayList<Producto> listProducto = new ArrayList();
    int Frecuencia = 0;

    public Cliente(double Dinero, int ID, String Nombre, int Edad, double Peso, String Residencia) {
        super(ID, Nombre, Edad, Peso, Residencia);
        this.Dinero = Dinero;
        this.Compra = Compra;
    }

    

    

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public String getResidencia() {
        return Residencia;
    }

    public void setResidencia(String Residencia) {
        this.Residencia = Residencia;
    }

    public double getDinero() {
        return Dinero;
    }

    public void setDinero(double Dinero) {
        this.Dinero = Dinero;
    }

    public Date getCompra() {
        return Compra;
    }

    public void setCompra(Date Compra) {
        this.Compra = Compra;
    }

    public ArrayList<Producto> getListProducto() {
        return listProducto;
    }

    public void setListProducto(ArrayList<Producto> listProducto) {
        this.listProducto = listProducto;
    }

    public int getFrecuencia() {
        return Frecuencia;
    }

    public void setFrecuencia(int Frecuencia) {
        this.Frecuencia = Frecuencia;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Dinero=" + Dinero + ", Compra=" + Compra + ", listProducto=" + listProducto + '}';
    }
    

}
