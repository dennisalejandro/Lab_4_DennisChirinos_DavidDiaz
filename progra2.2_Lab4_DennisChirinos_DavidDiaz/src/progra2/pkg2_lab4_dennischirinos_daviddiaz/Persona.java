/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2.pkg2_lab4_dennischirinos_daviddiaz;

/**
 *
 * @author denni
 */
public class Persona {
    int ID;
    String Nombre;
    int Edad;
    double Altura;
    double Peso;
    String Residencia;

    public Persona(int ID, String Nombre, int Edad, double Peso, String Residencia) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Peso = Peso;
        this.Residencia = Residencia;
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

    @Override
    public String toString() {
        return "Persona{" + "ID=" + ID + ", Nombre=" + Nombre + ", Edad=" + Edad + ", Peso=" + Peso + ", Residencia=" + Residencia + '}';
    }
    
}
