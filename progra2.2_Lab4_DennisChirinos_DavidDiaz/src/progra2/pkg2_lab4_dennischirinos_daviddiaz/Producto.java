package progra2.pkg2_lab4_dennischirinos_daviddiaz;

import java.util.Date;

public class Producto {
    private Date fecha_emision;
    private int vida_util;
    private double precio;
    private int tamanio;
    private String descripcion;
    private String nombre;
    private int num_producto;

    public Producto() {
    }

    public Producto(Date fecha_emision, int vida_util, double precio, int tamanio, String descripcion, String nombre, int num_producto) {
        this.fecha_emision = fecha_emision;
        this.vida_util = vida_util;
        this.precio = precio;
        this.tamanio = tamanio;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.num_producto = num_producto;
    }

    public Date getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(Date fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public int getVida_util() {
        return vida_util;
    }

    public void setVida_util(int vida_util) {
        this.vida_util = vida_util;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum_producto() {
        return num_producto;
    }

    public void setNum_producto(int num_producto) {
        this.num_producto = num_producto;
    }

    @Override
    public String toString() {
        return "Producto{" + "fecha_emision=" + fecha_emision + ", vida_util=" + vida_util + ", precio=" + precio + ", tamanio=" + tamanio + ", descripcion=" + descripcion + ", nombre=" + nombre + ", num_producto=" + num_producto + '}';
    }
    
}
