
package bw.co.bitri.mycardapplication;

import android.app.Activity;
import android.os.Bundle;

import java.util.ArrayList;

/**
 * Created by OMaphane on 2/18/2018.
 */

public class Deck extends Activity {

    private int noCards = 0;                                //number of deck in the deck
    private boolean empty = true;                            //check status of deck, assume full in the beginning
   // private int cardPic;                                 //card image
    private ArrayList<Card> deckOfCards;                   //List of deck making the Deck

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deck);
        //insert link to Deck????
       // Deck deck = new Deck();
        updateDeck();

    }// end of on Create

    public Deck(){
        this.noCards = deckOfCards.size();
        this.empty = deckOfCards.isEmpty();
        updateDeck();
    }// end of Constructor

 public void updateDeck( ) {
// update card pic and test value

//Clubs
        deckOfCards.add(new Card("Clubs","Ace",11,R.drawable.ace_clubs));
                noCards++;

                deckOfCards.add(new Card("Club", "Two", 2, R.drawable.two_clubs));                                                               //adds a card to the deckOfCards
                noCards++;

                deckOfCards.add(new Card("Club", "Three", 3, R.drawable.three_clubs));                                                               //adds a card to the deckOfCards
                noCards++;

                deckOfCards.add(new Card("Club", "Four", 4, R.drawable.four_clubs));                                                               //adds a card to the deckOfCards
                noCards++;

                deckOfCards.add(new Card("Club", "Five", 5, R.drawable.five_clubs));                                                               //adds a card to the deckOfCards
                noCards++;

                deckOfCards.add(new Card("Club", "Six", 6, R.drawable.six_clubs));                                                               //adds a card to the deckOfCards
                noCards++;

                deckOfCards.add(new Card("Club", "Seven", 7, R.drawable.seven_clubs));                                                               //adds a card to the deckOfCards
                noCards++;

                deckOfCards.add(new Card("Club", "Eight", 8, R.drawable.eight_clubs));                                                               //adds a card to the deckOfCards
                noCards++;

                deckOfCards.add(new Card("Club", "Nine", 9, R.drawable.nine_clubs));                                                               //adds a card to the deckOfCards
                noCards++;

                deckOfCards.add(new Card("Club", "Ten", 10, R.drawable.ten_clubs));                                                               //adds a card to the deckOfCards
                noCards++;

                deckOfCards.add(new Card("Club", "Jack", 10, R.drawable.jack_clubs));                                                               //adds a card to the deckOfCards
                noCards++;

                deckOfCards.add(new Card("Club", "Queen", 10, R.drawable.queen_clubs));                                                               //adds a card to the deckOfCards
                noCards++;

                deckOfCards.add(new Card("Club", "King", 10, R.drawable.king_clubs));                                                               //adds a card to the deckOfCards
                noCards++;

//Hearts
                deckOfCards.add(new Card("Hearts", "Ace", 11, R.drawable.ace_hearts));                                                               //adds a card to the deckOfCards
                noCards++;

                deckOfCards.add(new Card("Hearts", "Two", 2, R.drawable.two_hearts));                                                               //adds a card to the deckOfCards
                noCards++;

                deckOfCards.add(new Card("Hearts", "Three", 3, R.drawable.three_hearts));                                                               //adds a card to the deckOfCards
                noCards++;

                deckOfCards.add(new Card("Hearts", "Four", 4, R.drawable.four_hearts));                                                               //adds a card to the deckOfCards
                noCards++;

                deckOfCards.add(new Card("Hearts", "Five", 5, R.drawable.five_hearts));                                                               //adds a card to the deckOfCards
                noCards++;

                deckOfCards.add(new Card("Hearts", "Six", 6, R.drawable.six_hearts));                                                               //adds a card to the deckOfCards
                noCards++;

                deckOfCards.add(new Card("Hearts", "Seven", 7, R.drawable.seven_hearts));                                                               //adds a card to the deckOfCards
                noCards++;

                deckOfCards.add(new Card("Hearts", "Eight", 8, R.drawable.eight_hearts));                                                               //adds a card to the deckOfCards
                noCards++;

                deckOfCards.add(new Card("Hearts", "Nine", 9, R.drawable.nine_hearts));                                                               //adds a card to the deckOfCards
                noCards++;

                deckOfCards.add(new Card("Hearts", "Ten", 10, R.drawable.ten_hearts));                                                               //adds a card to the deckOfCards
                noCards++;

                deckOfCards.add(new Card("Hearts", "Jack", 10, R.drawable.jack_hearts));                                                               //adds a card to the deckOfCards
                noCards++;

                deckOfCards.add(new Card("Hearts", "Queen", 10, R.drawable.queen_hearts));                                                               //adds a card to the deckOfCards
                noCards++;

                deckOfCards.add(new Card("Hearts", "King", 10, R.drawable.king_hearts));                                                               //adds a card to the deckOfCards
                noCards++;

//Spades
                deckOfCards.add(new Card("Spade", "Ace", 11, R.drawable.ace_spade));                                                               //adds a card to the deckOfCards
                noCards++;

                deckOfCards.add(new Card("Spade", "Two", 2, R.drawable.two_spades));                                                               //adds a card to the deckOfCards
                noCards++;

                deckOfCards.add(new Card("Spade", "Three", 3, R.drawable.three_spades));                                                               //adds a card to the deckOfCards
                noCards++;

                deckOfCards.add(new Card("Spade", "Four", 4, R.drawable.four_spades));                                                               //adds a card to the deckOfCards
                noCards++;

                deckOfCards.add(new Card("Spade", "Five", 5, R.drawable.five_spades));                                                               //adds a card to the deckOfCards
                noCards++;

                deckOfCards.add(new Card("Spade", "Six", 6, R.drawable.six_spades));                                                               //adds a card to the deckOfCards
                noCards++;

                deckOfCards.add(new Card("Spade", "Seven", 7, R.drawable.seven_spades));                                                               //adds a card to the deckOfCards
                noCards++;

                deckOfCards.add(new Card("Spade", "Eight", 8, R.drawable.eight_spades));                                                               //adds a card to the deckOfCards
                noCards++;

                deckOfCards.add(new Card("Spade", "Nine", 9, R.drawable.nine_spades));                                                               //adds a card to the deckOfCards
                noCards++;

                deckOfCards.add(new Card("Spade", "Ten", 10, R.drawable.ten_spades));                                                               //adds a card to the deckOfCards
                noCards++;

                deckOfCards.add(new Card("Spade", "Jack", 10, R.drawable.jack_spades));                                                               //adds a card to the deckOfCards
                noCards++;

                deckOfCards.add(new Card("Spade", "Queen", 10, R.drawable.queen_spades));                                                               //adds a card to the deckOfCards
                noCards++;

                deckOfCards.add(new Card("Spade", "King", 10, R.drawable.king_spades));                                                               //adds a card to the deckOfCards
                noCards++;

//Diamonds
                deckOfCards.add(new Card("Diamonds", "Ace", 11, R.drawable.ace_diamond));                                                               //adds a card to the deckOfCards
                noCards++;

                deckOfCards.add(new Card("Diamonds", "Two", 2, R.drawable.two_diamond));                                                               //adds a card to the deckOfCards
                noCards++;

                deckOfCards.add(new Card("Diamonds", "Three", 3, R.drawable.three_diamond));                                                               //adds a card to the deckOfCards
                noCards++;

                deckOfCards.add(new Card("Diamonds", "Four", 4, R.drawable.four_diamond));                                                               //adds a card to the deckOfCards
                noCards++;

                deckOfCards.add(new Card("Diamonds", "Five", 5, R.drawable.five_diamond));                                                               //adds a card to the deckOfCards
                noCards++;

                deckOfCards.add(new Card("Diamonds", "Six", 6, R.drawable.six_diamond));                                                               //adds a card to the deckOfCards
                noCards++;

                deckOfCards.add(new Card("Diamonds", "Seven", 7, R.drawable.seven_diamond));                                                               //adds a card to the deckOfCards
                noCards++;

                deckOfCards.add(new Card("Diamonds", "Eight", 8, R.drawable.eight_diamond));                                                               //adds a card to the deckOfCards
                noCards++;

                deckOfCards.add(new Card("Diamonds", "Nine", 9, R.drawable.nine_diamond));                                                               //adds a card to the deckOfCards
                noCards++;

                deckOfCards.add(new Card("Diamonds", "Ten", 10, R.drawable.ten_diamond));                                                               //adds a card to the deckOfCards
                noCards++;

                deckOfCards.add(new Card("Diamonds", "Jack", 10, R.drawable.jack_diamond));                                                               //adds a card to the deckOfCards
                noCards++;

                deckOfCards.add(new Card("Diamonds", "Queen", 10, R.drawable.queen_diamond));                                                               //adds a card to the deckOfCards
                noCards++;

                deckOfCards.add(new Card("Diamonds", "King", 10, R.drawable.king_diamond));                                                               //adds a card to the deckOfCards
                noCards++;

                }//end of deck updateDeck Method


    public boolean isEmpty() {
        this.empty = deckOfCards.isEmpty();
        return empty;
    }

    public ArrayList<Card> getDeck() {
        return this.deckOfCards;
    }

    public int getNoCards() {
        this.noCards = deckOfCards.size();
        return noCards;
    }

}//end of Deck Class

