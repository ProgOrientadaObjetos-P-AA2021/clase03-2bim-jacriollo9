/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author Usuario iTC
 */
public class Reporte {
    
    protected String codigo;
    
    public Reporte (String codigo){
        establecerCodigo(codigo);
    }
    
    public void establecerCodigo(String tipo){
        codigo = tipo;
    }
    
    public String obtenerCodigo(){
        return codigo;
    }
    
    @Override
    public String toString(){
        return String.format("Código: %s ", 
                obtenerCodigo());
    }
}
