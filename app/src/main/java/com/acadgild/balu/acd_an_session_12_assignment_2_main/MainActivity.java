package com.acadgild.balu.acd_an_session_12_assignment_2_main;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editText_number;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText_number = (EditText) findViewById(R.id.editText_number);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    public void onClick(View v)
    {
        SimpleAddition simpleAdditionfragment = (SimpleAddition) getFragmentManager().findFragmentById(R.id.fragment);
        simpleAdditionfragment.display_text_in_fragment(editText_number.getText().toString());
     }
}
