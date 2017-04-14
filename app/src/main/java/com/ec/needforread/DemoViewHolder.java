package com.ec.needforread;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by ec on 4/14/17.
 */

public class DemoViewHolder extends RecyclerView.ViewHolder {


    public TextView title, sub_title;


    public DemoViewHolder(View view) {
        super(view);


        this.title = (TextView) view.findViewById(R.id.title);
        this.sub_title = (TextView) view.findViewById(R.id.sub_title);

    }
}
