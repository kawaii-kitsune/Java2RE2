package javaapplication1;


import java.util.Scanner;
import javaapplication1.card;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author babis
 */
public final class Game {
    CardsPlayer p1,p2;
    deck d;
    CardsDealer de;
    public Game(){
        this.d= new deck();
        this.p1=new CardsPlayer(1);
        this.p2=new CardsPlayer(2);
        this.de= new CardsDealer(1,d,p1,p2);
    }
     public Game(CardsPlayer p1,CardsPlayer p2,deck d){
        this.d= d;
        this.p1= p1;
        this.p2= p2;
        this.de= new CardsDealer(2,d,p1,p2);
    }
    
}
