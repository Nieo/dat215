

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administratör
 */
public class ListFormPanel extends javax.swing.JPanel {

    /**
     * Creates new form ListFormPanel
     */
    public ListFormPanel() {
        initComponents();
        this.listExpandPanel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listExpandPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        listDatePanel = new javax.swing.JPanel();
        listDateLabel = new javax.swing.JLabel();
        listButtonsPanel = new javax.swing.JPanel();
        addListButton = new javax.swing.JButton();
        listContentLabel = new javax.swing.JButton();
        listNamePanel = new javax.swing.JPanel();
        listNameLabel = new javax.swing.JLabel();
        listPriceLabel = new javax.swing.JPanel();
        totalPriceLabel = new javax.swing.JLabel();
        priceSumLabel = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(500, 500));
        setPreferredSize(new java.awt.Dimension(450, 50));

        listExpandPanel.setBackground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout listExpandPanelLayout = new javax.swing.GroupLayout(listExpandPanel);
        listExpandPanel.setLayout(listExpandPanelLayout);
        listExpandPanelLayout.setHorizontalGroup(
            listExpandPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        listExpandPanelLayout.setVerticalGroup(
            listExpandPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        listDateLabel.setText("2014-2-23");

        javax.swing.GroupLayout listDatePanelLayout = new javax.swing.GroupLayout(listDatePanel);
        listDatePanel.setLayout(listDatePanelLayout);
        listDatePanelLayout.setHorizontalGroup(
            listDatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listDatePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        listDatePanelLayout.setVerticalGroup(
            listDatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(listDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        addListButton.setText("Lägg till");

        listContentLabel.setText("Innehåll");
        listContentLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listContentLabelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout listButtonsPanelLayout = new javax.swing.GroupLayout(listButtonsPanel);
        listButtonsPanel.setLayout(listButtonsPanelLayout);
        listButtonsPanelLayout.setHorizontalGroup(
            listButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listButtonsPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(addListButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listContentLabel)
                .addGap(0, 0, 0))
        );
        listButtonsPanelLayout.setVerticalGroup(
            listButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listButtonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(listButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addListButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listContentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        listNameLabel.setText("Name");

        javax.swing.GroupLayout listNamePanelLayout = new javax.swing.GroupLayout(listNamePanel);
        listNamePanel.setLayout(listNamePanelLayout);
        listNamePanelLayout.setHorizontalGroup(
            listNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listNamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        listNamePanelLayout.setVerticalGroup(
            listNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listNamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        totalPriceLabel.setText("Totalpris:");

        priceSumLabel.setText("000");

        javax.swing.GroupLayout listPriceLabelLayout = new javax.swing.GroupLayout(listPriceLabel);
        listPriceLabel.setLayout(listPriceLabelLayout);
        listPriceLabelLayout.setHorizontalGroup(
            listPriceLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listPriceLabelLayout.createSequentialGroup()
                .addComponent(totalPriceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(priceSumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        listPriceLabelLayout.setVerticalGroup(
            listPriceLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(totalPriceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(priceSumLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listDatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listNamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listButtonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listPriceLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listDatePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listNamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listButtonsPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(listExpandPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listExpandPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void listContentLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listContentLabelActionPerformed
        if(!this.listExpandPanel.isVisible()){
        this.listExpandPanel.setVisible(true);
        //this.listExpandPanel.setSize(400,400);
        
        }else{
            this.listExpandPanel.setVisible(false);
            //this.listExpandPanel.setSize(0, 0);
                    
        }
    }//GEN-LAST:event_listContentLabelActionPerformed
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addListButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel listButtonsPanel;
    private javax.swing.JButton listContentLabel;
    private javax.swing.JLabel listDateLabel;
    private javax.swing.JPanel listDatePanel;
    private javax.swing.JPanel listExpandPanel;
    private javax.swing.JLabel listNameLabel;
    private javax.swing.JPanel listNamePanel;
    private javax.swing.JPanel listPriceLabel;
    private javax.swing.JLabel priceSumLabel;
    private javax.swing.JLabel totalPriceLabel;
    // End of variables declaration//GEN-END:variables
}
