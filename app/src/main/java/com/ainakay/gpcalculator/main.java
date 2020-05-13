package com.ainakay.gpcalculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Aina Olukayode F on 10/20/2017.
 */

public class main extends Activity {

  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);}

    public void onClick4point(View view) {
        Intent i = new Intent(this, Point4.class);

        startActivity(i);
        }
    public void onClick5point(View view) {
        Intent i = new Intent(this, MainActivity.class);

        startActivity(i);
    }
    public void onClick7point(View view) {
        Intent i = new Intent(this, Point7.class);

        startActivity(i);
    }
}
