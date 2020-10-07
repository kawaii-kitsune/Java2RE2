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
public interface HeartsDealer {
    void showDeck(); //δείχνει όλα τα χαρτιά της τράπουλας
    card dealRandomCard(); //επιστρέφει μία τυχαία κάρτα από την τράπουλα
    void dealToPlayers(CardsPlayer p1, CardsPlayer p2); //μοιράζει χαρτιά στους παίκτες
    void decideWinner(CardsPlayer p1, CardsPlayer p2); //αποφασίζει τον νικητή του παιχνιδιού
}
