package com.example.daleshprashar.saraswatiaa.UIactivity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.daleshprashar.saraswatiaa.R;
import com.example.daleshprashar.saraswatiaa.UIactivity.ADAPTER.RecyclerAdapterA;

import java.util.List;

public class RecyclerViewA extends AppCompatActivity {

    private RecyclerView recyclerView;
private RecyclerAdapterA recyclerAdapterA;
private List<BondPojo> list;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        recyclerAdapterA = new RecyclerAdapterA(list);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(recyclerAdapterA);


    }
}
