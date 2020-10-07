package javaapplication1;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author babis
 */
public final class card {
    String symbol,card;
    int i;
    public card(int i,String u){
        this.symbol=u;
        this.i=i;
        InitComp();
    }
    public card(){}
    public void InitComp(){           
            switch(i) {
                case 0:
                    card= "A"+symbol;
                    break;
                case 10:
                    card= "J"+symbol;
                    break;
                 case 11:
                     card= "Q"+symbol;
                     break;
                 case 12:
                     card= "K"+symbol;
                     break;
                 default:
                    card= String.valueOf(i)+symbol;
            }
    } 
    public String getSymbol(){return symbol;}
    }

