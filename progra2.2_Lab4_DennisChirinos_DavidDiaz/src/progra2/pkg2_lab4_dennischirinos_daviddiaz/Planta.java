package progra2.pkg2_lab4_dennischirinos_daviddiaz;

import java.util.ArrayList;
import java.util.Random;

public class Planta extends Almacen{
    private int num_planta;

    public Planta() {
        super();
    }

    public Planta(int num_planta, int tamanio, int altura) {
        super(tamanio, altura);
        this.num_planta = num_planta;
    }

    public int getNum_planta() {
        return num_planta;
    }

    public void setNum_planta(int num_planta) {
        this.num_planta = num_planta;
    }

    @Override
    public String toString() {
        return "Planta{" + "num_planta=" + num_planta + '}';
    }
    
    

    public void antirrobo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
