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
public class Empleado {

    //Atributos
    protected String nombre;
    protected String apellido1;
    protected String apellido2;
    protected String nif;
    protected int edad;
    private float salario;

    //Constructores
    public Empleado() {
    }

    public Empleado(String nombre, String apellido1, String apellido2, String nif, int edad, float salario) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nif = nif;
        this.edad = edad;
        this.salario = salario;
    }

    //Constructor copia
    public Empleado(Empleado E) {
        this.nombre = E.nombre;
        this.apellido1 = E.apellido1;
        this.apellido2 = E.apellido2;
        this.nif = E.nif;
        this.edad = E.edad;
        this.salario = E.salario;
    }

    //Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.substring(0, 1).toUpperCase() + nombre.substring(1);
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1.substring(0, 1).toUpperCase() + apellido1.substring(1);
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2.substring(0, 1).toUpperCase() + apellido2.substring(1);
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        Scanner leer = new Scanner(System.in);
        while (edad < 16) {
            System.out.println("La edad debe ser de al menos 16 años,\nvuelve a introducir la edad: ");
            edad = leer.nextInt();
        }
        this.edad = edad;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    //Métodos
    public void mostrarAtributos() {
        System.out.println("Apellido 1: " + this.apellido1);
        System.out.println("Apellido 2: " + this.apellido2);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("NIF: " + this.nif);
        System.out.println("Edad: " + this.edad);
        System.out.println("Salario: " + this.salario);
    }

    public void pedirAlta() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce el Apellido 1: ");
        this.setApellido1(leer.next());
        System.out.println("Introduce el Apellido2: ");
        this.setApellido2(leer.next());
        System.out.println("Introduce el Nombre: ");
        this.setNombre(leer.next());
        System.out.println("Introduce el NIF: ");
        this.setNif(leer.next());
        System.out.println("Introduce la edad: ");
        this.setEdad(leer.nextInt());
        System.out.println("Introduce el Salario: ");
        this.setSalario(leer.nextFloat());
    }

}
