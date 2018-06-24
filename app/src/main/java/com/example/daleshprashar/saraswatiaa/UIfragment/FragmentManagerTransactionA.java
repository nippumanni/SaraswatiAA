package com.example.daleshprashar.saraswatiaa.UIfragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.example.daleshprashar.saraswatiaa.R;

public class FragmentManagerTransactionA  extends AppCompatActivity{



    private void ftt()
    {

        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
      ft.add(R.id.fragment, new FragmentA(),"kk");
      ft.add(R.id.fragment2, new FragmentB(),"ll");
        ft.commit();
        //ft.show(new kFragment());

    }

}
