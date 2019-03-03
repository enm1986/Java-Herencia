/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author infor04
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Empleado> lista = new ArrayList<>();
        //lista.add(new Empleado("nombre", "ap1", "ap2", "nif", 0, 0));
        //lista.add(new Comercial(0, 0, "nombre", "ap1", "ap2", "nif", 0, 0));
        //lista.add(new Repartidor(0, "zona", "nombre", "ap1", "ap2", "nif", 0, 0));
        boolean salir = false;
        while (!salir) {
            switch (pedirOpcion()) {
                case 1:
                    System.out.println("Introduce un Empleado");
                    Empleado E = new Empleado();
                    E.pedirAlta();
                    lista.add(E);
                    break;
                case 2:
                    System.out.println("Introduce un Comercial");
                    Comercial C = new Comercial();
                    C.pedirAlta();
                    lista.add(C);
                    break;
                case 3:
                    System.out.println("Introduce un Repartidor");
                    Repartidor R = new Repartidor();
                    R.pedirAlta();
                    lista.add(R);
                    break;
                case 4:
                    for(int i=0;i<lista.size(); i++){
                        lista.get(i).mostrarAtributos();
                        System.out.println("___________________________");
                    }
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

    public static int pedirOpcion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("=============================");
        System.out.println(" 1) Introducir Empleado");
        System.out.println(" 2) Introducir Comercial");
        System.out.println(" 3) Introducir Repartidor");
        System.out.println(" 4) Mostrar empleados");
        System.out.println("=============================");
        System.out.println("¿Qué opción quieres?");
        return leer.nextInt();
    }
}
