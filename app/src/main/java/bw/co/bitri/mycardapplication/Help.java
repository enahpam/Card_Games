package bw.co.bitri.mycardapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by OMaphane on 1/22/2018.
 */

public class Help extends Activity {
    Button backBtn;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help);

    backBtn = (Button)findViewById(R.id.helpBack);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backIntent = new Intent(Help.this,Menu.class);
                startActivity(backIntent);
                finish();
            }
        });
    }
}
