/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

import java.util.Scanner;

/**
 *
 * @author infor04
 */
final public class Autobus extends Vehiculo {

    //Atributos
    private int plazas;
    private int paradas;

    //Constructores
    public Autobus() {
    }

    public Autobus(int plazas, int paradas) {
        this.plazas = plazas;
        this.setParadas(paradas);
    }

    public Autobus(int plazas, int paradas, String matricula, String modelo, int potencia) {
        super(matricula, modelo, potencia);
        this.plazas = plazas;
        this.setParadas(paradas);
    }

    public Autobus(Autobus A) {
        super(A);
        this.plazas = A.plazas;
        this.paradas = A.paradas;
    }

    //Getters & Setters
    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    public int getParadas() {
        return paradas;
    }

    public void setParadas(int paradas) {
        Scanner leer = new Scanner(System.in);
        while (paradas > 20 || paradas <= 3) {
            System.out.println("El nº de paradas no está entre 3 y 20.\nVuelve a introducir el nº de paradas:");
            paradas = leer.nextInt();
        }
        this.paradas = paradas;
    }

    //Métodos
    @Override
    public void mostrarAtributos() {
        super.mostrarAtributos();
        System.out.println("Nº plazas: " + this.plazas);
        System.out.println("Nº paradas: " + this.paradas);
    }

    @Override
    public void pedirAlta() {
        super.pedirAlta();
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce el nº de plazas: ");
        this.setPlazas(leer.nextInt());
        System.out.println("Introduce nº de paradas: ");
        this.setParadas(leer.nextInt());
    }
}
