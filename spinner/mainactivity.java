package com.example.spinner;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends Activity {

    Spinner spinner;

    String[] items = {"Select", "Apple", "Banana", "Mango"};

    public void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_item,
                items
        );

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(
            new AdapterView.OnItemSelectedListener() {

                public void onItemSelected(
                        AdapterView<?> parent, View view,
                        int position, long id) {

                    Toast.makeText(
                        MainActivity.this,
                        items[position],
                        Toast.LENGTH_SHORT
                    ).show();
                }

                public void onNothingSelected(AdapterView<?> parent) {
                }
            }
        );
    }
}