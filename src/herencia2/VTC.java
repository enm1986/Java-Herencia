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
final public class VTC extends Vehiculo {

    //Atributos
    private int maxhoras;
    private int zonakm;
    private String ciudad;

    //Constructores
    public VTC() {
    }

    public VTC(int maxhoras, int zonakm, String ciudad) {
        this.setMaxhoras(maxhoras);
        this.setZonakm(zonakm);
        this.ciudad = ciudad.substring(0, 1).toUpperCase() + ciudad.substring(1).toLowerCase();
    }

    public VTC(int maxhoras, int zonakm, String ciudad, String matricula, String modelo, int potencia) {
        super(matricula, modelo, potencia);
        this.setMaxhoras(maxhoras);
        this.setZonakm(zonakm);
        this.ciudad = ciudad.substring(0, 1).toUpperCase() + ciudad.substring(1).toLowerCase();
    }

    public VTC(VTC V) {
        super(V);
        this.maxhoras = V.maxhoras;
        this.zonakm = V.zonakm;
        this.ciudad = V.ciudad;
    }

    //Getters & Setters
    public int getMaxhoras() {
        return maxhoras;
    }

    public void setMaxhoras(int maxhoras) {
        Scanner leer = new Scanner(System.in);
        while (maxhoras > 24) {
            System.out.println("No puede superar las 24 horas trabajadas.\nVuelve a introducir el nº horas trabajadas:");
            maxhoras = leer.nextInt();
        }
        this.maxhoras = maxhoras;
    }

    public int getZonakm() {
        return zonakm;
    }

    public void setZonakm(int zonakm) {
        Scanner leer = new Scanner(System.in);
        while (zonakm > 50) {
            System.out.println("El radio de acción no puede superar los 50km.\nVuelve a introducir el radio de la zona:");
            zonakm = leer.nextInt();
        }
        this.zonakm = zonakm;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad.substring(0, 1).toUpperCase() + ciudad.substring(1).toLowerCase();
    }

    //Métodos
    @Override
    public void mostrarAtributos() {
        super.mostrarAtributos();
        System.out.println("Max horas: " + this.maxhoras);
        System.out.println("Radio acción: " + this.zonakm + "km");
        System.out.println("Ciudad: " + this.ciudad);
    }

    @Override
    public void pedirAlta() {
        super.pedirAlta();
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce el nº de horas: ");
        this.setMaxhoras(leer.nextInt());
        System.out.println("Introduce el radio de acción (km): ");
        this.setZonakm(leer.nextInt());
        System.out.println("Introduce la ciudad: ");
        this.setCiudad(leer.next());
    }
}
