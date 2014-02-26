
import java.awt.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administratör
 */
public class ListViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form ListViewPanel
     */
    public ListViewPanel() {
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

        dynamicListView = new javax.swing.JPanel();
        orderHistoryPanel = new javax.swing.JPanel();
        orderHistoryScroll = new javax.swing.JScrollPane();
        myListsPanel = new javax.swing.JPanel();
        myListsScroll = new javax.swing.JScrollPane();
        myLists = new javax.swing.JButton();
        orderHistory = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(600, 600));

        dynamicListView.setMaximumSize(new java.awt.Dimension(400, 400));
        dynamicListView.setPreferredSize(new java.awt.Dimension(400, 400));
        dynamicListView.setLayout(new java.awt.CardLayout());

        orderHistoryPanel.setBackground(new java.awt.Color(204, 204, 255));
        orderHistoryPanel.setMaximumSize(new java.awt.Dimension(400, 400));
        orderHistoryPanel.setPreferredSize(new java.awt.Dimension(400, 400));
        orderHistoryPanel.setLayout(new javax.swing.BoxLayout(orderHistoryPanel, javax.swing.BoxLayout.PAGE_AXIS));

        orderHistoryScroll.setMaximumSize(new java.awt.Dimension(400, 400));
        orderHistoryPanel.add(orderHistoryScroll);

        dynamicListView.add(orderHistoryPanel, "orderHistory");

        myListsPanel.setBackground(new java.awt.Color(255, 204, 153));
        myListsPanel.setMaximumSize(new java.awt.Dimension(400, 400));
        myListsPanel.setPreferredSize(new java.awt.Dimension(400, 400));
        myListsPanel.setLayout(new javax.swing.BoxLayout(myListsPanel, javax.swing.BoxLayout.LINE_AXIS));

        myListsScroll.setMaximumSize(new java.awt.Dimension(400, 400));
        myListsPanel.add(myListsScroll);

        dynamicListView.add(myListsPanel, "myLists");

        myLists.setText("Mina Listor");
        myLists.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myListsActionPerformed(evt);
            }
        });

        orderHistory.setText("Orderhistorik");
        orderHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderHistoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dynamicListView, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(myLists, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(orderHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(myLists, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(orderHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(dynamicListView, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void myListsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myListsActionPerformed
        CardLayout cl =(CardLayout) dynamicListView.getLayout();
        cl.show(dynamicListView, "myLists");
    }//GEN-LAST:event_myListsActionPerformed

    private void orderHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderHistoryActionPerformed
        CardLayout cl =(CardLayout) dynamicListView.getLayout();
        cl.show(dynamicListView, "orderHistory");
    }//GEN-LAST:event_orderHistoryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel dynamicListView;
    private javax.swing.JButton myLists;
    private javax.swing.JPanel myListsPanel;
    private javax.swing.JScrollPane myListsScroll;
    private javax.swing.JButton orderHistory;
    private javax.swing.JPanel orderHistoryPanel;
    private javax.swing.JScrollPane orderHistoryScroll;
    // End of variables declaration//GEN-END:variables
}