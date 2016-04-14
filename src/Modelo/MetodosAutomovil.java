/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author jeannette
 */
public class MetodosAutomovil {
    
    ArrayList <Automovil> arrayAutomovil;
    String arregloDatos[];

    public MetodosAutomovil() {
        
        arrayAutomovil=new ArrayList <Automovil>();
        arregloDatos=new String[4];
    }
    
    public boolean buscarAutomovil(String numeroRegistro)
    {
       boolean encontro=false;
       
       for(int contador=0;contador<arrayAutomovil.size();contador++)
       {
           if(arrayAutomovil.get(contador).getNumeroRegistro().equals(numeroRegistro))
           {
               encontro=true;
               
               arregloDatos[0]=arrayAutomovil.get(contador).getNumeroRegistro();
               arregloDatos[1]=arrayAutomovil.get(contador).getNombreDueño();
               arregloDatos[2]=arrayAutomovil.get(contador).getCedulaDueño();
               arregloDatos[3]=arrayAutomovil.get(contador).getPlacaAutomovil();
               
           }
       
       }//end for
       return encontro;
    }
    
    public void agregarAutomovil(String informacion[])
    {
        Automovil temporal=new Automovil(informacion[0],informacion[1], informacion[2],informacion[3]);
        arrayAutomovil.add(temporal);
    }
    
    public void modificarAutomovil(String informacion[])
    {
        String arrayCarro[]=new String[4];
        
        for(int contador=0; contador<arrayAutomovil.size();contador++)
        {
          if(arrayAutomovil.get(contador).getNumeroRegistro().equals(informacion[0]))
          {
              arrayAutomovil.get(contador).setNumeroRegistro(informacion[0]);
              arrayAutomovil.get(contador).setNombreDueño(informacion[1]);
              arrayAutomovil.get(contador).setCedulaDueño(informacion[2]);
              arrayAutomovil.get(contador).setPlacaAutomovil(informacion[3]);
          }
        }//end for
    }
    
    public void eliminarEstudiante(String informacion[])
    {
        for(int contador=0; contador<arrayAutomovil.size();contador++)
        {
          if(arrayAutomovil.get(contador).getNumeroRegistro().equals(informacion[0]))
          {
              arrayAutomovil.remove(contador);
          }
        }
    }
    
    
    public String[] getArregloInformacion()
    {
        return arregloDatos;
    }
    
    
    
    
    
    
    
}//end class
