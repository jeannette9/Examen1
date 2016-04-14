/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador_FRM_VentanaPrincipal;
import javax.swing.JOptionPane;

/**
 *
 * @author jeannette
 */
public class FRM_VentanaPrincipal extends javax.swing.JFrame {

    Controlador_FRM_VentanaPrincipal controlador;
    
    public FRM_VentanaPrincipal() {
        initComponents();
        controlador=new Controlador_FRM_VentanaPrincipal(this);
        volverEstadoInicial();
        
        gUI_Botones1.agregarEventos(controlador);
    }

    public String devolverNumeroRegistro()
    {
        return this.gUI_VentanaDatosAutomovil1.devolverNumeroRegistro();
    }
    
    public void mostrarInformacion(String arreglo[])
    {
        this.gUI_VentanaDatosAutomovil1.mostrarInformacion(arreglo);
    }
    
    public void bloquearNumeroRegistro()
    {
        this.gUI_VentanaDatosAutomovil1.bloquearNumeroRegistro();
    }
    
    public void habilitarBotones()
    {
        this.gUI_Botones1.habilitarBotones();
    }
    
    public void habilitarAgregar()
    {
        this.gUI_Botones1.habilitarAgregar();
        this.gUI_VentanaDatosAutomovil1.habilitarAgregar();
    }
    
    public void mostrarMensaje(String mensaje)
    {
        JOptionPane.showMessageDialog(null,mensaje);
    }
    
    public String[] devolverInformacion()
    {
        return this.gUI_VentanaDatosAutomovil1.devolverInformacion();
    }
    
    public void volverEstadoInicial()
    {
        this.gUI_Botones1.volverEstadoInicial();
        this.gUI_VentanaDatosAutomovil1.volverEstadoInicial();
    }
    
    public void limpiarTextField()
    {
        this.gUI_VentanaDatosAutomovil1.limpiarTextField();
    }
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gUI_VentanaDatosAutomovil1 = new Vista.GUI_VentanaDatosAutomovil();
        gUI_Botones1 = new Vista.GUI_Botones();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(gUI_VentanaDatosAutomovil1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gUI_Botones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(gUI_VentanaDatosAutomovil1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gUI_Botones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FRM_VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Vista.GUI_Botones gUI_Botones1;
    private Vista.GUI_VentanaDatosAutomovil gUI_VentanaDatosAutomovil1;
    // End of variables declaration//GEN-END:variables
}
