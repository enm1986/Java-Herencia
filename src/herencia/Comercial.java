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
final public class Comercial extends Empleado {

    //Atributos
    private int ventas;
    private float comision;

    //Constructores
    public Comercial() {
    }

    public Comercial(int ventas, float comision) {
        this.ventas = ventas;
        this.comision = comision;
    }

    public Comercial(int ventas, float comision, String nombre, String apellido1, String apellido2, String nif, int edad, float salario) {
        super(nombre, apellido1, apellido2, nif, edad, salario);
        this.ventas = ventas;
        this.comision = comision;
    }
    
    //Constructor copia
    public Comercial(Comercial C) {
        super(C);
        this.ventas = C.ventas;
        this.comision = C.comision;
    }
    
    //Getters & Setters
    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public float getComision() {
        return comision;
    }

    public void setComision(float comision) {
        this.comision = comision;
    }

    //Métodos
    @Override
    public void mostrarAtributos() {
        super.mostrarAtributos();
        System.out.println("Ventas: " + this.ventas);
        System.out.println("Comisión: " + this.comision);
    }
    
    @Override
    public void pedirAlta() {
        super.pedirAlta();
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce sus ventas: ");
        this.ventas = leer.nextInt();
        System.out.println("Introduce su comisión: ");
        this.comision = leer.nextFloat();
    }
}
