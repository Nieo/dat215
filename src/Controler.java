
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
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
 * @author Erik
 */
public class Controler implements ActionListener{
    MainContainerJFrame mainFrame = new MainContainerJFrame(this);
    IMatDataHandler dh = IMatDataHandler.getInstance();
    ShoppingCart sc = dh.getShoppingCart();
    JPanel mainPanel = mainFrame.getMainPanel();
    categoryViewPanel categoryViewPanel = new categoryViewPanel();
    checkOutPanel checkoutPanel = new checkOutPanel();
    public Controler(){
        mainFrame.setVisible(true);
        mainPanel.add(categoryViewPanel,"categoryViewPanel");
        mainPanel.add(checkoutPanel,"checkoutPanel");
        
    }
   
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        System.out.println(ae.getActionCommand());
        CardLayout cl = (CardLayout)mainPanel.getLayout();
        
        switch(ae.getActionCommand()){
            case("Mina Listor"):
                for(ShoppingItem s: sc.getItems())
                    System.out.println(s.getProduct().toString());
                break;
            case("Bröd"):
                System.out.println("Brödknapp");
                cl.show(mainPanel,"categoryViewPanel");
                categoryViewPanel.setCategory(dh.getProducts(ProductCategory.BREAD), "Bröd",this);
                break;
            case("Mejeri"):
                System.out.println("Mejeriknapp");
                cl.show(mainPanel, "categoryViewPanel");
                categoryViewPanel.setCategory(dh.getProducts(ProductCategory.DAIRIES), "Mejeri", this);
                break;
            case("Kampanj"):
                System.out.println("Kampanjknapp");
         
                cl.show(mainPanel,"checkoutPanel");
                break;
            case("Add to cart"):
                System.out.println("Add to Cart pressed");
                JButton j = (JButton)ae.getSource();
                itemPanel p = (itemPanel)j.getParent();
                sc.addProduct(p.getProduct(),p.getAmount());
                break;
        }
        
       
    }
    
}
