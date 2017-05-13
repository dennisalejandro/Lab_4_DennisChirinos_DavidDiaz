/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2.pkg2_lab4_dennischirinos_daviddiaz;

import java.util.Date;

/**
 *
 * @author denni
 */
public class Carga extends Empleado {

    int Entrada;
    int Salida;
    Date Inicio;

    public Carga(int Entrada, int Salida, Date Inicio, double Sueldo, int ID, String Nombre, int Edad, double Peso, String Residencia) {
        super(Sueldo, ID, Nombre, Edad, Peso, Residencia);
        this.Entrada = Entrada;
        this.Salida = Salida;
        this.Inicio = Inicio;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
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

    public int getEntrada() {
        return Entrada;
    }

    public void setEntrada(int Entrada) {
        this.Entrada = Entrada;
    }

    public int getSalida() {
        return Salida;
    }

    public void setSalida(int Salida) {
        this.Salida = Salida;
    }

    public Date getInicio() {
        return Inicio;
    }

    public void setInicio(Date Inicio) {
        this.Inicio = Inicio;
    }

    @Override
    public String toString() {
        return "Carga{" + "Entrada=" + Entrada + ", Salida=" + Salida + ", Inicio=" + Inicio + '}';
    }

}
