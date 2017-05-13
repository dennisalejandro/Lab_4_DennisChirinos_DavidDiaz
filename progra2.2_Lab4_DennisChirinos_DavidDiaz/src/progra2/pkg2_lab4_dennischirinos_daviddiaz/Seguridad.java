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
public class Seguridad extends Empleado {

    char[] Contraseña = new char[ID];
    ArrayList<char[]> listClaves = new ArrayList();
    Date Dia;

    public Seguridad(Date Dia, double Sueldo, int ID, String Nombre, int Edad, double Peso, String Residencia) {
        super(Sueldo, ID, Nombre, Edad, Peso, Residencia);
        this.Dia = Dia;
    }

    

    public char[] getContraseña() {
        return Contraseña;
    }

    public String getStringContraseña() {
        String Contraseña = "";
        for (int i = 0; i < this.Contraseña.length; i++) {
            char a = this.Contraseña[i];
            Contraseña += a;
        }
        return Contraseña;
    }

    public void setContraseña(char[] Contraseña) {
        this.Contraseña = Contraseña;
    }

    public ArrayList<char[]> getListClaves() {
        return listClaves;
    }

    public void setListClaves(ArrayList<char[]> listClaves) {
        this.listClaves = listClaves;
    }

    public Date getDia() {
        return Dia;
    }

    public void setDia(Date Dia) {
        this.Dia = Dia;
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

}
