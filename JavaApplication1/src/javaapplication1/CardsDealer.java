/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.List;
import java.util.Scanner;
import java.lang.*;
/**
 *
 * @author babis
 */
public final class CardsDealer extends Human implements HeartsDealer {
    int[] a=new int[10];
    int c1,c2,i=0,j=0,x;
    int cnt2=0;
    CardsPlayer p1,p2;
    deck d;
    
    public CardsDealer(int i,deck d,CardsPlayer p1,CardsPlayer p2){
        switch(i){
            case 1:
                setName("Yannis");
                setSur("Antetokoumpo");
                setAge("24");
                break;
            case 2: 
                setName("Yannis");
                setSur("Kolokouris");
                setAge("26");
                break;
            default:
                setName("Liam");
                setSur("Neson");
                setAge("54");
        }
        this.Id="Dealer";
        this.d=d;
        introduceSelf();
        this.p1=p1;
        this.p2=p2;
        dealToPlayers(this.p1,this.p2);
        decideWinner(this.p1,this.p2);
    }
    public CardsDealer(deck d,CardsPlayer p1,CardsPlayer p2){
        setName("Babis");
        setSur("Kolkouris");
        setAge("23");
        this.Id="Dealer";
        this.d=d;
        introduceSelf();
        this.p1=p1;
        this.p2=p2;
        dealToPlayers(this.p1,this.p2);
        decideWinner(this.p1,this.p2);
    }

    @Override
    public void introduceSelf() {
        System.out.println("Hi I'm "+getName()+" "+getSur()+ " the "+getId()+". And this is a deck");
        showDeck();
    }

    @Override
    public void showDeck() {
        for(int i=0;i<4;i++){
            for(int j=0;j<13;j++){
                System.out.print(this.d.array[i][j].card+" | ");
            }
            System.out.println();
        }
    }

    @Override
    public card dealRandomCard() {

        card c;
        //τσεκαρω τον random αριθμό
        
        //System.out.print(x+"-");
        for(int k=0;k<10;k++){
            if(a[k]==x){ 
                i=(int)(Math.random()*4);
                j=(int)(Math.random()*13);
                x = i*j;
            }
        }
        a[cnt2]=x;
        //το δίνω
            this.cnt2++;
            c=this.d.array[i][j];
            //System.out.println(c.card);
            return c;
    }

    @Override
    public void dealToPlayers(CardsPlayer p1, CardsPlayer p2) {
        card c;
        
        showShuffled();
        
        for(int k=0;k<5;k++){
            c=d.array[0][k];
            p1.hand[k]=c;
            }
        for(int k=0;k<5;k++){
            c=d.array[0][k+5];
            p2.hand[k]=c;         
        }
        this.cnt2=0;
     }

    @Override
    public void decideWinner(CardsPlayer p1, CardsPlayer p2) {
        p1.introduceSelf();
        System.out.println();
        p2.introduceSelf();
        for(int i=0;i<5;i++){
            if("#".equals(p1.hand[i].symbol)){
                c1++;
            }
            if("#".equals(p2.hand[i].symbol)){
                c2++;  
            }
        }
    if(c1>c2){

            p1.pnt++;
            System.out.println("Player One Won! Now the Score is: "+ p1.pnt +"-"+ p2.pnt);
            for(int i=0;i<10;i++){
                this.a[i]=0;
            }
        }
    else if(c1<c2){
            
            p2.pnt++;
            System.out.println("Player two Won! Now the Score is: "+ p1.pnt +"-"+ p2.pnt);
            for(int i=0;i<10;i++){
                this.a[i]=0;
            }
        }
    else{
            System.out.println("It's a draw!");
            }
    for(int i=0;i<10;i++){
            this.a[i]=0;
        }
    System.out.println("Wanna Try Again Y/N");
    Scanner myObj = new Scanner(System.in);
    String answer = myObj.nextLine();
    if( "Y".equals(answer)||"y".equals(answer)){ 
            dealToPlayers(this.p1,this.p2);
            decideWinner(this.p1,this.p2);}
    else if( "N".equals(answer)||"n".equals(answer)){ 
        if(p1.pnt>p2.pnt){
            System.out.println("\nPlayer one Won!\n");
            p1.pnt=0;
            p2.pnt=0;
        }
       if(p1.pnt>p2.pnt){
            System.out.println("\nPlayer two Won!\n");
            p1.pnt=0;
            p2.pnt=0;
        }
        System.out.println("K bye");
    }
    else{
        System.out.println("Enter a Valid Answer");
        myObj = new Scanner(System.in);
        answer = myObj.nextLine();
        if( "Y".equals(answer)||"y".equals(answer)) 
        {
            dealToPlayers(this.p1,this.p2);
            decideWinner(this.p1,this.p2);
        }
        else if("N".equals(answer)||"n".equals(answer)){System.out.println("K bye");}
        }
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
    public void setId(String i) {
       Id=i;
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

    private void showShuffled() {
        this.d.shuffleDeck();
        System.out.println("I Shuffled th Deck, and I'm ready to Deliver ;) )");
        for(int i=0;i<4;i++){
            for(int j=0;j<13;j++){
                System.out.print(this.d.array[i][j].card+" | ");
            }
            System.out.println();
        }
        
    }
}
