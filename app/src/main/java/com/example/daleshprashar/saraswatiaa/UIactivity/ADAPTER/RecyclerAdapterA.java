package com.example.daleshprashar.saraswatiaa.UIactivity.ADAPTER;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.example.daleshprashar.saraswatiaa.UIactivity.BondPojo;

import java.util.List;

public class RecyclerAdapterA extends RecyclerView.Adapter<RecyclerAdapterA.RecyclerViewHolder> {

    private List<BondPojo> list;

    public RecyclerAdapterA(List<BondPojo> list)
    {
        // doubt
this.list = list;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class  RecyclerViewHolder extends RecyclerView.ViewHolder

   {
       // doubt  why constructor
       public RecyclerViewHolder(View view)
       {
           super(view);

       }

   }

}
