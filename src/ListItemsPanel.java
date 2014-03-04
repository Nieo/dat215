
import java.util.List;
import se.chalmers.ait.dat215.project.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administratör
 */
public class ListItemsPanel extends javax.swing.JPanel {

    /**
     * Creates new form ListItemsPanel
     */
    public ListItemsPanel() {
        initComponents();
    }
    /**
     * Adds a list of  shopping items to the panel
     * @param cartList 
     */
    public void fillListItemsPanel(ShoppingCart cartList){
        List<ShoppingItem> listItems= cartList.getItems();
        for( ShoppingItem shoppingItem: listItems ){
            innerItemsPanel.add(new SingleListItem(shoppingItem,false));
        }
    }
    
    public void updateFillListItemsPanel(ShoppingCart cartList){
        innerItemsPanel.removeAll();
        List<ShoppingItem> listItems= cartList.getItems();
        for( ShoppingItem shoppingItem: listItems ){
            innerItemsPanel.add(new SingleListItem(shoppingItem,false));
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

        scrollListItems = new javax.swing.JScrollPane();
        innerItemsPanel = new javax.swing.JPanel();

        innerItemsPanel.setLayout(new javax.swing.BoxLayout(innerItemsPanel, javax.swing.BoxLayout.PAGE_AXIS));
        scrollListItems.setViewportView(innerItemsPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollListItems, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollListItems, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel innerItemsPanel;
    private javax.swing.JScrollPane scrollListItems;
    // End of variables declaration//GEN-END:variables
}
