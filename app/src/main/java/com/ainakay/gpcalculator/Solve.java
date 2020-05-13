package com.ainakay.gpcalculator;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;




/**
 * Created by Aina Olukayode F on 10/13/2017.
 */
public class Solve  extends Activity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inputgrade);
        addListenerOnButton();


        Bundle gpadata = getIntent().getExtras();
        String fgpapoint = gpadata.getString("thepoint");
        String fremark = gpadata.getString("theremark");
        TextView mgpaView = (TextView) findViewById(R.id.gpa_point);
        TextView mremarkView = (TextView) findViewById(R.id.remark_text);
        mgpaView.setText(fgpapoint);
        mremarkView.setText(fremark);
    }

    public void addListenerOnButton() {
        final Context context =
                this;
        button = (Button) findViewById(R.id.home);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent =
                        new
                                Intent(context, main.class);
                startActivity(intent);
            }
        });
    }
}





