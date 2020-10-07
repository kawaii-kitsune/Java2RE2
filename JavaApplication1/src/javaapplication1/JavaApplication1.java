/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author babis
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Game g=new Game();
         System.out.println("\nThe game was palyed by: "+g.p1.getName()+" & "+g.p2.getName()+"\nand the dealer was: "+g.de.getName()+". \nLet's Start Another with other players made from the previous class!\n");
         g.p1.setName("Kostas");
         g.p1.setSur("Kokkinakis");
         g.p2.setName("Evripidis");
         g.p2.setSur("Karabetsos");
         CardsPlayer p1=new CardsPlayer(g.p1.getName(),g.p1.getSur(),g.p1.getAge());
         CardsPlayer p2=new CardsPlayer(g.p2.getName(),g.p2.getSur(),g.p2.getAge());
         Game g2=new Game(p1,p2,g.d);
    }
    
}
