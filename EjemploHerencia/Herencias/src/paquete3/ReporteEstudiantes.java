/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import herencias2.Estudiante;
import java.util.ArrayList;

/**
 *
 * @author Usuario iTC
 */
public class ReporteEstudiantes extends Reporte{
    
    private double promedioMatriculas;
    private ArrayList<Estudiante> listaEstudinate;
    
    public ReporteEstudiantes (String codigo,ArrayList<Estudiante> listaestudiantes){
        super(codigo);
        establecerListaEstudiante(listaestudiantes);
    }
    
    public void establecerPromedioMatriculas(){
       double suma = 0;
       for(int i=0; i<listaEstudinate.size();i++){
           suma = suma + obtenerListaEstudiante().get(i).getMatricula();
           
       }
       promedioMatriculas = suma/listaEstudinate.size();
        
    }
    
    public void establecerListaEstudiante(ArrayList<Estudiante> tipo){
        listaEstudinate = tipo;       
    }
    
    public double obtenerPromedioMatriculas(){
        return promedioMatriculas;
    }
    public ArrayList<Estudiante> obtenerListaEstudiante(){
        return listaEstudinate;
    }
    
    @Override
    public String toString(){  
        String cadena = String.format("%s\nReporte Estudiantes\n",
                super.toString());
        
        for(int i=0;i<listaEstudinate.size();i++){
            cadena = String.format("%sNombre: %s\nApelldio: %s\n"
                    + "Edad: %d\nMatricula: %.2f\n",cadena,
                    obtenerListaEstudiante().get(i).getNombre(),
                    obtenerListaEstudiante().get(i).getApellido(),
                    obtenerListaEstudiante().get(i).getEdad(),
                    obtenerListaEstudiante().get(i).getMatricula());
        }
        cadena = String.format("%s\nPromedio de matriculas: %.2f\n",
                cadena,obtenerPromedioMatriculas());
        return cadena;
    }
    
}

