package javaapplication1;


import java.util.List;
import javaapplication1.deck;
import javaapplication1.card;
import javaapplication1.deck;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author babis
 */
public final class CardsPlayer extends Human implements HeartsPlayer {
    int pnt=0;
    card[] hand= new card[5];
    deck d;
    String ID;
    int k,j;
    int toCheckValue;
    
    public CardsPlayer(String Name,String Sur,String Age){
        this.Name=Name;
        this.Sur=Sur;
        this.Age=Age;
        setId("Player");
    }

    public CardsPlayer(int i){
        setId("Player");
        switch(i){
            case 1 -> {
                setName("John");
                setSur("Boursis");
                setAge("28");
            }
            case 2 -> {
                setName("Nikos");
                setSur("Korobos");
                setAge("46");
            }
            default -> {
                setName("Sylvester");
                setSur("Stalone");
                setAge("64");
            }
        }
    }
    //

    @Override
    public void introduceSelf() {
        System.out.println();
                System.out.println("Hi! Im "+ this.Name+" "+this.Sur+" ,"+this.Age+", like a fine aged Scotch and this is my Hand");
                showHand();
    }

    @Override
    public void showHand() {
        for(int i=0;i<5;i++){System.out.print(hand[i].card);}
        System.out.println();
    }

        @Override
    public String getName() {
        return Name;
    }

    @Override
    public String getSur() {
        return Sur;
    }

    @Override
    public String getAge() {
        return Age;
    }

    @Override
    public String getId() {
        return Id;
    }
    
    @Override
    public void setName(String i) {
        Name=i;
    }

    @Override
    public void setSur(String i) {
        Sur=i;
    }

    @Override
    public void setAge(String i) {
        Age=i;
    }

    @Override
    public void setId(String i) {
        Id=i;
    }

}
