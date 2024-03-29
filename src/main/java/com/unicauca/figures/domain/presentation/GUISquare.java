/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.unicauca.figures.domain.presentation;

import com.unicauca.figures.domain.models.Square;

/**
 *
 * @author JUAN DAVID
 */
public class GUISquare extends javax.swing.JFrame {

    private Square square;
    
    /**
     * Creates new form GUISquare
     */
    public GUISquare() {
        initComponents();
        square = new Square(1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCuadrado = new javax.swing.JLabel();
        lblButtons = new javax.swing.JPanel();
        btnCalcular = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        pnlForm = new javax.swing.JPanel();
        lblLado = new javax.swing.JLabel();
        txtLado = new javax.swing.JTextField();
        lblArea = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        lblPerimetro = new javax.swing.JLabel();
        txtPerimetro = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCuadrado.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        lblCuadrado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCuadrado.setText("CUADRADO");
        getContentPane().add(lblCuadrado, java.awt.BorderLayout.PAGE_START);

        btnCalcular.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        lblButtons.add(btnCalcular);

        btnSalir.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        lblButtons.add(btnSalir);

        getContentPane().add(lblButtons, java.awt.BorderLayout.PAGE_END);

        pnlForm.setLayout(new java.awt.GridLayout(3, 2));

        lblLado.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lblLado.setText("Lado:");
        pnlForm.add(lblLado);
        pnlForm.add(txtLado);

        lblArea.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        lblArea.setText("Area:");
        pnlForm.add(lblArea);
        pnlForm.add(txtArea);

        lblPerimetro.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        lblPerimetro.setText("Perimetro:");
        pnlForm.add(lblPerimetro);
        pnlForm.add(txtPerimetro);

        getContentPane().add(pnlForm, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        double side = Double.parseDouble(txtLado.getText());
        square.setSide(side);
        txtArea.setText("Area: " + square.calculateArea());
        txtPerimetro.setText("Perimetro: " + square.calculatePerimeter());  
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(GUISquare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUISquare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUISquare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUISquare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUISquare().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblArea;
    private javax.swing.JPanel lblButtons;
    private javax.swing.JLabel lblCuadrado;
    private javax.swing.JLabel lblLado;
    private javax.swing.JLabel lblPerimetro;
    private javax.swing.JPanel pnlForm;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtLado;
    private javax.swing.JTextField txtPerimetro;
    // End of variables declaration//GEN-END:variables
}
