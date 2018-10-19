package bw.co.bitri.mycardapplication;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by OMaphane on 3/19/2018.
 */

public class CardGrid extends Activity {

    private ImageView firstCard, secondCard, thirdCard, fourthCard;
    private Card card1, card2,card3, card4;
    private int points = 0,noCards,card1_value, card2_value;
   // private ArrayList<Card> deckOfCards;
    ArrayList<Card> Kards;// = deckOfCards;

//card selected and number of clicks in selecting
    int count = 1, cardSelected = 0;

    String card1_suit,card2_suit;       //selected cards suits name
    int card1_face,card2_face;          //selected cards face value


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_grid);

        viewsInit();                                        //initialize the cards face down setup
        updateDeck();                                       // create a new deck of cards
        Collections.shuffle(Kards);                         //Shuffles the cards

        Handler clickDB = new Handler();                    //set up on cick action o the first card in the grid (0,0) position
        clickDB.postDelayed(new Runnable(){
            public void run(){
                if(count == 1 && cardSelected == 0){
                    firstCard.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View view) {
                            Toast.makeText(CardGrid.this, count + "Selected", Toast.LENGTH_SHORT).show();
                            firstCard.setImageResource(Kards.get(0).getCardImage());
                            card1 = Kards.get(0);
                            card1_face = card1.getFaceValue();
                            card1_suit = card1.getSuit();
                            count++;
                            cardSelected++;
                        }
                    });

                    secondCard.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Toast.makeText(CardGrid.this, count + "Selected", Toast.LENGTH_SHORT).show();
                            secondCard.setImageResource(Kards.get(1).getCardImage());
                            card2 = Kards.get(1);
                            card1_face = card2.getFaceValue();
                            card1_suit = card2.getSuit();
                            count++;
                            cardSelected++;
                        }
                    });

                    thirdCard.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Toast.makeText(CardGrid.this, count + "Selected", Toast.LENGTH_SHORT).show();
                            thirdCard.setImageResource(Kards.get(2).getCardImage());
                            card3 = Kards.get(2);
                            card1_face = card3.getFaceValue();
                            card1_suit = card3.getSuit();
                            count++;
                            cardSelected++;
                        }
                    });

                    fourthCard.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Toast.makeText(CardGrid.this, count + "Selected", Toast.LENGTH_SHORT).show();
                            fourthCard.setImageResource(Kards.get(3).getCardImage());
                            card4 = Kards.get(4);
                            card1_face = card4.getFaceValue();
                            card1_suit = card4.getSuit();
                            count++;
                            cardSelected++;
                        }
                    });

                }else
                    if(count == 2 && cardSelected == 1){
                    Toast.makeText(CardGrid.this, count + "Selected", Toast.LENGTH_SHORT).show();
                    firstCard.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            firstCard.setImageResource(Kards.get(0).getCardImage());
                            card1 = Kards.get(0);
                            card2_face = card1.getFaceValue();
                            card2_suit = card1.getSuit();
                            count++;

                            if((count == 2)&&((card1_suit.equals(card2_suit))||(card1_face == card2_face))){
                                points += 5;
                                Toast.makeText(CardGrid.this,  "Points= "+ points, Toast.LENGTH_LONG).show();
                            }else {
                                count = 1;
                                cardSelected = 0;
                                firstCard = (ImageView) findViewById(R.id.firstCard);       //cover back the card
                                Toast.makeText(CardGrid.this, "Wrong Match, Start again", Toast.LENGTH_LONG).show();
                            }
                        }

                    });

                    secondCard.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            secondCard.setImageResource(Kards.get(1).getCardImage());
                            card2 = Kards.get(1);
                            card2_face = card2.getFaceValue();
                            card2_suit = card2.getSuit();
                            count++;
                            if((count == 2)&&((card1_suit.equals(card2_suit))||(card1_face == card2_face))){
                                points += 5;
                                Toast.makeText(CardGrid.this,  "Points= "+ points, Toast.LENGTH_LONG).show();
                            }else {
                                count = 1;
                                cardSelected = 0;
                                secondCard = (ImageView) findViewById(R.id.secondCard);       //cover back the card
                                Toast.makeText(CardGrid.this, "Wrong Match, Start again", Toast.LENGTH_LONG).show();
                            }
                        }
                    });

                    thirdCard.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            thirdCard.setImageResource(Kards.get(2).getCardImage());
                            card3 = Kards.get(2);
                            card2_face = card3.getFaceValue();
                            card2_suit = card3.getSuit();
                            count++;
                            if((count == 2)&&((card1_suit.equals(card2_suit))||(card1_face == card2_face))){
                                points += 5;
                                Toast.makeText(CardGrid.this,  "Points= "+ points, Toast.LENGTH_LONG).show();
                            }else {
                                count = 1;
                                cardSelected = 0;
                                thirdCard = (ImageView)findViewById(R.id.thirdCard);
                                Toast.makeText(CardGrid.this, "Wrong Match, Start again", Toast.LENGTH_LONG).show();
                            }
                        }
                    });

                    fourthCard.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            fourthCard.setImageResource(Kards.get(3).getCardImage());
                            card4 = Kards.get(3);
                            card2_face = card4.getFaceValue();
                            card2_suit = card4.getSuit();
                            count++;
                            if((count == 2)&&((card1_suit == card2_suit)||(card1_face == card2_face))){
                                points += 5;
                                Toast.makeText(CardGrid.this,  "Points= "+ points, Toast.LENGTH_LONG).show();
                            }else {
                                count = 1;
                                cardSelected = 0;
                                fourthCard = (ImageView)findViewById(R.id.fourthCard);
                                Toast.makeText(CardGrid.this, "Wrong Match, Start again", Toast.LENGTH_LONG).show();
                            }
                        }
                    });
//end of count == 2
                }

            }//end of runnable
        },500);
    }//end of onCreate method

    private void viewsInit() {
        Kards  = new ArrayList<Card>();
        firstCard = (ImageView) findViewById(R.id.firstCard);
        secondCard = (ImageView) findViewById(R.id.secondCard);
        thirdCard = (ImageView) findViewById(R.id.thirdCard);
        fourthCard = (ImageView) findViewById(R.id.fourthCard);
       // points = (ImageView)findViewById(R.id.points);

    }// end of initialize function

    public void updateDeck( ) {
// update card pic and test value
             Kards = new ArrayList<Card>();
//Clubs
                Kards.add(new Card("Clubs","Ace",11,R.drawable.ace_clubs));
                noCards++;

                Kards.add(new Card("Club", "Two", 2, R.drawable.two_clubs));                                                               //adds a card to the Kards
                noCards++;

                Kards.add(new Card("Club", "Three", 3, R.drawable.three_clubs));                                                               //adds a card to the Kards
                noCards++;

                Kards.add(new Card("Club", "Four", 4, R.drawable.four_clubs));                                                               //adds a card to the Kards
                noCards++;

                Kards.add(new Card("Club", "Five", 5, R.drawable.five_clubs));                                                               //adds a card to the Kards
                noCards++;

                Kards.add(new Card("Club", "Six", 6, R.drawable.six_clubs));                                                               //adds a card to the Kards
                noCards++;

                Kards.add(new Card("Club", "Seven", 7, R.drawable.seven_clubs));                                                               //adds a card to the Kards
                noCards++;

                Kards.add(new Card("Club", "Eight", 8, R.drawable.eight_clubs));                                                               //adds a card to the Kards
                noCards++;

                Kards.add(new Card("Club", "Nine", 9, R.drawable.nine_clubs));                                                               //adds a card to the Kards
                noCards++;

                Kards.add(new Card("Club", "Ten", 10, R.drawable.ten_clubs));                                                               //adds a card to the Kards
                noCards++;

                Kards.add(new Card("Club", "Jack", 10, R.drawable.jack_clubs));                                                               //adds a card to the Kards
                noCards++;

                Kards.add(new Card("Club", "Queen", 10, R.drawable.queen_clubs));                                                               //adds a card to the Kards
                noCards++;

                Kards.add(new Card("Club", "King", 10, R.drawable.king_clubs));                                                               //adds a card to the Kards
                noCards++;

//Hearts
                Kards.add(new Card("Hearts", "Ace", 11, R.drawable.ace_hearts));                                                               //adds a card to the Kards
                noCards++;

                Kards.add(new Card("Hearts", "Two", 2, R.drawable.two_hearts));                                                               //adds a card to the Kards
                noCards++;

                Kards.add(new Card("Hearts", "Three", 3, R.drawable.three_hearts));                                                               //adds a card to the Kards
                noCards++;

                Kards.add(new Card("Hearts", "Four", 4, R.drawable.four_hearts));                                                               //adds a card to the Kards
                noCards++;

                Kards.add(new Card("Hearts", "Five", 5, R.drawable.five_hearts));                                                               //adds a card to the Kards
                noCards++;

                Kards.add(new Card("Hearts", "Six", 6, R.drawable.six_hearts));                                                               //adds a card to the Kards
                noCards++;

                Kards.add(new Card("Hearts", "Seven", 7, R.drawable.seven_hearts));                                                               //adds a card to the Kards
                noCards++;

                Kards.add(new Card("Hearts", "Eight", 8, R.drawable.eight_hearts));                                                               //adds a card to the Kards
                noCards++;

                Kards.add(new Card("Hearts", "Nine", 9, R.drawable.nine_hearts));                                                               //adds a card to the Kards
                noCards++;

                Kards.add(new Card("Hearts", "Ten", 10, R.drawable.ten_hearts));                                                               //adds a card to the Kards
                noCards++;

                Kards.add(new Card("Hearts", "Jack", 10, R.drawable.jack_hearts));                                                               //adds a card to the Kards
                noCards++;

                Kards.add(new Card("Hearts", "Queen", 10, R.drawable.queen_hearts));                                                               //adds a card to the Kards
                noCards++;

                Kards.add(new Card("Hearts", "King", 10, R.drawable.king_hearts));                                                               //adds a card to the Kards
                noCards++;

//Spades
                Kards.add(new Card("Spade", "Ace", 11, R.drawable.ace_spade));                                                               //adds a card to the Kards
                noCards++;

                Kards.add(new Card("Spade", "Two", 2, R.drawable.two_spades));                                                               //adds a card to the Kards
                noCards++;

                Kards.add(new Card("Spade", "Three", 3, R.drawable.three_spades));                                                               //adds a card to the Kards
                noCards++;

                Kards.add(new Card("Spade", "Four", 4, R.drawable.four_spades));                                                               //adds a card to the Kards
                noCards++;

                Kards.add(new Card("Spade", "Five", 5, R.drawable.five_spades));                                                               //adds a card to the Kards
                noCards++;

                Kards.add(new Card("Spade", "Six", 6, R.drawable.six_spades));                                                               //adds a card to the Kards
                noCards++;

                Kards.add(new Card("Spade", "Seven", 7, R.drawable.seven_spades));                                                               //adds a card to the Kards
                noCards++;

                Kards.add(new Card("Spade", "Eight", 8, R.drawable.eight_spades));                                                               //adds a card to the Kards
                noCards++;

                Kards.add(new Card("Spade", "Nine", 9, R.drawable.nine_spades));                                                               //adds a card to the Kards
                noCards++;

                Kards.add(new Card("Spade", "Ten", 10, R.drawable.ten_spades));                                                               //adds a card to the Kards
                noCards++;

                Kards.add(new Card("Spade", "Jack", 10, R.drawable.jack_spades));                                                               //adds a card to the Kards
                noCards++;

                Kards.add(new Card("Spade", "Queen", 10, R.drawable.queen_spades));                                                               //adds a card to the Kards
                noCards++;

                Kards.add(new Card("Spade", "King", 10, R.drawable.king_spades));                                                               //adds a card to the Kards
                noCards++;

//Diamonds
                Kards.add(new Card("Diamonds", "Ace", 11, R.drawable.ace_diamond));                                                               //adds a card to the Kards
                noCards++;

                Kards.add(new Card("Diamonds", "Two", 2, R.drawable.two_diamond));                                                               //adds a card to the Kards
                noCards++;

                Kards.add(new Card("Diamonds", "Three", 3, R.drawable.three_diamond));                                                               //adds a card to the Kards
                noCards++;

                Kards.add(new Card("Diamonds", "Four", 4, R.drawable.four_diamond));                                                               //adds a card to the Kards
                noCards++;

                Kards.add(new Card("Diamonds", "Five", 5, R.drawable.five_diamond));                                                               //adds a card to the Kards
                noCards++;

                Kards.add(new Card("Diamonds", "Six", 6, R.drawable.six_diamond));                                                               //adds a card to the Kards
                noCards++;

                Kards.add(new Card("Diamonds", "Seven", 7, R.drawable.seven_diamond));                                                               //adds a card to the Kards
                noCards++;

                Kards.add(new Card("Diamonds", "Eight", 8, R.drawable.eight_diamond));                                                               //adds a card to the Kards
                noCards++;

                Kards.add(new Card("Diamonds", "Nine", 9, R.drawable.nine_diamond));                                                               //adds a card to the Kards
                noCards++;

                Kards.add(new Card("Diamonds", "Ten", 10, R.drawable.ten_diamond));                                                               //adds a card to the Kards
                noCards++;

                Kards.add(new Card("Diamonds", "Jack", 10, R.drawable.jack_diamond));                                                               //adds a card to the Kards
                noCards++;

                Kards.add(new Card("Diamonds", "Queen", 10, R.drawable.queen_diamond));                                                               //adds a card to the Kards
                noCards++;

                Kards.add(new Card("Diamonds", "King", 10, R.drawable.king_diamond));                                                               //adds a card to the Kards
                noCards++;

                }//end of deck updateDeck Method


}//end of CardGrid class

