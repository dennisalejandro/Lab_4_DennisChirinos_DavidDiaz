/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2.pkg2_lab4_dennischirinos_daviddiaz;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author denni
 */
public class Progra22_Lab4_DennisChirinos_DavidDiaz {

    static int IDCount = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Empleado> listEmpleados = new ArrayList<>();
        ArrayList<Cliente> listClientes = new ArrayList<>();
        ArrayList<Producto> listProductos = new ArrayList<>();
        Regional regional = new Regional();
        Plataforma plataforma = new Plataforma();
        Temporal temporal = new Temporal();
        Planta planta = new Planta();

        while (true) {
            int op = Integer.parseInt(JOptionPane.showInputDialog("Ingrese opcion: \n"
                    + "1: Agregar Empleado\n"
                    + "2: Modificar Empleado\n"
                    + "3: Eliminar Empleado\n"
                    + "4: Agregar Cliente\n"
                    + "5: Modificar Cliente\n"
                    + "6: Eliminar Cliente\n"));
            switch (op) {
                case 1:
                    Empleado c = CrearEmpleado(0);
                    listEmpleados.add(c);
                    break;
                case 2:
                    Empleado c1 = CrearEmpleado(op);
                    for (int i = 0; i < listEmpleados.size(); i++) {
                        System.out.println("1: " + listEmpleados.get(i).getNombre());
                    }
                    int ID = Integer.parseInt(JOptionPane.showInputDialog("numero del empleado?: "));
                    listEmpleados.set(ID, c1);
                    break;
                case 3:
                    for (int i = 0; i < listEmpleados.size(); i++) {
                        System.out.println("1: " + listEmpleados.get(i).getNombre());
                    }
                    int s = Integer.parseInt(JOptionPane.showInputDialog("numero del empleado?: "));

                    listEmpleados.remove(s);
                    break;
                case 4:
                    Cliente cl = CrearCliente(0);
                    listClientes.add(cl);
                    IDCount++;
                    break;
                case 5:

                    for (int i = 0; i < listClientes.size(); i++) {
                        System.out.println("1: " + listClientes.get(i).getNombre());
                    }
                    Cliente cl5 = CrearCliente(0);
                    int ID5 = Integer.parseInt(JOptionPane.showInputDialog("ID: "));
                    listClientes.set(ID5, cl5);

                    break;
                case 6:
                    for (int i = 0; i < listEmpleados.size(); i++) {
                        System.out.println("1: " + listEmpleados.get(i).getNombre());
                    }
                    int ID6 = Integer.parseInt(JOptionPane.showInputDialog("ID: "));
                    listClientes.remove(ID6);
                    break;
                case 7:

                    Producto c7 = CrearProducto(0);
                    int al = Integer.parseInt(JOptionPane.showInputDialog("Cual Almacen?: \n"
                            + "Regional\n"
                            + "Planta\n"
                            + "Plataforma\n"
                            + "Temporal\n"));

                    switch (al) {
                        case 1:
                            if (regional.antirrobo2(JOptionPane.showInputDialog("Clave"), JOptionPane.showInputDialog("Contraseña"))) {
                                regional.productos.add(c7);
                            }
                            break;
                        case 2:
                            if (planta.antirrobo2(JOptionPane.showInputDialog("Clave"), JOptionPane.showInputDialog("Contraseña"))) {
                                regional.productos.add(c7);
                            }
                            planta.productos.add(c7);
                            break;
                        case 3:
                            if (plataforma.antirrobo2(JOptionPane.showInputDialog("Clave"), JOptionPane.showInputDialog("Contraseña"))) {
                                regional.productos.add(c7);
                            }
                            plataforma.productos.add(c7);
                            break;
                        case 4:
                            if (temporal.antirrobo2(JOptionPane.showInputDialog("Clave"), JOptionPane.showInputDialog("Contraseña"))) {
                                regional.productos.add(c7);
                            }
                            temporal.productos.add(c7);
                            break;
                    }
                    try {
                        if ((al > 4) || (al <= 0)) {
                            throw new Errores("Almacen Equivocado");
                        }

                    } catch (Errores e) {
                    }

                    break;
                case 8:
                    //Ventas
                    int AlmOp = Integer.parseInt(JOptionPane.showInputDialog("Ingrese almacen: "));
                    switch (AlmOp) {
                        case 1:
                            for (int i = 0; i < regional.productos.size(); i++) {
                                System.out.println(i + ": " + regional.productos.get(i).getNombre());
                            }
                            int ProOp = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Producto: "));
                            for (int i = 0; i < listClientes.size(); i++) {
                                System.out.println(i + ": " + listClientes.get(i).getNombre());
                            }
                            int CliOp = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Cliente: "));
                            listClientes.get(CliOp).listProducto.add(regional.productos.get(ProOp));
                            listClientes.get(CliOp).Frecuencia++;
                            if (regional.productos.get(ProOp).getNum_producto() <= 0) {
                                regional.productos.remove(ProOp);
                            } else {
                                int p = regional.productos.get(ProOp).getNum_producto();
                                regional.productos.get(ProOp).setNum_producto(p - 1);
                            }
                            break;
                        case 2:
                            for (int i = 0; i < planta.productos.size(); i++) {
                                System.out.println(i + ": " + planta.productos.get(i).getNombre());
                            }
                            int ProOp1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Producto: "));
                            for (int i = 0; i < listClientes.size(); i++) {
                                System.out.println(i + ": " + listClientes.get(i).getNombre());
                            }
                            int CliOp1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Cliente: "));
                            listClientes.get(CliOp1).listProducto.add(planta.productos.get(ProOp1));
                            listClientes.get(CliOp1).Frecuencia++;
                            if (planta.productos.get(ProOp1).getNum_producto() <= 0) {
                                planta.productos.remove(ProOp1);
                            } else {
                                int p = planta.productos.get(ProOp1).getNum_producto();
                                planta.productos.get(ProOp1).setNum_producto(p - 1);
                            }
                            break;
                        case 3:
                            for (int i = 0; i < plataforma.productos.size(); i++) {
                                System.out.println(i + ": " + plataforma.productos.get(i).getNombre());
                            }
                            int ProOp3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Producto: "));
                            for (int i = 0; i < listClientes.size(); i++) {
                                System.out.println(i + ": " + listClientes.get(i).getNombre());
                            }
                            int CliOp3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Cliente: "));
                            listClientes.get(CliOp3).listProducto.add(plataforma.productos.get(ProOp3));
                            listClientes.get(CliOp3).Frecuencia++;
                            if (plataforma.productos.get(ProOp3).getNum_producto() <= 0) {
                                plataforma.productos.remove(ProOp3);
                            } else {
                                int p = planta.productos.get(ProOp3).getNum_producto();
                                plataforma.productos.get(ProOp3).setNum_producto(p - 1);
                            }
                            break;
                        case 4:
                            for (int i = 0; i < temporal.productos.size(); i++) {
                                System.out.println(i + ": " + temporal.productos.get(i).getNombre());
                            }
                            int ProOp4 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Producto: "));
                            for (int i = 0; i < listClientes.size(); i++) {
                                System.out.println(i + ": " + listClientes.get(i).getNombre());
                            }
                            int CliOp4 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Cliente: "));
                            listClientes.get(CliOp4).listProducto.add(temporal.productos.get(ProOp4));
                            listClientes.get(CliOp4).Frecuencia++;
                            if (temporal.productos.get(ProOp4).getNum_producto() <= 0) {
                                temporal.productos.remove(ProOp4);
                            } else {
                                int p = temporal.productos.get(ProOp4).getNum_producto();
                                temporal.productos.get(ProOp4).setNum_producto(p - 1);
                            }
                            break;
                    }
                    break;
                case 10:
                    System.out.println("Reporte: ");
                    ArrayList<Cliente> ReporteCli = listClientes;
                    ArrayList<Producto> ReporteVen = listProductos;
                    ArrayList<Producto> ReporteFecha = listProductos;
                    Collections.sort(ReporteCli, new Comparator() {
                        public int compare(Object o1, Object o2) {
                            Integer x1 = (int) ((Cliente) o1).Frecuencia;
                            Integer x2 = (int) ((Cliente) o2).Frecuencia;
                            return x1.compareTo(x2);
                        }
                    });
                    Collections.sort(ReporteVen, new Comparator() {
                        public int compare(Object o1, Object o2) {
                            Integer x1 = (int) ((Producto) o1).getNum_producto();
                            Integer x2 = (int) ((Producto) o2).getNum_producto();
                            return x1.compareTo(x2);
                        }
                    });
                    Collections.sort(ReporteFecha, new Comparator() {
                        public int compare(Object o1, Object o2) {
                            Date x1 = ((Producto) o1).getFecha_emision();
                            Date x2 = ((Producto) o1).getFecha_emision();
                            return x1.compareTo(x2);
                        }
                    });
                    Collections.reverse(ReporteCli);
                    Frame f = new Frame(ReporteCli, ReporteVen, ReporteFecha);
                    f.setVisible(true);
                    break;
            }
        }
    }

    public static Producto CrearProducto(int Serie) {
        Date Emision = new Date();
        int Tamaño = Integer.parseInt(JOptionPane.showInputDialog("Tamaño: "));
        double Precio = Double.parseDouble(JOptionPane.showInputDialog("Precio: "));
        String Descripcion = (JOptionPane.showInputDialog("Descripcion: "));
        String Nombre = (JOptionPane.showInputDialog("Nombre: "));
        int Num = Integer.parseInt(JOptionPane.showInputDialog("Num: "));
        int vida_util = Integer.parseInt(JOptionPane.showInputDialog("Vida Util: "));
        Producto c = new Producto(Emision, vida_util, Precio, Tamaño, Descripcion, Nombre, Num);
        return c;
    }

////////////
    public static Carga CrearCarga(int Serie) {
        double Sueldo = Double.parseDouble(JOptionPane.showInputDialog("Sueldo: "));
        int ID = Integer.parseInt(JOptionPane.showInputDialog("ID: "));
        String Nombre = (JOptionPane.showInputDialog("Nombre: "));
        int Edad = Integer.parseInt(JOptionPane.showInputDialog("Edad: "));
        double Altura = Double.parseDouble(JOptionPane.showInputDialog("Altura: "));
        double Peso = Double.parseDouble(JOptionPane.showInputDialog("Peso: "));
        String Residencia = (JOptionPane.showInputDialog("Residencia: "));
        int Entrada = Integer.parseInt(JOptionPane.showInputDialog("Entrada: "));
        int Salida = Integer.parseInt(JOptionPane.showInputDialog("Salida: "));
        Date Inicio = new Date();
        Carga s = new Carga(Entrada, Salida, Inicio, Sueldo, ID, Nombre, Edad, Peso, Residencia);
        return s;
    }

/////////////
    public static Persona CrearPersona(int Serie) {
        int ID = Integer.parseInt(JOptionPane.showInputDialog("ID: "));
        String Nombre = (JOptionPane.showInputDialog("Nombre: "));
        int Edad = Integer.parseInt(JOptionPane.showInputDialog("Edad: "));
        double Altura = Double.parseDouble(JOptionPane.showInputDialog("Altura: "));
        double Peso = Double.parseDouble(JOptionPane.showInputDialog("Peso: "));
        String Residencia = (JOptionPane.showInputDialog("Residencia: "));
        Persona c = new Persona(ID, Nombre, Edad, Peso, Residencia);
        return c;
    }

////////////////////////////
    public static Empleado CrearEmpleado(int Serie) {
        double Sueldo = Double.parseDouble(JOptionPane.showInputDialog("Sueldo: "));
        int ID = Integer.parseInt(JOptionPane.showInputDialog("ID: "));
        String Nombre = (JOptionPane.showInputDialog("Nombre: "));
        int Edad = Integer.parseInt(JOptionPane.showInputDialog("Edad: "));
        double Altura = Double.parseDouble(JOptionPane.showInputDialog("Altura: "));
        double Peso = Double.parseDouble(JOptionPane.showInputDialog("Peso: "));
        String Residencia = (JOptionPane.showInputDialog("Residencia: "));
        Empleado c = new Empleado(Sueldo, ID, Nombre, Edad, Peso, Residencia);
        return c;
    }

    public static Cliente CrearCliente(int Serie) {
        int ID = IDCount;
        String Nombre = (JOptionPane.showInputDialog("Nombre: "));
        int Edad = Integer.parseInt(JOptionPane.showInputDialog("Edad: "));
        double Altura = Double.parseDouble(JOptionPane.showInputDialog("Altura: "));
        double Peso = Double.parseDouble(JOptionPane.showInputDialog("Peso: "));
        String Residencia = (JOptionPane.showInputDialog("Residencia: "));
        double Dinero = Double.parseDouble(JOptionPane.showInputDialog("Dinero: "));
        Cliente c = new Cliente(Dinero, ID, Nombre, Edad, Peso, Residencia);
        return c;
    }
}
