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
public class Errores extends Exception {

    public Errores(String message) {
        super(message);
    }

    public Errores AlmacenEquivocado(int op) throws Exception {

        if (op >= 4) {
            throw new Exception("Almacen equivocado");
        }

        return new Errores("");

    }

}
