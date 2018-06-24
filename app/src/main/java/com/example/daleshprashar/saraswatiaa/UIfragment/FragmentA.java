package com.example.daleshprashar.saraswatiaa.UIfragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.daleshprashar.saraswatiaa.R;

public class FragmentA extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View viewA = inflater.inflate(R.layout.a_fragment,container , false);

        TextView textView1 = (TextView) viewA.findViewById(R.id.textViewF1);
        TextView   textView2 = (TextView) viewA.findViewById(R.id.textViewF2);
        TextView   textView3 = (TextView) viewA.findViewById(R.id.textViewF3);


        String txtX = getArguments().getString("nameX");
        String txtY = getArguments().getString("nameY");
        String txtZ = getArguments().getString("nameZ");

        textView1.setText(txtX);
        textView2.setText(txtY);
        textView3.setText(txtZ);

        return viewA;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

}
