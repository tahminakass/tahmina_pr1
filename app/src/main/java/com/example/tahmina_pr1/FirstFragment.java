package com.example.tahmina_pr1;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class FirstFragment extends Fragment {

     private TextView textView;
     private Button addButton;
     private Button substractButton;
     private int currentValue = 0;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        textView = view.findViewById(R.id.text_view);
        addButton = view.findViewById(R.id.addButton);
        substractButton = view.findViewById(R.id.substractButton);

        updateText();

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentValue++;
                updateText();
            }
        });

        substractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentValue--;
                updateText();
            }
        });

        return view;
    }


    private void updateText() {
        if (textView != null) {
            textView.setText(String.valueOf(currentValue));
        }
    }


}