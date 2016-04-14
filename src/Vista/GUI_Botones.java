/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador_FRM_VentanaPrincipal;

/**
 *
 * @author jeannette
 */
public class GUI_Botones extends javax.swing.JPanel {

    Controlador_FRM_VentanaPrincipal controlador;
    
    public GUI_Botones() {
        initComponents();
    }

   public void agregarEventos( Controlador_FRM_VentanaPrincipal controlador)
   {
       this.controlador=controlador;
       
       this.btn_Buscar.addActionListener(controlador);
       this.btn_Agregar.addActionListener(controlador);
       this.btn_Modificar.addActionListener(controlador);
       this.btn_Eliminar.addActionListener(controlador);
       
       this.btn_Buscar.setActionCommand("Buscar");
       this.btn_Agregar.setActionCommand("Agregar");
       this.btn_Modificar.setActionCommand("Modificar");
       this.btn_Eliminar.setActionCommand("Eliminar");
   }
   
   public void habilitarBotones()
   {
       this.btn_Buscar.setEnabled(false);
       this.btn_Agregar.setEnabled(false);
       this.btn_Modificar.setEnabled(true);
       this.btn_Eliminar.setEnabled(true);
   }
   
   public void habilitarAgregar()
   {
        this.btn_Buscar.setEnabled(false);
        this.btn_Agregar.setEnabled(true);
        this.btn_Modificar.setEnabled(false);
        this.btn_Eliminar.setEnabled(false);

   }
   
   public void volverEstadoInicial()
   {
       this.btn_Buscar.setEnabled(true);
       this.btn_Agregar.setEnabled(false);
       this.btn_Modificar.setEnabled(false);
       this.btn_Eliminar.setEnabled(false);
   }
   
   
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Buscar = new javax.swing.JButton();
        btn_Agregar = new javax.swing.JButton();
        btn_Modificar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();

        btn_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N

        btn_Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar.png"))); // NOI18N

        btn_Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/modificar.png"))); // NOI18N

        btn_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Buscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(btn_Agregar)
                .addGap(47, 47, 47)
                .addComponent(btn_Modificar)
                .addGap(45, 45, 45)
                .addComponent(btn_Eliminar)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Buscar)
                    .addComponent(btn_Agregar)
                    .addComponent(btn_Modificar)
                    .addComponent(btn_Eliminar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Modificar;
    // End of variables declaration//GEN-END:variables
}
