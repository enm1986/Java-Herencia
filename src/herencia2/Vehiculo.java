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
public class Vehiculo {

    //Atributos
    protected static int ultimo_id = 1;

    private int id;
    private String matricula;
    private String modelo;
    private int potencia;

    //Constructores
    public Vehiculo() {

    }

    public Vehiculo(String matricula, String modelo, int potencia) {
        this.id = ultimo_id++;
        this.matricula = matricula.toUpperCase();
        this.modelo = modelo.substring(0, 1).toUpperCase() + modelo.substring(1).toLowerCase();
        this.potencia = potencia;
    }

    public Vehiculo(Vehiculo V) {
        this.id = V.id;
        this.matricula = V.matricula;
        this.modelo = V.modelo;
        this.potencia = V.potencia;
    }

    //Getters & Setters
    public int getId() {
        return id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula.toUpperCase();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo.substring(0, 1).toUpperCase() + modelo.substring(1).toLowerCase();
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        Scanner leer = new Scanner(System.in);
        while (potencia <= 0) {
            System.out.println("La potencia debe ser mayor que 0.\nVuelve a introducir la potencia:");
            potencia = leer.nextInt();
        }
        this.potencia = potencia;

    }

    //Métodos
    public void mostrarAtributos() {
        System.out.println("Id: " + this.id);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Potencia: " + this.potencia + "CV");
    }

    public void pedirAlta() {
        Scanner leer = new Scanner(System.in);
        this.id = ultimo_id++;
        System.out.println("Introduce la matrícula: ");
        this.setMatricula(leer.next());
        System.out.println("Introduce el modelo: ");
        this.setModelo(leer.next());
        System.out.println("Introduce la potencia: ");
        this.setPotencia(leer.nextInt());

    }

    public static void buscarVehiculoId(ArrayList<Vehiculo> lista) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce el ID del vehículo:");
        int id = leer.nextInt() - 1;
        if (id >= 0 && id < lista.size()) {
            System.out.println("___________________________");
            lista.get(id).mostrarAtributos();
        } else {
            System.out.println("El ID no corresponde a ningún vehículo");
        }
    }

    public static void buscarVehiculoMatricula(ArrayList<Vehiculo> lista) {
        Scanner leer = new Scanner(System.in);
        boolean encontrado = false;

        System.out.println("Introduce la matrícula (o parte de ella) del vehículo:");
        String busqueda = leer.next().toUpperCase();

        for (int i = 0; i < lista.size(); i++) { //bucle "for" porque busca también parte de la matrícula
            if (lista.get(i).getMatricula().contains(busqueda)) {
                System.out.println("___________________________");
                lista.get(i).mostrarAtributos();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se ha encontrado ninguna coincidencia");
        }
    }

}
