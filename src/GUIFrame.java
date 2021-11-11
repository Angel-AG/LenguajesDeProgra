/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sdegante
 */
public class GUIFrame extends javax.swing.JFrame {

    
    
    // Values 
    // private
    private Integer numProductores;
    private Integer numConsumidores;
    private Integer esperaProductores;
    private Integer esperaConsumidores;
    private Integer tamanoBuffer;
    private Integer valorN;
    private Integer valorM;
    static private GUIFrame guiH;
    // public
    
    public Buffer buffer;
    public Producer[] producers;
    public Consumer[] consumers;
    
    /**
     * Creates new form GUIFrame
     */
    public GUIFrame() {
        initComponents();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        numProductoresSpinner = new javax.swing.JSpinner();
        numConsumidoresSpinner = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        esperaMsProductoresSpinner = new javax.swing.JSpinner();
        esperaMsConsumidoresSpinner = new javax.swing.JSpinner();
        tamanoBufferSpinner = new javax.swing.JSpinner();
        valorNSpinner = new javax.swing.JSpinner();
        valorMSpinner = new javax.swing.JSpinner();
        numProductoresErrorLabel = new javax.swing.JLabel();
        numConsumidoresErrorLabel = new javax.swing.JLabel();
        tamanoBufferErrorLabel = new javax.swing.JLabel();
        valorNErrorLabel = new javax.swing.JLabel();
        rangoErrorLabel = new javax.swing.JLabel();
        esperaMsProductoresErrorLabel = new javax.swing.JLabel();
        esperaMsConsumidoresErrorLabel = new javax.swing.JLabel();
        valorMErrorLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        numTareasRealizadasSpinner = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(440, 475));

        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setDoubleBuffered(false);

        jPanel1.setDoubleBuffered(false);

        jLabel5.setText("Tiempo de Espera (ms)");

        jLabel6.setText("Rango de Valores (n, m)");

        jLabel1.setText("Productores");

        jLabel2.setText("Consumidores");

        jLabel3.setText("Tamaño del Buffer");

        jLabel4.setText("Cantidad");

        numProductoresErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        numProductoresErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        numProductoresErrorLabel.setText("Error: [1 - 10]");
        numProductoresErrorLabel.setVisible(false);

        numConsumidoresErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        numConsumidoresErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        numConsumidoresErrorLabel.setText("Error: [1 - 10]");
        numConsumidoresErrorLabel.setVisible(false);

        tamanoBufferErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tamanoBufferErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        tamanoBufferErrorLabel.setText("Error: [1 - 100]");
        tamanoBufferErrorLabel.setVisible(false);

        valorNErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        valorNErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        valorNErrorLabel.setText("Error: [0 - 9]");
        valorNErrorLabel.setVisible(false);

        rangoErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rangoErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        rangoErrorLabel.setText("Error: n <= m");
        rangoErrorLabel.setVisible(false);

        esperaMsProductoresErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        esperaMsProductoresErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        esperaMsProductoresErrorLabel.setText("Error: [0 - 10,000]");
        esperaMsProductoresErrorLabel.setVisible(false);

        esperaMsConsumidoresErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        esperaMsConsumidoresErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        esperaMsConsumidoresErrorLabel.setText("Error: [0 - 10,000]");
        esperaMsConsumidoresErrorLabel.setVisible(false);

        valorMErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        valorMErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        valorMErrorLabel.setText("Error: [0 - 9]");
        valorMErrorLabel.setVisible(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rangoErrorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tamanoBufferSpinner, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(valorNSpinner, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(numProductoresSpinner, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(numConsumidoresErrorLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(numConsumidoresSpinner, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tamanoBufferErrorLabel)
                                    .addComponent(valorNErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numProductoresErrorLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(esperaMsProductoresErrorLabel)
                    .addComponent(esperaMsConsumidoresErrorLabel)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(valorMErrorLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(esperaMsProductoresSpinner, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(esperaMsConsumidoresSpinner, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(valorMSpinner, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numProductoresErrorLabel)
                    .addComponent(esperaMsProductoresErrorLabel))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(numProductoresSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(esperaMsProductoresSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numConsumidoresErrorLabel)
                    .addComponent(esperaMsConsumidoresErrorLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(numConsumidoresSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(esperaMsConsumidoresSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(tamanoBufferErrorLabel)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tamanoBufferSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valorNErrorLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(valorMErrorLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(valorNSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorMSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(rangoErrorLabel)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Configuración", jPanel2);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]{

            },
            new String [] {
                "ID del productor", "Producto"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "ID del Consumidor", "Tarea", "Resultado"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel7.setText("Tareas por hacer");

        jLabel8.setText("Tareas realizadas");

        jProgressBar1.setValue(50);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(numTareasRealizadasSpinner))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numTareasRealizadasSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Procesos", jPanel3);

        jButton1.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 51));
        jButton1.setText("INICIAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /***
     * isInsideRange
     * @param left
     * @param right
     * @param value
     * @param errorLabel
     * @return True if value is inside the range [left, right] and hide error 
     * label, otherwise false and show error label.
     */
    private Boolean isInsideRange(Integer left, Integer right, Integer value, 
            javax.swing.JLabel errorLabel) {
        if (value < left || value > right) {
            errorLabel.setVisible(true);
            return false;
        }
        
        errorLabel.setVisible(false);
        return true;
    }
    
    /***
     * areInputsValid
     * @return True if all inputs are valid, otherwise false
     */
    private Boolean areInputsValid() {
        Boolean allGood = true;
        
        // Cantidad Productores [1 - 10]
        numProductores = (Integer) numProductoresSpinner.getValue();
        allGood = isInsideRange(1, 10, numProductores,
                numProductoresErrorLabel) && allGood;

        // Cantidad Consumidores [1 - 10]
        numConsumidores = (Integer) numConsumidoresSpinner.getValue();
        allGood = isInsideRange(1, 10, numConsumidores,
                numConsumidoresErrorLabel) && allGood;
        
        // Tiempos de espera (ms) [0 - 10000]
        esperaProductores = 
                (Integer) esperaMsProductoresSpinner.getValue();
        allGood = isInsideRange(0, 10000, esperaProductores, 
                esperaMsProductoresErrorLabel) && allGood;
        
        esperaConsumidores = 
                (Integer) esperaMsConsumidoresSpinner.getValue();
        allGood = isInsideRange(0, 10000, esperaConsumidores,
                esperaMsConsumidoresErrorLabel) && allGood;
        
        // Buffer [1 - 100]
        tamanoBuffer = (Integer) tamanoBufferSpinner.getValue();
        allGood = isInsideRange(1, 100, tamanoBuffer,
                tamanoBufferErrorLabel) && allGood;
        
        // Rango de valores [n, m], 0 <= n <= m <= 9
        valorN = (Integer) valorNSpinner.getValue();
        allGood = isInsideRange(0, 9, valorN, valorNErrorLabel) && allGood;
        
        valorM = (Integer) valorMSpinner.getValue();
        allGood = isInsideRange(0, 9, valorM, valorMErrorLabel) && allGood;
        
        if (valorN > valorM) {
            rangoErrorLabel.setVisible(true);
            allGood = false;
        } else {
            rangoErrorLabel.setVisible(false);
        }
        
        return allGood;
    }
    
    
    
    public void anadirTareaPorHacer(int id, String product){        
       DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
       modelo.addRow(new Object[]{id, product});
    }
    
    public void completarTareaPorHacer(){
       DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
       modelo.removeRow(0);
    }

    public void anadirTareaRealizada(int id, String task, String res){
        DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
        // Add finished task row
        modelo.addRow(new Object[]{id, task, res});
        // Increment counter spinner by one
        numTareasRealizadasSpinner.setValue((Integer) numTareasRealizadasSpinner.getValue() + 1);
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Boolean allGood = areInputsValid();
     
        if (allGood) {
            buffer = new Buffer(tamanoBuffer, guiH);
            producers = new Producer[numProductores];
            for (int i = 0; i < producers.length; i++)
            {
                producers[i] = new Producer(
                        buffer, esperaProductores, valorN, valorM, i);
                producers[i].start();
            }
            
            consumers = new Consumer[numConsumidores];
            for (int i = 0; i < consumers.length; i++)
            {
                consumers[i] = new Consumer(buffer, esperaConsumidores,i);   
                consumers[i].start();
            }               
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(GUIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GUIFrame gui = new GUIFrame();
                gui.setVisible(true);
                guiH = gui;   
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel esperaMsConsumidoresErrorLabel;
    private javax.swing.JSpinner esperaMsConsumidoresSpinner;
    private javax.swing.JLabel esperaMsProductoresErrorLabel;
    private javax.swing.JSpinner esperaMsProductoresSpinner;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel numConsumidoresErrorLabel;
    private javax.swing.JSpinner numConsumidoresSpinner;
    private javax.swing.JLabel numProductoresErrorLabel;
    private javax.swing.JSpinner numProductoresSpinner;
    private javax.swing.JSpinner numTareasRealizadasSpinner;
    private javax.swing.JLabel rangoErrorLabel;
    private javax.swing.JLabel tamanoBufferErrorLabel;
    private javax.swing.JSpinner tamanoBufferSpinner;
    private javax.swing.JLabel valorMErrorLabel;
    private javax.swing.JSpinner valorMSpinner;
    private javax.swing.JLabel valorNErrorLabel;
    private javax.swing.JSpinner valorNSpinner;
    // End of variables declaration//GEN-END:variables
}
