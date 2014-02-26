import java.awt.Color;
import javax.swing.ImageIcon;
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
public class itemPanel extends javax.swing.JPanel {
    IMatDataHandler dh = IMatDataHandler.getInstance();
    /**
     * Creates new form itemPanel
     */
    public itemPanel() {
        initComponents();
    }
    public itemPanel(Product p, Boolean r){
        initComponents();
        if(r)
            setBackground(Color.CYAN);
        else
            setBackground(Color.yellow);
        
        iconButton.setIcon(dh.getImageIcon(p, 16, 16));
        nameButton.setText(p.getName());
        unitLabel.setText(p.getUnitSuffix());
        priceLabel.setText(p.getPrice() + p.getUnit());
        incrementButton.setIcon(null);
        decrementButton.setIcon(null);
        starButton.setIcon(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iconButton = new javax.swing.JButton();
        nameButton = new javax.swing.JButton();
        incrementButton = new javax.swing.JButton();
        decrementButton = new javax.swing.JButton();
        amountTextField = new javax.swing.JTextField();
        unitLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        starButton = new javax.swing.JButton();
        moreButton = new javax.swing.JButton();

        iconButton.setText("iamge");
        iconButton.setBorder(null);

        nameButton.setText("name");
        nameButton.setBorder(null);

        incrementButton.setText("jButton3");

        decrementButton.setText("jButton4");

        amountTextField.setText("1");
        amountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountTextFieldActionPerformed(evt);
            }
        });

        unitLabel.setText("unit");

        priceLabel.setText("price");

        starButton.setText("star");
        starButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                starButtonActionPerformed(evt);
            }
        });

        moreButton.setText("more");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(iconButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(incrementButton, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(decrementButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(unitLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(priceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(starButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(moreButton)
                .addContainerGap(159, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(incrementButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(decrementButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(iconButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(amountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(unitLabel)
                                .addComponent(starButton)
                                .addComponent(moreButton)
                                .addComponent(priceLabel)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void starButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_starButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_starButtonActionPerformed

    private void amountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountTextField;
    private javax.swing.JButton decrementButton;
    private javax.swing.JButton iconButton;
    private javax.swing.JButton incrementButton;
    private javax.swing.JButton moreButton;
    private javax.swing.JButton nameButton;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JButton starButton;
    private javax.swing.JLabel unitLabel;
    // End of variables declaration//GEN-END:variables
}
