package com.example.student.homework2;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import java.util.ArrayList;


public class AdapterRecyclerView extends RecyclerView.Adapter<ItemViewHolder>
{

    private Context mContext;
    private ArrayList listperson;

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_person,parent,false);
        return new ItemViewHolder(view);
    }

    public AdapterRecyclerView(ArrayList listperson, Context mContext)
    {
        this.listperson = listperson;
        this.mContext = mContext;
    }


    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position)
    {

        Person person=(Person)listperson.get(position);
        holder.getMyname().setText(person.getName());
     }


    @Override
    public int getItemCount()
    {
        return listperson.size();
    }
}
