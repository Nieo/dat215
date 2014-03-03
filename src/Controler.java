
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
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
        List<Product> toDisplay;
        
        switch(ae.getActionCommand()){
            case("Mina Listor"):
                for(ShoppingItem s: sc.getItems())
                    System.out.println(s.getProduct().toString());
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
            case("Frukt & Grönt"):
                System.out.println("GrönaSaker");
                toDisplay = dh.getProducts(ProductCategory.BERRY);
                toDisplay.addAll(dh.getProducts(ProductCategory.CITRUS_FRUIT));
                toDisplay.addAll(dh.getProducts(ProductCategory.EXOTIC_FRUIT));
                toDisplay.addAll(dh.getProducts(ProductCategory.VEGETABLE_FRUIT));
                toDisplay.addAll(dh.getProducts(ProductCategory.CABBAGE));
                toDisplay.addAll(dh.getProducts(ProductCategory.MELONS));
                toDisplay.addAll(dh.getProducts(ProductCategory.ROOT_VEGETABLE));
                toDisplay.addAll(dh.getProducts(ProductCategory.FRUIT));
                toDisplay.addAll(dh.getProducts(ProductCategory.HERB));
                toDisplay.addAll(dh.getProducts(ProductCategory.POTATO_RICE));
                cl.show(mainPanel, "categoryViewPanel");
                categoryViewPanel.setCategory(toDisplay, "Grönsaker", this);
                break;
            case("Kött & Fisk"):
                System.out.println("Meat is murder");
                toDisplay = dh.getProducts(ProductCategory.MEAT);
                toDisplay.addAll(dh.getProducts(ProductCategory.FISH));
                cl.show(mainPanel, "categoryViewPanel");
                categoryViewPanel.setCategory(toDisplay, "Kött & Fisk", this);
                break;
            case("Torrvaror"):
                System.out.println("From the desert");
                toDisplay = dh.getProducts(ProductCategory.NUTS_AND_SEEDS);
                toDisplay.addAll(dh.getProducts(ProductCategory.POD));
                toDisplay.addAll(dh.getProducts(ProductCategory.FLOUR_SUGAR_SALT));
                toDisplay.addAll(dh.getProducts(ProductCategory.PASTA));
                cl.show(mainPanel, "categoryViewPanel");
                categoryViewPanel.setCategory(toDisplay, "Torrvaror", this);
                break;
            case("Drycker"):
                System.out.println("Thrist ends here");
                cl.show(mainPanel, "categoryViewPanel");
                toDisplay = dh.getProducts(ProductCategory.COLD_DRINKS);
                toDisplay.addAll(dh.getProducts(ProductCategory.HOT_DRINKS));
                categoryViewPanel.setCategory(toDisplay, "Drycker", this);
                break;
            case("Sötsaker"):
                System.out.println("Approved by Karius & Bactus");
                cl.show(mainPanel, "categoryViewPanel");
                categoryViewPanel.setCategory(dh.getProducts(ProductCategory.SWEET), "Sötsaker", this);
                break;                
            
        }
        JTextField j = new JTextField();
        if(j.getClass() == ae.getSource().getClass()){
            j = (JTextField)ae.getSource();
            cl.show(mainPanel, "categoryViewPanel");
            categoryViewPanel.setCategory(dh.findProducts(j.getText()), "Resultat för " + j.getText(), this);
        }
        
       
    }
    
}
