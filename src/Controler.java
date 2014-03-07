
import java.awt.CardLayout;
import java.awt.event.*;
import java.util.ArrayList;
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
public class Controler implements ActionListener, ShoppingCartListener{
    MainContainerJFrame mainFrame = new MainContainerJFrame(this);
    IMatDataHandler dh = IMatDataHandler.getInstance();
    ShoppingCart sc = dh.getShoppingCart();
    JPanel mainPanel = mainFrame.getMainPanel();
    categoryViewPanel categoryViewPanel = new categoryViewPanel();
    checkOutPanel checkoutPanel = new checkOutPanel();
    CampaignPanel campaignPanel = new CampaignPanel(this);
    ShoppingCartPanel shoppingCartPanel = mainFrame.getShoppingCartPanel();
    HistoryViewPanel historyViewPanel = new HistoryViewPanel(this);
    public Controler(){
        
        mainFrame.setVisible(true);
        mainFrame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                dh.shutDown();
                 e.getWindow().dispose();
            }
        });
        mainPanel.add(campaignPanel,"campaignPanel");
        mainPanel.add(categoryViewPanel,"categoryViewPanel");
        mainPanel.add(checkoutPanel,"checkoutPanel");
        mainPanel.add(historyViewPanel,"historyPanel");
        shoppingCartPanel.setActionListener(this);
        shoppingCartPanel.updateShoppingCartPanel(sc);
        sc.addShoppingCartListener(this);
        categoryViewPanel.setCategory(dh.favorites(), "Favoriter", this);
       
    }
    private void addToCart(Product product, double amount){
        int i = 0;
        boolean found = false;
        for(ShoppingItem s : sc.getItems()){

            if(s.getProduct().equals(product)){
                s.setAmount(s.getAmount()+amount);
                found = true;
                break;
            }
            i++;
        }
        if(!found)
            sc.addProduct(product,amount);
        
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        System.out.println("getActionCommand" + ae.getActionCommand());
        CardLayout cl = (CardLayout)mainPanel.getLayout();
        List<Product> toDisplay;
        
        switch(ae.getActionCommand()){
            case("Lägg till lista i kundvagn"):
                JButton b =(JButton) ae.getSource();
                HistoryPanel h = (HistoryPanel) b.getParent();
                Order o = h.getOrder();
                for(ShoppingItem s: o.getItems()){
                    addToCart(s.getProduct(), s.getAmount());
                }
                sc.fireShoppingCartChanged(null, true);
                break;
            case("Favoriter"):
                System.out.println("I hate this shit");
                cl.show(mainPanel, "categoryViewPanel");
                categoryViewPanel.setCategory(dh.favorites(), "Favoriter", this);
                break;
            case("Kampanj"):
                System.out.println("Not implemented feature button pressed, Kampanj");
                cl.show(mainPanel,"campaignPanel");
                break;
            case("Orderhistorik"):
                historyViewPanel = new HistoryViewPanel(this);
                cl.show(mainPanel, "historyPanel");
                break;
            case("Till kassa"):
                System.out.println("CheckoutButton pressed");
                cl.show(mainPanel,"checkoutPanel");
                break;
            case("Spara"):
                System.out.println("Not implemented feature button pressed, Spara");
                break;
            case("Rensa"):
                System.out.println("kill the shoppingcart. NOW!");
                sc.clear();
                break;
            case("Star"):
                //if(categoryViewPanel.getLabel() == "Favoriter")
                    //categoryViewPanel.setCategory(dh.favorites(), "Favoriter", this);
                break;
            case("Lägg till"):
                System.out.println("Add to Cart pressed");
                JButton j = (JButton)ae.getSource();
                itemPanel p = (itemPanel)j.getParent();
                Product product = p.getProduct();
                Double amount = p.getAmount();
                addToCart(product, amount);
                sc.fireShoppingCartChanged(null, true);
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
            case("Frukt"):
                System.out.println("Fruits");
                toDisplay = dh.getProducts(ProductCategory.BERRY);
                toDisplay.addAll(dh.getProducts(ProductCategory.CITRUS_FRUIT));
                toDisplay.addAll(dh.getProducts(ProductCategory.EXOTIC_FRUIT));
                toDisplay.addAll(dh.getProducts(ProductCategory.VEGETABLE_FRUIT));
                toDisplay.addAll(dh.getProducts(ProductCategory.MELONS));
                toDisplay.addAll(dh.getProducts(ProductCategory.FRUIT));
                cl.show(mainPanel, "categoryViewPanel");
                categoryViewPanel.setCategory(toDisplay, "Frukt", this);
                break;
            case("Grönsaker"):
                System.out.println("Gröna saker");
                toDisplay = dh.getProducts(ProductCategory.CABBAGE);
                toDisplay.addAll(dh.getProducts(ProductCategory.ROOT_VEGETABLE));
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
            categoryViewPanel.setCategory(dh.findProducts(j.getText()), "Sökresultat", this);
        }
        
       
    }

    @Override
    public void shoppingCartChanged(CartEvent ce) {
        System.out.println("Something happens to the shoppingcart");
        shoppingCartPanel.updateShoppingCartPanel(sc);
        checkoutPanel.getTotalPriceNumberLabel().setText("" + dh.getShoppingCart().getTotal());
    }
    
}
