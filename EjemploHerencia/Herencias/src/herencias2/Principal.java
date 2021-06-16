/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias2;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("ELIJA LO QUE DECEA INGRESAR\n1. Estudiante"
                + "\n2. Docente\n3. Policia");
        int op = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese el nombre");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese el apellido");
        String apellido = entrada.nextLine();
        System.out.println("Ingrese la edad");
        int edad = entrada.nextInt();
        entrada.nextLine();
        if (op == 1) {
            System.out.println("Ingrese el valor de matricula");
            double matricula = entrada.nextDouble();
            Estudiante estudiante = new Estudiante(nombre, apellido, edad, matricula);
            System.out.println(estudiante);
        } else if (op == 2) {
            System.out.println("Ingrese el sueldo");
            double sueldo = entrada.nextDouble();
            Docente d = new Docente(nombre, apellido, edad, sueldo);
            System.out.println(d);
        } else if (op == 3) {
            System.out.println("Ingrese el rango");
            String ran = entrada.nextLine();
            Policia p = new Policia(nombre, apellido, edad, ran);
            System.out.println(p);
        }
    }
}
