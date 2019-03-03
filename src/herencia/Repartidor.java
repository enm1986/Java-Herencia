/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.Scanner;

/**
 *
 * @author infor04
 */
final public class Repartidor extends Empleado {

    //Atributos
    private int horasT;
    private String zona;

    //Constructores
    public Repartidor() {
    }

    public Repartidor(int horasT, String zona) {
        this.horasT = horasT;
        this.zona = zona;
    }

    public Repartidor(int horasT, String zona, String nombre, String apellido1, String apellido2, String nif, int edad, float salario) {
        super(nombre, apellido1, apellido2, nif, edad, salario);
        this.horasT = horasT;
        this.zona = zona;
    }

    //Constructor copia
    public Repartidor(Repartidor R) {
        super(R);
        this.horasT = R.horasT;
        this.zona = R.zona;
    }

    //G&S
    public int getHorasT() {
        return horasT;
    }

    public void setHorasT(int horasT) {
        this.horasT = horasT;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    //Métodos
    @Override
    public void mostrarAtributos() {
        super.mostrarAtributos();
        System.out.println("Horas trabajadas: " + this.horasT);
        System.out.println("Zona: " + this.zona);
    }

    @Override
    public void pedirAlta() {
        super.pedirAlta();
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce las horas trabajadas: ");
        this.horasT = leer.nextInt();
        System.out.println("Introduce su zona: ");
        this.zona = leer.next();
    }
}
