package com.example.chun;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    private ImageButton ImageButton1;
    private ImageButton ImageButton2;
    private ImageButton ImageButton3;
    private ImageButton ImageButton4;
    private ImageButton ImageButton5;

    private BackPressCloseHandler backPressCloseHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton2 = (ImageButton) findViewById(R.id.button2);
        ImageButton2.setOnClickListener(this);
        ImageButton3 = (ImageButton) findViewById(R.id.button3);
        ImageButton3.setOnClickListener(this);
        ImageButton4 = (ImageButton) findViewById(R.id.button4);
        ImageButton4.setOnClickListener(this);
        ImageButton5 = (ImageButton) findViewById(R.id.button5);
        ImageButton5.setOnClickListener(this);

        backPressCloseHandler = new BackPressCloseHandler(this);

    }

    public void onClick(View v) {

        Intent intent1 = new Intent();

        switch (v.getId()) {
            case R.id.button2:
                intent1.setClass(MainActivity.this, List_Activity.class);
                break;
            case R.id.button3:
                intent1.setClass(MainActivity.this, Atm_Activity.class);
                break;
            case R.id.button4:
                intent1.setClass(MainActivity.this, Comm_Activity.class);
                ;
                break;
            case R.id.button5:
                intent1.setClass(MainActivity.this, Sett_Activity.class);
                break;
        }
        startActivity(intent1);
        overridePendingTransition(0, 0);
        this.finish();

    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        backPressCloseHandler.onBackPressed();
    }
}
