
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Erik
 */
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import se.chalmers.ait.dat215.project.*;
public class categoryViewPanel extends javax.swing.JPanel {
    
    /**
     * Creates new form categoryViewPanel
     */
    public categoryViewPanel() {
        initComponents();
    }
   
    public void setCategory(List<Product> products, String name, ActionListener al){
        categoryNameLabel.setText(name);
        itemContainerPanel.removeAll();
        itemContainerPanel.setBackground(Color.WHITE);
        if(!products.isEmpty()){
        boolean background = false;
            for(Product p: products){
                itemContainerPanel.add(new itemPanel(p,background,al));
                background = !background;
            }
            if(products.size() < 11){
                
                for(int i = products.size(); i < 11; i++)
                    itemContainerPanel.add(new invisiblePanel());
            }
        }else{
            itemContainerPanel.add(new JLabel("Det finns inget här"));
        }
        
    }
    String getLabel(){
        return categoryNameLabel.getText();
    }
    private class invisiblePanel extends JPanel{
        public invisiblePanel(){
            setSize(100, 51);
            setVisible(false);
        }
    }    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        categoryNameLabel = new javax.swing.JLabel();
        separator = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemContainerPanel = new javax.swing.JPanel();

        categoryNameLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        categoryNameLabel.setText("jLabel1");

        itemContainerPanel.setLayout(new java.awt.GridLayout(0, 1));
        jScrollPane1.setViewportView(itemContainerPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separator, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(categoryNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(categoryNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel categoryNameLabel;
    private javax.swing.JPanel itemContainerPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator separator;
    // End of variables declaration//GEN-END:variables
}
