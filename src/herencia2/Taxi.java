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
final public class Taxi extends Vehiculo {

    //Atributos
    private static int ult_licencia=1000; //licencia automática
    private int licencia;
    private boolean libre;
    private int ntaxistas;

    //Constructores
    public Taxi() {
    }

    public Taxi(boolean libre, int ntaxistas) {
        this.licencia = ult_licencia++; //licencia automática
        this.libre = libre;
        this.ntaxistas = ntaxistas;
    }

    public Taxi(boolean libre, int ntaxistas, String matricula, String modelo, int potencia) {
        super(matricula, modelo, potencia);
        this.licencia = ult_licencia++; //licencia automática
        this.libre = libre;
        this.ntaxistas = ntaxistas;
    }

    public Taxi(Taxi T) {
        super(T);
        this.licencia = ult_licencia++; //licencia automática
        this.libre = T.libre;
        this.ntaxistas = T.ntaxistas;
    }

    //Getters & Setters
    public int getLicencia() {
        return licencia;
    }

    public void setLicencia() {
        this.licencia = ult_licencia++;
    }

    public boolean isLibre() {
        return libre;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }

    public int getNtaxistas() {
        return ntaxistas;
    }

    public void setNtaxistas(int ntaxistas) {
        this.ntaxistas = ntaxistas;
    }

    //Métodos
    @Override
    public void mostrarAtributos() {
        super.mostrarAtributos();
        System.out.println("Licencia: " + this.licencia);
        System.out.print("Estado: ");
        if (this.libre) {
            System.out.println("Libre");
        } else {
            System.out.println("Ocupado");
        }
        System.out.println("Nº Taxistas: " + this.ntaxistas);
    }

    @Override
    public void pedirAlta() {
        super.pedirAlta();
        this.setLicencia(); //licencia automática
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce el nº de taxistas: ");
        this.setNtaxistas(leer.nextInt());
        System.out.println("Taxi libre");
        this.setLibre(true);
    }
}
