package com.example.student.homework2;

import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

/**
 * Created by student on 03.10.2016.
 */
public class ItemViewHolder  extends RecyclerView.ViewHolder {
private TextView Myname;

    public ItemViewHolder(TextView myname) {
        super(myname);
        Myname = (TextView) myname.findViewById(R.id.name);
    }

    public TextView getMyname() {
        return Myname;
    }
}

