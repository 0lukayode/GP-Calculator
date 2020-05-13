package com.ainakay.gpcalculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by Aina Olukayode F on 10/20/2017.
 */

public class Point4 extends Activity {
    private Spinner mcourse9gr, mcourse9un, mcourse8gr, mcourse8un, mcourse7gr, mcourse7un, mcourse6gr, mcourse6un, mcourse5gr, mcourse5un, mcourse4gr, mcourse4un, mcourse3gr, mcourse3un, mcourse2gr, mcourse2un, mcourse1gr, mcourse1un;


    public TextView mshow;
    public TextView mshow1;
    public TextView mshow2;

    public double unit1;
    public double coursegrade1;
    public double grade1;
    public double unit2;
    public double coursegrade2;
    public double grade3;
    public double grade2;
    public double unit3;
    public double coursegrade3;
    public double unit4;
    public double grade4;
    public double coursegrade4;
    public double unit5;
    public double grade5;
    public double unit6;
    public double coursegrade5;
    public double grade6;
    public double coursegrade6;
    public double unit7;
    public double grade7;
    public double coursegrade7;
    public double unit8;
    public double unit9;
    public double grade8;
    public double grade9;
    public double coursegrade8;
    public double coursegrade9;
    public double totalunit;
    public double gpapoint;
    public double totalcoursegrade;
    public String gpapointstring;
    public String gparemark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addItemsOnSpinner();
        OnItemSelectedListener();


        mshow = (TextView) findViewById(R.id.show);
        mshow1 = (TextView) findViewById(R.id.show1);
        mshow2 = (TextView) findViewById(R.id.show2);

    }

    public void addItemsOnSpinner() {
        mcourse1gr = (Spinner) findViewById(R.id.course1gr);
        mcourse2gr = (Spinner) findViewById(R.id.course2gr);
        mcourse3gr = (Spinner) findViewById(R.id.course3gr);
        mcourse4gr = (Spinner) findViewById(R.id.course4gr);
        mcourse5gr = (Spinner) findViewById(R.id.course5gr);
        mcourse6gr = (Spinner) findViewById(R.id.course6gr);
        mcourse7gr = (Spinner) findViewById(R.id.course7gr);
        mcourse8gr = (Spinner) findViewById(R.id.course8gr);
        mcourse9gr = (Spinner) findViewById(R.id.course9gr);
        mcourse1un = (Spinner) findViewById(R.id.course1un);
        mcourse2un = (Spinner) findViewById(R.id.course2un);
        mcourse3un = (Spinner) findViewById(R.id.course3un);
        mcourse4un = (Spinner) findViewById(R.id.course4un);
        mcourse5un = (Spinner) findViewById(R.id.course5un);
        mcourse6un = (Spinner) findViewById(R.id.course6un);
        mcourse7un = (Spinner) findViewById(R.id.course7un);
        mcourse8un = (Spinner) findViewById(R.id.course8un);
        mcourse9un = (Spinner) findViewById(R.id.course9un);


        Integer[] items = new Integer[]{0, 1, 2, 3, 4, 5, 6};
        ArrayAdapter<Integer> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, items);

        mcourse1un.setAdapter(adapter);
        mcourse2un.setAdapter(adapter);
        mcourse3un.setAdapter(adapter);
        mcourse4un.setAdapter(adapter);
        mcourse5un.setAdapter(adapter);
        mcourse6un.setAdapter(adapter);
        mcourse7un.setAdapter(adapter);
        mcourse8un.setAdapter(adapter);
        mcourse9un.setAdapter(adapter);

        String[] itemsgr = new String[]{"E(40-44)", "D(45-49)", "C(50-59)", "B(60-69)", "A(70-100)"};
        ArrayAdapter<String> adaptergr = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, itemsgr);
        mcourse1gr.setAdapter(adaptergr);
        mcourse2gr.setAdapter(adaptergr);
        mcourse3gr.setAdapter(adaptergr);
        mcourse4gr.setAdapter(adaptergr);
        mcourse5gr.setAdapter(adaptergr);
        mcourse6gr.setAdapter(adaptergr);
        mcourse7gr.setAdapter(adaptergr);
        mcourse8gr.setAdapter(adaptergr);
        mcourse9gr.setAdapter(adaptergr);
    }

    public void OnItemSelectedListener() {

        mcourse1un.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                unit1 = mcourse1un.getSelectedItemPosition();
                updateunit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        mcourse1gr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                grade1 = mcourse1gr.getSelectedItemPosition();
                coursegrade1 = grade1 * unit1;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        mcourse2un.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                unit2 = mcourse2un.getSelectedItemPosition();
                updateunit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        mcourse2gr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                grade2 = mcourse2gr.getSelectedItemPosition();
                coursegrade2 = grade2 * unit2;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        mcourse3un.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                unit3 = mcourse3un.getSelectedItemPosition();
                updateunit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        mcourse3gr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                grade3 = mcourse3gr.getSelectedItemPosition();
                coursegrade3 = grade3 * unit3;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        mcourse4un.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                unit4 = mcourse4un.getSelectedItemPosition();
                updateunit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        mcourse4gr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                grade4 = mcourse4gr.getSelectedItemPosition();
                coursegrade4 = grade4 * unit4;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        mcourse5un.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                unit5 = mcourse5un.getSelectedItemPosition();
                updateunit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        mcourse5gr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                grade5 = mcourse5gr.getSelectedItemPosition();
                coursegrade5 = grade5 * unit5;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        mcourse6un.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                unit6 = mcourse6un.getSelectedItemPosition();
                updateunit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        mcourse6gr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                grade6 = mcourse6gr.getSelectedItemPosition();
                coursegrade6 = grade6 * unit6;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        mcourse7un.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                unit7 = mcourse7un.getSelectedItemPosition();
                updateunit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        mcourse7gr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                grade7 = mcourse7gr.getSelectedItemPosition();
                coursegrade7 = grade7 * unit7;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        mcourse8un.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                unit8 = mcourse8un.getSelectedItemPosition();
                updateunit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        mcourse8gr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                grade8 = mcourse8gr.getSelectedItemPosition();
                coursegrade8 = grade8 * unit8;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        mcourse9un.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                unit9 = mcourse9un.getSelectedItemPosition();
                updateunit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        mcourse9gr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                grade9 = mcourse9gr.getSelectedItemPosition();
                coursegrade9 = grade9 * unit9;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

    }

    public void onClick(View view) {
        updategrade1();
        updategrade2();
        updategrade3();
        updategrade4();
        updategrade5();
        updategrade6();
        updategrade7();
        updategrade8();
        updategrade9();
        updatetotalgrade();
        setGpapoint();
        Intent i = new Intent(this, Solve.class);

        // String thepoint = mshow2.getText().toString();
        //   i.putExtra("thepoint", gpapointstring);
       // String thepoint = mshow2.getText().toString();
       // String theremark = mshow.getText().toString();
        i.putExtra("thepoint", gpapoint);
        i.putExtra("theremark", gparemark);

        startActivity(i);
    }

    public void updategrade1() {
        coursegrade1 = grade1 * unit1;
    }

    public void updategrade2() {
        coursegrade2 = grade2 * unit2;
    }

    public void updategrade3() {
        coursegrade3 = grade3 * unit3;
    }

    public void updategrade4() {
        coursegrade4 = grade4 * unit4;
    }

    public void updategrade5() {
        coursegrade5 = grade5 * unit5;
    }

    public void updategrade6() {
        coursegrade6 = grade6 * unit6;
    }

    public void updategrade7() {
        coursegrade7 = grade7 * unit7;
    }

    public void updategrade8() {
        coursegrade8 = grade8 * unit8;
    }

    public void updategrade9() {
        coursegrade9 = grade9 * unit9;
    }

    public double updatetotalgrade() {
        double totalcoursegrade = coursegrade1 + coursegrade2 + coursegrade3 + coursegrade4 + coursegrade5 + coursegrade6 + coursegrade7 + coursegrade8 + coursegrade9;
        // mshow.setText("" + totalcoursegrade);
        return totalcoursegrade;
    }

    public double updateunit() {
        double totalunit = unit1 + unit2 + unit3 + unit4 + unit5 + unit6 + unit7 + unit8 + unit9;
        // i uesd this to make sure i am getting a value an not null
        mshow1.setText(Double.toString(totalunit));
        return totalunit;
    }

    public double setGpapoint() {
        double totalunit = unit1 + unit2 + unit3 + unit4 + unit5 + unit6 + unit7 + unit8 + unit9;
        double totalcoursegrade = coursegrade1 + coursegrade2 + coursegrade3 + coursegrade4 + coursegrade5 + coursegrade6 + coursegrade7 + coursegrade8 + coursegrade9;
        double gpapoint = (totalcoursegrade / totalunit);
        String gpapointf=Double.toString(gpapoint);

       // String gpapointstring = String.format("your GPA: %.2f", gpapoint);
        // i uesd this to make sure i am getting a value an not null
        mshow2.setText(String.format("your GPA: %.2f", gpapoint));
        if ((gpapoint >= 3.50) && (gpapoint < 4.00)) {
            gparemark = "First-Class";
        } else if ((gpapoint >= 3.00) && (gpapoint < 3.49)) {
            gparemark = "Second Class Upper";
        } else if ((gpapoint >= 2.00) && (gpapoint < 2.99)) {
            gparemark = "Second Class Lower";
        } else if ((gpapoint >= 1.00) && (gpapoint < 1.99)) {
            gparemark = "Third Class ";
        } else if ((gpapoint >= 0.00) && (gpapoint < 0.99)) {
            gparemark = "Fail";
        }
      //  mshow.setText(gparemark);

        return gpapoint;
    }
}
