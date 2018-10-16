package bw.co.bitri.mycardapplication;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by OMaphane on 1/12/2018.
 */

public class Card  extends Activity{
    private String faceName,suit;           //type and name of card
    private int cardImage, faceValue;                  // Picture and game value of the card

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card);
        //link the card creation????
        Card card = new Card(this.suit,this.faceName,this.faceValue,this.cardImage);        // creates a card

    }// end of onCreate
    /**
     * The Card Object constructor method
     * @param suit      "clubs","hearts","spades", "diamonds"
     * @param face      = 2,3,4,5,......,10,Jack, Queen,King, Ace
     * @param value     = 2,3,4,5,......,10,10,10,10,11
     * @param card      = a copy of the image representation of the card.
     */
    public Card(String suit, String face, int value, int card){
    this.suit = suit;
    this.faceName = face;
    this.faceValue = value;
    this.cardImage = card;
    }//end of constructor

    public String getSuit() {
        return this.suit;
    }

    public String getFaceName() {
        return this.faceName;
    }

    public int getFaceValue() {
        return this.faceValue;
    }

    public int getCardImage() {
        return this.cardImage;
    }

    public void setCardImage(int Image){ this.cardImage = Image; }

}//end of card class
