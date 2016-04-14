/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MetodosAutomovil;
import Vista.FRM_VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author jeannette
 */
public class Controlador_FRM_VentanaPrincipal implements ActionListener {
    
    FRM_VentanaPrincipal ventana;
    MetodosAutomovil metodos;
    
    public Controlador_FRM_VentanaPrincipal( FRM_VentanaPrincipal ventana)
    {
        this.ventana=ventana;
        metodos=new MetodosAutomovil();
    }
  
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Buscar"))
        {
            buscar();
        }
        
        if(e.getActionCommand().equals("Agregar"))
        {
            metodos.agregarAutomovil(ventana.devolverInformacion());
            ventana.volverEstadoInicial();
            ventana.limpiarTextField();
            ventana.mostrarMensaje("Automóvil agregado");
        }
        
        if(e.getActionCommand().equals("Modificar"))
        {
            metodos.modificarAutomovil(ventana.devolverInformacion());
            ventana.volverEstadoInicial();
            ventana.limpiarTextField();
            ventana.mostrarMensaje("La modificación fue correcta");
        }
        
        if(e.getActionCommand().equals("Eliminar"))
        {
            metodos.eliminarEstudiante(ventana.devolverInformacion());
            ventana.volverEstadoInicial();
            ventana.limpiarTextField();
            ventana.mostrarMensaje("Eliminado de forma correcta");
        }
    }
    
    
    public void buscar()
    {
        if(metodos.buscarAutomovil(ventana.devolverNumeroRegistro()))
        {
            ventana.mostrarInformacion(metodos.getArregloInformacion());
            ventana.bloquearNumeroRegistro();
            ventana.habilitarBotones();
        }
        else
        {
            ventana.habilitarAgregar();
            ventana.mostrarMensaje("El automóvil NO se encuentra registrado");
        }
    }
    
}//end class
