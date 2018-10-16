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
 * Created by OMaphane on 1/18/2018.
 */

public class MultiPlayer extends Activity {

    ImageView baseCard,stalk,card0,card1,card2,card3,card4,card5,card6,comp1,comp2,comp3,comp4,comp5,comp6;
    Card  tempCard,plyCard1,plyCard2,plyCard3,plyCard4,plyCard5,plyCard6,compCard1,compCard2,compCard3,compCard4,compCard5,compCard6;

    private  ArrayList<Card> Player1;                            //Player's cards
    private ArrayList<Card> Computer;                           //Opponent's cards
    private ArrayList<Card> deckOfCards;
    private int dbInt = 0,noCards;                                     //click events

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.multi_player);

      //  Deck setOfCards = new Deck(0,false);                                 //create deck variable
      //  final ArrayList<Card> Kards = setOfCards.getDeck();        //assign an updated set of cards

//ASSIGN EACH PLAYER THEIR CARRDS ---(DEAL)
        /*for(int p = 0; p <=6 ;p++){             //use a random variable between 0-52
           tempCard = setOfCards.getDeck().get(p); 
            Player1.add(p,tempCard);    
        }
        //map the [player's cards
        plyCard1 = Player1.get(0);
        plyCard2 = Player1.get(1);
        plyCard3 = Player1.get(2);
        plyCard4 = Player1.get(3);
        plyCard5 = Player1.get(4);
        plyCard6 = Player1.get(5);
        
        for(int cp = 0; cp <=6 ;cp++){
            tempCard = setOfCards.getDeck().get(cp);
            Computer.add(cp,tempCard);
        }

        //map the Computer's cards
        compCard1 = Computer.get(0);
        compCard2 = Computer.get(1);
        compCard3 = Computer.get(2);
        compCard4 = Computer.get(3);
        compCard5 = Computer.get(4);
        compCard6 = Computer.get(5);
*/
        //map the computer's cards 


        //stalk = findViewById(R.id.iv_deck0);                 //Deck of card
        //baseCard = findViewById(R.id.iv_deck);              //Base card

       // baseCard = setOfCards.getDeck().get(0).getCardImage();
      //  card0 = setOfCards.getDeck().get(1).getCardImage();


        comp1 = (ImageView) findViewById(R.id.iv_cp1);                //  comp 1
        comp2 = (ImageView) findViewById(R.id.iv_cp2);                //  comp 2
        comp3 = (ImageView) findViewById(R.id.iv_cp3);                //  comp 3
        comp4 = (ImageView) findViewById(R.id.iv_cp4);                //  comp 4
        comp5 = (ImageView) findViewById(R.id.iv_cp5);                //  comp 5
        comp6 = (ImageView) findViewById(R.id.iv_cp6);                //  comp 6
        
        card1 = (ImageView) findViewById(R.id.iv_deck1);                // player card 1
        card2 = (ImageView) findViewById(R.id.iv_deck2);                // player card 2
        card3 = (ImageView) findViewById(R.id.iv_deck3);                // player card 3
        card4 = (ImageView) findViewById(R.id.iv_deck4);                // player card 4
        card5 = (ImageView) findViewById(R.id.iv_deck5);                // player card 5
        card6 = (ImageView) findViewById(R.id.iv_deck6);                // player card 6

        //Make the card Images visible
        comp1.setVisibility(View.VISIBLE);
        comp2.setVisibility(View.VISIBLE);
        comp3.setVisibility(View.VISIBLE);
        comp4.setVisibility(View.VISIBLE);
        comp5.setVisibility(View.VISIBLE);
        comp6.setVisibility(View.VISIBLE);
        
        card1.setVisibility(View.VISIBLE);
        card2.setVisibility(View.VISIBLE);
        card3.setVisibility(View.VISIBLE);
        card4.setVisibility(View.VISIBLE);
        card5.setVisibility(View.VISIBLE);
        card6.setVisibility(View.VISIBLE);

    } //end of OnCreate

}//end of Multiplayer

