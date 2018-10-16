package bw.co.bitri.mycardapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.widget.ImageView;

/**
 * Created by OMaphane on 1/18/2018.
 */

public class Splash extends Activity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SystemClock.sleep(2000);
            Intent splashIntent = new Intent(Splash.this,Menu.class);
            startActivity(splashIntent);
            finish();
    }//end of on create Splash screen

}//end of class
