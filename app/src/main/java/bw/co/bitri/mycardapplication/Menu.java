package bw.co.bitri.mycardapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by OMaphane on 1/18/2018.
 */

public class Menu extends Activity {

    TextView  rulesButton, singleButton, practiceButton, moneyButton, settingButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

    }//end of onCreate method

    public void menuOptions(View view){
        String buttonText;
        buttonText = ((Button) view).getText().toString();      //conrvet the button text t string

        if(buttonText.equals("Rules")){
            Intent menuIntent = new Intent(Menu.this,Help.class);
            startActivity(menuIntent);
            finish();
        }
        else if(buttonText.equals("Single_Player")){
            Intent menuIntent = new Intent(Menu.this,MainActivity.class);
            startActivity(menuIntent);
            finish();
        }
        else if(buttonText.equals("Practice_Game")){
            Intent menuIntent = new Intent(Menu.this,MultiPlayer.class);
            startActivity(menuIntent);
            finish();
        }
        else if(buttonText.equals("Money_Game")){
            Intent menuIntent = new Intent(Menu.this, MoneyGame.class);
            startActivity(menuIntent);
            finish();
        }
        else if(buttonText.equals("Settings")){
            Intent menuIntent = new Intent(Menu.this,Settings.class);
            startActivity(menuIntent);
            finish();
        } else if(buttonText.equals("Card_Grid")){
            Intent menuIntent = new Intent(Menu.this,CardGrid.class);
            startActivity(menuIntent);
            finish();
        }
    }//end of menu options

/*    //Betting method
    public int PlaceBet(int betAmount){
        int finalBet = betAmount;
        return finalBet;
    }*/
}//end of menu

