/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias2;

/**
 *
 * @author Usuario iTC
 */
public class Docente extends Persona {
    
    private double sueldo;

    public Docente(String n, String a, int e, double sueldo) {
        super(n, a, e);
        this.sueldo = sueldo;
    }

    public void setSueldo(double sueldo) {
        sueldo = sueldo; 
        if (sueldo < 1000){
            sueldo = 1000;   
        } else {
            sueldo = sueldo;
        }
    }

    public double getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {

        return String.format("%s - Sueldo: %.2f$", 
                            super.toString(),getSueldo());
    }
}

