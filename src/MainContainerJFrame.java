
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.*;
import se.chalmers.ait.dat215.project.*;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author helene
 */
public class MainContainerJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainContainerJFrame
     * @param al
     */
    public MainContainerJFrame(ActionListener al) {
        initComponents();
        searchTextField.setSelectionStart(0);
        searchTextField.setSelectionEnd(0);
        addContorler(al);

    }
    public JPanel getMainPanel(){
        return mainCenterPanel;
    }
    public ShoppingCartPanel getShoppingCartPanel(){
        return shoppingCartPanel1;
    }
  
    private void addContorler(ActionListener al){
        jButton1.addActionListener(al);
       
        favoriteButton.addActionListener(al);
        campaignbutton.addActionListener(al);
       
        searchTextField.addActionListener(al);
        bread.addActionListener(al);
        dairy.addActionListener(al);
        fruit.addActionListener(al);
        vegetables.addActionListener(al);
        meat.addActionListener(al);
        dry.addActionListener(al);
        drinks.addActionListener(al);
        sweets.addActionListener(al);
        
    }
    public void search(String value) {
        IMatDataHandler dh = IMatDataHandler.getInstance();
        System.out.println("Söker");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        topPanel = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        settingsPanel = new javax.swing.JPanel();
        searchPanel = new javax.swing.JPanel();
        searchTextField = new javax.swing.JTextField();
        categoryPanel = new javax.swing.JPanel();
        favoriteButton = new javax.swing.JButton();
        campaignbutton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        bread = new javax.swing.JButton();
        dairy = new javax.swing.JButton();
        fruit = new javax.swing.JButton();
        meat = new javax.swing.JButton();
        dry = new javax.swing.JButton();
        drinks = new javax.swing.JButton();
        sweets = new javax.swing.JButton();
        vegetables = new javax.swing.JButton();
        registerPanel = new javax.swing.JPanel();
        shoppingCartPanel1 = new ShoppingCartPanel();
        mainCenterPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 252, 243));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        topPanel.setBackground(new java.awt.Color(255, 252, 243));
        topPanel.setPreferredSize(new java.awt.Dimension(1280, 40));

        homePanel.setBackground(new java.awt.Color(255, 252, 243));
        homePanel.setPreferredSize(new java.awt.Dimension(100, 40));

        jLabel1.setBackground(new java.awt.Color(255, 252, 243));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(218, 226, 255));
        jLabel1.setText("iMAT");

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homePanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homePanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        settingsPanel.setBackground(new java.awt.Color(255, 252, 243));

        javax.swing.GroupLayout settingsPanelLayout = new javax.swing.GroupLayout(settingsPanel);
        settingsPanel.setLayout(settingsPanelLayout);
        settingsPanelLayout.setHorizontalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        settingsPanelLayout.setVerticalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        searchPanel.setBackground(new java.awt.Color(255, 252, 243));
        searchPanel.setPreferredSize(new java.awt.Dimension(385, 40));

        searchTextField.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        searchTextField.setForeground(new java.awt.Color(153, 153, 153));
        searchTextField.setText("Sök...");
        searchTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        searchTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchTextFieldFocusLost(evt);
            }
        });
        searchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchTextFieldKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchPanelLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchTextField)
                .addContainerGap())
        );

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addComponent(homePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 968, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(settingsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(homePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(settingsPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(topPanel, java.awt.BorderLayout.PAGE_START);

        categoryPanel.setBackground(new java.awt.Color(255, 252, 243));
        categoryPanel.setPreferredSize(new java.awt.Dimension(100, 260));

        favoriteButton.setText("Favoriter");
        favoriteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                favoriteButtonActionPerformed(evt);
            }
        });

        campaignbutton.setText("Kampanj");
        campaignbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campaignbuttonActionPerformed(evt);
            }
        });

        jButton1.setText("Orderhistorik");


        jSeparator1.setPreferredSize(new java.awt.Dimension(100, 10));

        bread.setText("Bröd");
        bread.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                breadActionPerformed(evt);
            }
        });

        dairy.setText("Mejeri");
        dairy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dairyActionPerformed(evt);
            }
        });

        fruit.setText("Frukt");
        fruit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fruitActionPerformed(evt);
            }
        });

        meat.setText("Kött & Fisk");
        meat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meatActionPerformed(evt);
            }
        });

        dry.setText("Torrvaror");
        dry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dryActionPerformed(evt);
            }
        });

        drinks.setText("Drycker");
        drinks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drinksActionPerformed(evt);
            }
        });

        sweets.setText("Sötsaker");
        sweets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sweetsActionPerformed(evt);
            }
        });

        vegetables.setText("Grönsaker");
        vegetables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vegetablesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout categoryPanelLayout = new javax.swing.GroupLayout(categoryPanel);
        categoryPanel.setLayout(categoryPanelLayout);
        categoryPanelLayout.setHorizontalGroup(
            categoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(categoryPanelLayout.createSequentialGroup()
                .addGroup(categoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(sweets, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(drinks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dry, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(meat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vegetables, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fruit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dairy, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bread, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(campaignbutton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(favoriteButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 2, Short.MAX_VALUE))
        );
        categoryPanelLayout.setVerticalGroup(
            categoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(categoryPanelLayout.createSequentialGroup()
                .addComponent(favoriteButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campaignbutton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bread, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dairy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fruit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vegetables)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(meat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dry)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(drinks)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sweets)
                .addGap(0, 301, Short.MAX_VALUE))
        );

        getContentPane().add(categoryPanel, java.awt.BorderLayout.LINE_START);

        registerPanel.setBackground(new java.awt.Color(255, 252, 243));
        registerPanel.setPreferredSize(new java.awt.Dimension(340, 260));

        javax.swing.GroupLayout registerPanelLayout = new javax.swing.GroupLayout(registerPanel);
        registerPanel.setLayout(registerPanelLayout);
        registerPanelLayout.setHorizontalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(shoppingCartPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        registerPanelLayout.setVerticalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addComponent(shoppingCartPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(registerPanel, java.awt.BorderLayout.LINE_END);

        mainCenterPanel.setBackground(new java.awt.Color(255, 252, 243));
        mainCenterPanel.setLayout(new java.awt.CardLayout());
        getContentPane().add(mainCenterPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void favoriteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_favoriteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_favoriteButtonActionPerformed

    private void campaignbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campaignbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campaignbuttonActionPerformed

    private void breadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_breadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_breadActionPerformed

    private void dairyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dairyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dairyActionPerformed

    private void searchTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchTextFieldFocusLost
        if(searchTextField.getText().equals("")) {
            searchTextField.setText("Sök...");
            searchTextField.setForeground(new java.awt.Color(153,153,153));
        }
    }//GEN-LAST:event_searchTextFieldFocusLost

    private void searchTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextFieldKeyPressed
        if(searchTextField.getText().equals("Sök...")) {
            searchTextField.setText("");
            searchTextField.setForeground(Color.black);
            search(searchTextField.getText());
        }
    }//GEN-LAST:event_searchTextFieldKeyPressed

    private void fruitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fruitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fruitActionPerformed

    private void meatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_meatActionPerformed

    private void dryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dryActionPerformed

    private void drinksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drinksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drinksActionPerformed

    private void sweetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sweetsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sweetsActionPerformed

    private void vegetablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vegetablesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vegetablesActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bread;
    private javax.swing.JButton campaignbutton;
    private javax.swing.JPanel categoryPanel;
    private javax.swing.JButton dairy;
    private javax.swing.JButton drinks;
    private javax.swing.JButton dry;
    private javax.swing.JButton favoriteButton;
    private javax.swing.JButton fruit;
    private javax.swing.JPanel homePanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel mainCenterPanel;
    private javax.swing.JButton meat;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JPanel settingsPanel;
    private ShoppingCartPanel shoppingCartPanel1;
    private javax.swing.JButton sweets;
    private javax.swing.JPanel topPanel;
    private javax.swing.JButton vegetables;
    // End of variables declaration//GEN-END:variables
}

