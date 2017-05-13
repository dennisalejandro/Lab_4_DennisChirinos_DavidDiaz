package progra2.pkg2_lab4_dennischirinos_daviddiaz;

import java.util.ArrayList;
import java.util.Random;

public abstract class Almacen {

    ArrayList<Empleado> empleados = new ArrayList();
    ArrayList<Producto> productos = new ArrayList();
    private int tamanio;
    private int altura;
    ArrayList<Cliente> clientes = new ArrayList();

    public Almacen() {
    }

    public Almacen(int tamanio, int altura) {
        this.tamanio = tamanio;
        this.altura = altura;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void antirrobo1(String x) {
        int cont = 0, cont_2 = 0, cont_3 = 1, t = 0;
        char[][] matriz = new char[3][x.length()];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[1].length; j++) {
                if (i == cont_2 && j == cont) {
                    matriz[i][j] = x.charAt(cont);

                    if (t == 0) {
                        cont_2++;
                        cont++;
                    } else if (t == 1) {
                        cont_2--;
                        cont++;
                    }

                } else {
                    matriz[i][j] = '-';
                }

                if (cont_2 == 3) {
                    cont_2 = 1;
                    t = 1;
                } else if (cont_2 == -1) {
                    cont_2 = 0;
                    t = 0;
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[1].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println(" ");
        }
    }

    public boolean antirrobo2(String clave, String contraseña) {
        ArrayList<Integer> num = new ArrayList();
        ArrayList<Integer> num_2 = new ArrayList();
        String[][] matriz = new String[4][clave.length()];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[1].length; j++) {
                if (i == 0) {
                    matriz[i][j] = Character.toString(clave.charAt(j));
                } else if (i == 1) {
                    matriz[i][j] = verificar_letra(clave.charAt(j));
                    num_2.add(Integer.parseInt(verificar_letra(clave.charAt(j))));
                } else if (i == 2) {
                    matriz[i][j] = Character.toString(contraseña.charAt(j));
                    num.add(Integer.parseInt(verificar_letra(contraseña.charAt(j))));
                } else if (i == 3) {
                    System.out.println(num.get(j) + num_2.get(j));
                    matriz[i][j] = verificar_letra_inversa(num.get(j) + num_2.get(j));
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[1].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println(" ");
        }
        if (clave.length() == contraseña.length()) {
            return true;
        } else {
            return false;
        }
    }

    public void antirrobo3(String x) {
        String tem = "";
        System.out.println("hola");
        for (int i = x.length() - 1; i >= 0; i--) {
            System.out.println("etro");
            tem += x.charAt(i);
            System.out.println(tem);
        }
        System.out.println(x);
        System.out.println(tem);
    }

    public void antirrobo4(String c) {
        Random r = new Random();

        String s = "";

        for (int i = 0; i < c.length(); i++) {
            int R = 1 + r.nextInt(9);
            System.out.println(R);
            s += verificar_letra_inversa(R + Integer.parseInt(verificar_letra(c.charAt(i))));
        }
        System.out.println(c);
        System.out.println(s);

    }

    public static String verificar_letra(char x) {
        switch (x) {
            case 'a':
            case 'A':
                return "0";
            case 'b':
            case 'B':
                return "1";
            case 'c':
            case 'C':
                return "2";
            case 'd':
            case 'D':
                return "3";
            case 'e':
            case 'E':
                return "4";
            case 'f':
            case 'F':
                return "5";
            case 'g':
            case 'G':
                return "6";
            case 'h':
            case 'H':
                return "7";
            case 'i':
            case 'I':
                return "8";
            case 'j':
            case 'J':
                return "9";
            case 'k':
            case 'K':
                return "10";
            case 'l':
            case 'L':
                return "11";
            case 'm':
            case 'M':
                return "12";
            case 'n':
            case 'N':
                return "13";
            case 'o':
            case 'O':
                return "14";
            case 'p':
            case 'P':
                return "15";
            case 'q':
            case 'Q':
                return "16";
            case 'r':
            case 'R':
                return "17";
            case 's':
            case 'S':
                return "18";
            case 't':
            case 'T':
                return "19";
            case 'u':
            case 'U':
                return "20";
            case 'v':
            case 'V':
                return "21";
            case 'w':
            case 'W':
                return "22";
            case 'x':
            case 'X':
                return "23";
            case 'y':
            case 'Y':
                return "24";
            case 'z':
            case 'Z':
                return "25";
        }
        return " ";
    }

    public static String verificar_letra_inversa(int x) {
        if (x > 25) {
            x = x - 26;
        }
        switch (x) {
            case 0:
                return "A";
            case 1:
                return "B";
            case 2:
                return "C";
            case 3:
                return "D";
            case 4:
                return "E";
            case 5:
                return "F";
            case 6:
                return "G";
            case 7:
                return "H";
            case 8:
                return "I";
            case 9:
                return "J";
            case 10:
                return "K";
            case 11:
                return "L";
            case 12:
                return "M";
            case 13:
                return "N";
            case 14:
                return "O";
            case 15:
                return "P";
            case 16:
                return "Q";
            case 17:
                return "R";
            case 18:
                return "S";
            case 19:
                return "T";
            case 20:
                return "2U";
            case 21:
                return "V";
            case 22:
                return "W";
            case 23:
                return "X";
            case 24:
                return "Y";
            case 25:
                return "Z";
        }
        return " ";
    }

    @Override
    public String toString() {
        return "Almacen{" + "empleados=" + empleados + ", productos=" + productos + ", tamanio=" + tamanio + ", altura=" + altura + ", clientes=" + clientes + '}';
    }

}
