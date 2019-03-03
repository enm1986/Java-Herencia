/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author infor04
 */
public class Herencia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        ArrayList<Vehiculo> lista = new ArrayList<>();

        /*Vehiculos para pruebas*/
        lista.add(new Taxi(true, 2, "1111AAA", "qwer", 100));
        lista.add(new Taxi(false, 1, "2255Bbb", "qwerZ", 120));
        lista.add(new VTC(24, 50, "Palma", "3333Ccc", "asdf", 125));
        lista.add(new VTC(18, 35, "Inca", "1166Ddd", "asdf", 125));
        lista.add(new Autobus(20, 20, "5555Eee", "zxcv", 1222));
        lista.add(new Autobus(30, 15, "6644Fff", "zxcvB", 1222));
        /*Vehiculos para pruebas*/

        boolean salir = false;
        while (!salir) {
            switch (pedirOpcion()) {
                case 1:
                    System.out.println("Dar de alta Taxi");
                    Taxi T = new Taxi();
                    T.pedirAlta();
                    lista.add(T);
                    break;
                case 2:
                    System.out.println("Dar de alta Autobús");
                    Autobus A = new Autobus();
                    A.pedirAlta();
                    lista.add(A);
                    break;
                case 3:
                    System.out.println("Dar de alta VTC");
                    VTC V = new VTC();
                    V.pedirAlta();
                    lista.add(V);
                    break;
                case 4:
                    System.out.println("Buscar vehículo por ID:");
                    Vehiculo.buscarVehiculoId(lista);
                    break;
                case 5:
                    System.out.println("Buscar vehículo por Matrícula:");
                    Vehiculo.buscarVehiculoMatricula(lista);
                    break;
                case 6:
                    System.out.println("Buscando Taxi libre...");
                    buscarTaxiLibre(lista);
                    break;
                case 7:
                    System.out.println("Buscando Taxi libre...");
                    buscarTaxiId(lista);
                    break;
                case 8:
                    System.out.println("Lista de vehículos");
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println("___________________________");
                        lista.get(i).mostrarAtributos();
                    }
                    break;
                case 9:
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
        System.out.println(" 1) Dar de alta Taxi");
        System.out.println(" 2) Dar de alta Autobús");
        System.out.println(" 3) Dar de alta VTC");
        System.out.println(" 4) Buscar vehículo por Id");
        System.out.println(" 5) Buscar vehículo por Matrícula");
        System.out.println(" 6) Buscar Taxi libre");
        System.out.println(" 7) Buscar Taxi por Id");
        System.out.println(" 8) Mostrar todos los vehículos");
        System.out.println(" 9) Salir");
        System.out.println("=============================");
        System.out.println("¿Qué opción quieres?");
        return leer.nextInt();
    }

    // 1. Busca en la lista de vehículos un taxi
    // 2. Comprueba si el taxi está libre
    // 3. Si está libre lo pone a ocupado
    public static void buscarTaxiLibre(ArrayList<Vehiculo> lista) {
        boolean libre = false;
        int i = 0;
        while (!libre && i < lista.size()) {
            if (lista.get(i) instanceof Taxi) {
                if (((Taxi) lista.get(i)).isLibre()) { //Casting de variables
                    System.out.println("___________________________");
                    lista.get(i).mostrarAtributos();
                    System.out.println("Libre >> OCUPADO");
                    ((Taxi) lista.get(i)).setLibre(libre);
                    libre = true;
                }
            }
            i++;
        }
        if (!libre) {
            System.out.println("No hay Taxis libres");
        }
    }

    // Busca en la lista de vehículos todos los taxis ocupados
    public static void buscarTaxiId(ArrayList<Vehiculo> lista) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Taxis ocupados: ");
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) instanceof Taxi) {
                if (!((Taxi) lista.get(i)).isLibre()) { //Casting de objetos
                    System.out.println("___________________________");
                    lista.get(i).mostrarAtributos();
                }
            }
        }
        System.out.println("___________________________");
        System.out.println("Introduce el Id del Taxi: ");
        int i = leer.nextInt() - 1;
        if (lista.get(i) instanceof Taxi) {
            if (!((Taxi) lista.get(i)).isLibre()) {
                ((Taxi) lista.get(i)).setLibre(true);
                System.out.println("El Taxi ya no está ocupado");
            } else {
                System.out.println("El Id corresponde a un Taxi libre");
            }
        } else {
            System.out.println("El Id no corresponde a un Taxi");
        }
    }
}
