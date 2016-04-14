/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author jeannette
 */
public class GUI_VentanaDatosAutomovil extends javax.swing.JPanel {

    /**
     * Creates new form GUI_VentanaDatosAutomovil
     */
    public GUI_VentanaDatosAutomovil() {
        initComponents();
    }

    public String devolverNumeroRegistro()
    {
        return this.jt_NumeroRegistro.getText();
    }
    
    public void mostrarInformacion(String arreglo[])
    {
        this.jt_NumeroRegistro.setText(arreglo[0]);
        this.jt_NombreDueño.setText(arreglo[1]);
        this.jt_CedulaDueño.setText(arreglo[2]);
        this.jt_PlacaAutomovil.setText(arreglo[3]);
    }
    
    public void bloquearNumeroRegistro()
    {
        this.jt_NumeroRegistro.setEnabled(false);
        this.jt_NombreDueño.setEnabled(true);
        this.jt_CedulaDueño.setEnabled(true);
        this.jt_PlacaAutomovil.setEnabled(true);
    }
    
    public void habilitarAgregar()
    {
        this.jt_NumeroRegistro.setEnabled(true);
        this.jt_NombreDueño.setEnabled(true);
        this.jt_CedulaDueño.setEnabled(true);
        this.jt_PlacaAutomovil.setEnabled(true);
    }
    
    public String[] devolverInformacion()
    {
        String array[];
        array=new String [4];
        
        array[0]=this.jt_NumeroRegistro.getText();
        array[1]=this.jt_NombreDueño.getText();
        array[2]=this.jt_CedulaDueño.getText();
        array[3]=this.jt_PlacaAutomovil.getText();
        
        return array;
    }
    
    public void limpiarTextField()
    {
        this.jt_NumeroRegistro.setText("");
        this.jt_NombreDueño.setText("");
        this.jt_CedulaDueño.setText("");
        this.jt_PlacaAutomovil.setText("");
    }
    
    public void volverEstadoInicial()
    {
        this.jt_NumeroRegistro.setEnabled(true);
        this.jt_NombreDueño.setEnabled(false);
        this.jt_CedulaDueño.setEnabled(false);
        this.jt_PlacaAutomovil.setEnabled(false);
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_NumeroRegistro = new javax.swing.JLabel();
        jl_NombreDueño = new javax.swing.JLabel();
        jl_CedulaDueño = new javax.swing.JLabel();
        jl_PlacaAutomovil = new javax.swing.JLabel();
        jt_NumeroRegistro = new javax.swing.JTextField();
        jt_NombreDueño = new javax.swing.JTextField();
        jt_CedulaDueño = new javax.swing.JTextField();
        jt_PlacaAutomovil = new javax.swing.JTextField();

        jl_NumeroRegistro.setText("Número de Registro");

        jl_NombreDueño.setText("Nombre del Dueño");

        jl_CedulaDueño.setText("Cédula del Dueño");

        jl_PlacaAutomovil.setText("Placa del Automóvil");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jl_PlacaAutomovil)
                        .addGap(18, 18, 18)
                        .addComponent(jt_PlacaAutomovil, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_NumeroRegistro)
                            .addComponent(jl_NombreDueño)
                            .addComponent(jl_CedulaDueño))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jt_NombreDueño, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jt_CedulaDueño)
                            .addComponent(jt_NumeroRegistro))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_NumeroRegistro)
                    .addComponent(jt_NumeroRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jl_NombreDueño)
                    .addComponent(jt_NombreDueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_CedulaDueño)
                    .addComponent(jt_CedulaDueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_PlacaAutomovil)
                    .addComponent(jt_PlacaAutomovil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jl_CedulaDueño;
    private javax.swing.JLabel jl_NombreDueño;
    private javax.swing.JLabel jl_NumeroRegistro;
    private javax.swing.JLabel jl_PlacaAutomovil;
    private javax.swing.JTextField jt_CedulaDueño;
    private javax.swing.JTextField jt_NombreDueño;
    private javax.swing.JTextField jt_NumeroRegistro;
    private javax.swing.JTextField jt_PlacaAutomovil;
    // End of variables declaration//GEN-END:variables
}
