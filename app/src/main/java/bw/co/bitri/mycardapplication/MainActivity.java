package bw.co.bitri.mycardapplication;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;


public class MainActivity extends AppCompatActivity {

    ImageView iv_deck,baseCard,card0,card1,card2,card3,card4,card5,card6;            // variables to hold Image Views for the cards

   // ArrayList<Integer> cards;                                                       // The deck of cards
    ArrayList<Card> Kards;

    int dbInt = 0, noCards = 0;                                                                  //click events

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);                                     //link Java class to xml layout file

        updateDeck();
        Collections.shuffle(Kards);                         //Shuffles the cards
        viewsInit();

        // SELECT CARD BY DRAG AND DROP OR DOUBLE CLICK

//Picking CARD
        card1.setOnClickListener(new View.OnClickListener(){
                   @Override
                   public void onClick(View view1){
                        //set up for a drag and drop of double click and play()
                    dbInt++;
                       Handler clickDB = new Handler();
                       clickDB.postDelayed(new Runnable() {
                           @Override
                           public void run() {
                                if(dbInt == 1){
                                    Toast.makeText(MainActivity.this," once",Toast.LENGTH_SHORT).show();
                                }
                                else if(dbInt == 2){
                                    card1.setImageResource(Kards.get(1).getCardImage());
                                    baseCard = card1;                                                //assignImage(cards.get(1),iv_deck);
                                    baseCard.setVisibility(View.VISIBLE);
                                    card1.setVisibility(View.INVISIBLE);
                                    Toast.makeText(MainActivity.this,dbInt+"",Toast.LENGTH_SHORT).show();
                                }
                                dbInt = 0;
                           }//end of run
                       },500);//end of postDelay
                   }
                });//end of onclick card1

//Second CARD
        card2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view1){
                //set up for a drag and drop of double click and play()
                dbInt++;
                Handler clickDB = new Handler();
                clickDB.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(dbInt == 1){
                            Toast.makeText(MainActivity.this," once",Toast.LENGTH_SHORT).show();
                        }
                        else if(dbInt == 2){
                                    baseCard = card2;                //assignImage(cards.get(1),iv_deck);
                                    baseCard.setVisibility(View.VISIBLE);
                                    card2.setVisibility(View.INVISIBLE);
                            Toast.makeText(MainActivity.this,dbInt+"",Toast.LENGTH_SHORT).show();
                        }
                        dbInt = 0;
                    }//end of run
                },500);//end of postDelay
            }
        });//end of onclick card2

//Third CARD
        card3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view1){
                //set up for a drag and drop of double click and play()
                dbInt++;
                Handler clickDB = new Handler();
                clickDB.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(dbInt == 1){
                            Toast.makeText(MainActivity.this," once",Toast.LENGTH_SHORT).show();
                        }
                        else if(dbInt == 2){
                                    baseCard = card3;                //assignImage(cards.get(1),iv_deck);
                                    baseCard.setVisibility(View.VISIBLE);
                                    card3.setVisibility(View.INVISIBLE);
                            Toast.makeText(MainActivity.this,dbInt+"",Toast.LENGTH_SHORT).show();
                        }
                        dbInt = 0;
                    }//end of run
                },500);//end of postDelay
            }
        });//end of onclick card3

//FOURTH card
        card4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view1){
                //set up for a drag and drop of double click and play()
                dbInt++;
                Handler clickDB = new Handler();
                clickDB.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(dbInt == 1){
                            Toast.makeText(MainActivity.this," once",Toast.LENGTH_SHORT).show();
                        }
                        else if(dbInt == 2){
                                    baseCard = card4;                //assignImage(cards.get(1),iv_deck);
                                    baseCard.setVisibility(View.VISIBLE);
                                    card4.setVisibility(View.INVISIBLE);
                            Toast.makeText(MainActivity.this,dbInt+"",Toast.LENGTH_SHORT).show();
                        }
                        dbInt = 0;
                    }//end of run
                },500);//end of postDelay
            }
        });//end of onclick card4

// Firth CARD
        card5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view1){
                //set up for a drag and drop of double click and play()
                dbInt++;
                Handler clickDB = new Handler();
                clickDB.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(dbInt == 1){
                            Toast.makeText(MainActivity.this," once",Toast.LENGTH_SHORT).show();
                        }
                        else if(dbInt == 2){
                                    baseCard = card5;                //assignImage(cards.get(1),iv_deck);
                                    baseCard.setVisibility(View.VISIBLE);
                                    card5.setVisibility(View.INVISIBLE);
                            Toast.makeText(MainActivity.this,dbInt+"",Toast.LENGTH_SHORT).show();
                        }
                        dbInt = 0;
                    }//end of run
                },500);//end of postDelay
            }
        });//end of onclick card5

//Sixth CARDS
        card6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view1){
                //set up for a drag and drop of double click and play()
                dbInt++;
                Handler clickDB = new Handler();
                clickDB.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(dbInt == 1){
                            Toast.makeText(MainActivity.this," once",Toast.LENGTH_SHORT).show();
                        }
                        else if(dbInt == 2){
                                    baseCard = card6;                //assignImage(cards.get(1),iv_deck);
                                    baseCard.setVisibility(View.VISIBLE);
                                    card6.setVisibility(View.INVISIBLE);
                            Toast.makeText(MainActivity.this,dbInt+"",Toast.LENGTH_SHORT).show();
                        }
                        dbInt = 0;
                    }//end of run
                },500);//end of postDelay
            }
        });//end of onclick card6

    } //end of onCreate

    private void viewsInit() {
        //Kards  = new ArrayList<Card>();
        baseCard = (ImageView) findViewById(R.id.iv_deck);               //base card

        card0 = (ImageView) findViewById(R.id.iv_deck0);                //Deck of card

        card1 = (ImageView) findViewById(R.id.iv_deck1);                // player card 1
        card2 = (ImageView) findViewById(R.id.iv_deck2);                // player card 2
        card3 = (ImageView) findViewById(R.id.iv_deck3);                // player card 3
        card4 = (ImageView) findViewById(R.id.iv_deck4);                // player card 4
        card5 = (ImageView) findViewById(R.id.iv_deck5);                // player card 5
        card6 = (ImageView) findViewById(R.id.iv_deck6);                // player card 6

        //Make the card Images visible
        card1.setVisibility(View.VISIBLE);
        card2.setVisibility(View.VISIBLE);
        card3.setVisibility(View.VISIBLE);
        card4.setVisibility(View.VISIBLE);
        card5.setVisibility(View.VISIBLE);
        card6.setVisibility(View.VISIBLE);

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
        //shuffle the cards


    }//end of deck updateDeck Method
//update the deck cards images

    public void pickCard(){
        //On clicking the remaining card deck
        //pick and update player hand
        //
    }

    public void PlayTurn(){
        //select a cards and compare it to base card
        //if its same suit or same number, its acceptable
            //base card is changed to the new card and remove the card from player's hand
            //reduce the player's hand by the card value
        //else allo the player to get a card from the remaining deck
            // check the card against the base card too
            //if its a same suit or same number the player can play
            //otherwise the player keps the cards
        //finally the turn completes and allows another player cance to play
    }//end of Play function

    public void Winner(){
        // after every player's turn the games computes the player hands,
        // if any player has a hand count of zero
            //check the last card they played
            //if it was nan action card then play continues
            //else player wins
    }// check winner function

}// end of main class