

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Erik
 */
public class Main {
    public static void main(String[] args){
        System.out.print("Hello world");
        System.out.println("Foo, Hello foo");//Added by Fridgeridge
        System.out.println("Wirj, you fools!"); //Added by Romenor
        java.awt.EventQueue.invokeLater(new Runnable() {
           
            public void run() {
                new Controler();
            }
        });
    }
}
  