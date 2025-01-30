/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.gui.component;


import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.text.DecimalFormat;
import javax.swing.border.CompoundBorder;

/**
 *
 * @author Encin
 */
public class JpRecentSales extends javax.swing.JPanel {

    private JLabel lblOrderNumber;
    private JLabel lblTime;
    private JLabel lblAmount;
    /**
     * Creates new form JpRecentSales
     */
    public JpRecentSales() {
        initComponents();
        setProperties();
    }
    
     private void setProperties() {
        setBackground(new Color(249, 250, 251)); 
        
        setBorder(new CompoundBorder(
            new EmptyBorder(5, 5, 5, 5),
            new RoundedBorder(8, new Color(240, 240, 240))
        ));
        
        setPreferredSize(new Dimension(330, 70));
        setLayout(new BorderLayout(10, 5));
        
        // Create main content panel
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
        contentPanel.setBackground(new Color(249, 250, 251));
        
        // Order number and time panel
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.X_AXIS));
        topPanel.setBackground(new Color(249, 250, 251));
        
        lblOrderNumber = new JLabel("Order #1234");
        lblOrderNumber.setFont(new Font("Segoe UI", Font.BOLD, 14));
        
        lblTime = new JLabel("hace 2 horas");
        lblTime.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        lblTime.setForeground(new Color(128, 128, 128));
        
        topPanel.add(lblOrderNumber);
        topPanel.add(Box.createHorizontalGlue());
        topPanel.add(lblTime);
        
        // Amount panel
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new BoxLayout(bottomPanel, BoxLayout.X_AXIS));
        bottomPanel.setBackground(new Color(249, 250, 251));
        
        lblAmount = new JLabel("$123.45");
        lblAmount.setFont(new Font("Segoe UI", Font.BOLD, 14));
        lblAmount.setForeground(new Color(71, 71, 71));
        
        bottomPanel.add(Box.createHorizontalGlue());
        bottomPanel.add(lblAmount);
        
        contentPanel.add(topPanel);
        contentPanel.add(Box.createVerticalStrut(5));
        contentPanel.add(bottomPanel);
        
        add(contentPanel, BorderLayout.CENTER);
    }
     
     // Public methods to update the sale information
    public void setOrderInfo(String orderNumber, String timeAgo, double amount) {
        lblOrderNumber.setText("Order #" + orderNumber);
        lblTime.setText(timeAgo);
        DecimalFormat df = new DecimalFormat("$#,##0.00");
        lblAmount.setText(df.format(amount));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
