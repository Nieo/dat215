
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import se.chalmers.ait.dat215.project.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Erik
 */
public class HistoryPanel extends javax.swing.JPanel {
    boolean expanded = false;
    Order o;
    /**
     * Creates new form HistoryPanel
     */
    public HistoryPanel() {
        initComponents();
    }
    Order getOrder(){
        return o;
    }
    
    public HistoryPanel(Order o, ActionListener al){
        this();
        this.o = o;
        System.out.println(o.getDate().toString());
        labelButton.setText(o.getDate().toString());
        addToCartButton.addActionListener(al);
        addToCartButton.setVisible(expanded);
        container.setVisible(expanded);
        for(ShoppingItem s: o.getItems()){
            container.add(new JLabel(s.getProduct().getName()+ " " + s.getAmount()));
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

        labelButton = new javax.swing.JButton();
        addToCartButton = new javax.swing.JButton();
        container = new javax.swing.JPanel();

        labelButton.setText("jButton1");
        labelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelButtonActionPerformed(evt);
            }
        });

        addToCartButton.setText("Lägg till lista i kundvagn");

        container.setLayout(new javax.swing.BoxLayout(container, javax.swing.BoxLayout.Y_AXIS));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(addToCartButton))
            .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(addToCartButton))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void labelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelButtonActionPerformed
       expanded = !expanded;
       addToCartButton.setVisible(expanded);
       container.setVisible(expanded);
    }//GEN-LAST:event_labelButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToCartButton;
    private javax.swing.JPanel container;
    private javax.swing.JButton labelButton;
    // End of variables declaration//GEN-END:variables
}