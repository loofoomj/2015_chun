package com.example.chun;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;


public class Atm_Activity extends ActionBarActivity implements View.OnClickListener {

    private ImageButton ImageButton1;
    private ImageButton ImageButton2;
    private ImageButton ImageButton3;
    private ImageButton ImageButton4;
    private ImageButton ImageButton5;

    private BackPressCloseHandler backPressCloseHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atm);

        ImageButton1 = (ImageButton) findViewById(R.id.button1);
        ImageButton1.setOnClickListener(this);
        ImageButton2 = (ImageButton) findViewById(R.id.button2);
        ImageButton2.setOnClickListener(this);
        ImageButton4 = (ImageButton) findViewById(R.id.button4);
        ImageButton4.setOnClickListener(this);
        ImageButton5 = (ImageButton) findViewById(R.id.button5);
        ImageButton5.setOnClickListener(this);

        backPressCloseHandler = new BackPressCloseHandler(this);


    }

    public void onClick(View v) {

        Intent intent1 = new Intent();

        switch (v.getId()) {
            case R.id.button1 :
                intent1.setClass(Atm_Activity.this, MainActivity.class);
                break;
            case R.id.button2 :
                intent1.setClass(Atm_Activity.this, List_Activity.class);
                break;
            case R.id.button4 :
                intent1.setClass(Atm_Activity.this, Comm_Activity.class);
                break;
            case R.id.button5 :
                intent1.setClass(Atm_Activity.this, Sett_Activity.class);
                break;
        }

        startActivity(intent1);
        overridePendingTransition(0,0);
        this.finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        backPressCloseHandler.onBackPressed();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
