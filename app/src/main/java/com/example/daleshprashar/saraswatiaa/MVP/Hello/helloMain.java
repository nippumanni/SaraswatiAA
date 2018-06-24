package com.example.daleshprashar.saraswatiaa.MVP.Hello;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class helloMain extends AppCompatActivity implements Contractor.viewHello {


    private Contractor.presenterHello presenterHello;
    private TextView textView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    // button.onclick
    @Override
    public void showHello() {
        presenterHello.onClick();
    }

    @Override
    public void passDataHello(String abc) {
        textView.setText(abc);
    }
}
