package com.acadgild.balu.acd_an_session_12_assignment_2_main;


import android.annotation.TargetApi;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class SimpleAddition extends Fragment
{

    TextView textView_display;
    public SimpleAddition()
    {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_simple_addition, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        textView_display = (TextView) getActivity().findViewById(R.id.textView_display);
    }

    public void display_text_in_fragment(String value)
    {
        textView_display.setText(value.toString());
    }
}
