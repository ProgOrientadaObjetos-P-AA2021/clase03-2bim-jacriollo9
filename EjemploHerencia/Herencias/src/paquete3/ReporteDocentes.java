/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import herencias2.Docente;
import java.util.ArrayList;

/**
 *
 * @author Usuario iTC
 */
public class ReporteDocentes extends Reporte{
    
    private double promedioSueldos;
    private ArrayList<Docente> listaDocente;
    
    public ReporteDocentes(String codigo, ArrayList<Docente> listadocentes){
        super(codigo);
        establecerListaDocente(listadocentes);
    }
    
    public void establecerPromedioSueldos(){
       double suma = 0;
       for(int i=0; i<listaDocente.size();i++){
           suma = suma + obtenerListaDocente().get(i).getSueldo();
           
       }
       promedioSueldos = suma/listaDocente.size();
        
    }
    public void establecerListaDocente(ArrayList<Docente> tipo){
        listaDocente = tipo;       
    }
    
    public ArrayList<Docente> obtenerListaDocente(){
        return listaDocente;
    }
    public double obtenerPromedioSueldos(){
        return promedioSueldos;
    }
    
    @Override
    public String toString(){  
        String cadena = String.format("%s\nReporte Docentes\n",
                super.toString());
        
        for(int i=0;i<listaDocente.size();i++){
            cadena = String.format("%sNombre: %s\nApelldio: %s\n"
                    + "Edad: %d\nSueldo: %.2f\n",cadena,
                    obtenerListaDocente().get(i).getNombre(),
                    obtenerListaDocente().get(i).getApellido(),
                    obtenerListaDocente().get(i).getEdad(),
                    obtenerListaDocente().get(i).getSueldo());
        }
        cadena = String.format("%s\nPromedio de sueldos: %.2f\n",
                cadena,obtenerPromedioSueldos());
        return cadena;
    }
}

