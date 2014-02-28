
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import se.chalmers.ait.dat215.project.IMatDataHandler;
import se.chalmers.ait.dat215.project.ProductCategory;

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
    MainContainerJFrame mainFrame = new MainContainerJFrame();
    IMatDataHandler dh = IMatDataHandler.getInstance();
    JPanel mainPanel = mainFrame.getMainPanel();
    categoryViewPanel cvp = mainFrame.getCategoryViewPanel();
    public Controler(){
        mainFrame.setVisible(true);
        mainFrame.addContorler(this);
        
    }
   
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        System.out.println(ae.getActionCommand());
        CardLayout cl = (CardLayout)mainPanel.getLayout();
        switch(ae.getActionCommand()){
            case("Bröd"):
                System.out.println("Brödknapp");
                cl.show(mainPanel,"categoryViewPanel");
                cvp.setCategory(dh.getProducts(ProductCategory.BREAD), "Bröd");
                break;
            case("Kampanj"):
                System.out.println("Kampanjknapp");
         
                cl.show(mainPanel,"checkoutPanel");
                break;
        }
        
       
    }
}
