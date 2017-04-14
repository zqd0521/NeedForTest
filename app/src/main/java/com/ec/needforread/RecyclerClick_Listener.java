package com.ec.needforread;

import android.view.View;

/**
 * Created by ec on 4/14/17.
 */

public interface RecyclerClick_Listener {

    /**
     * Interface for Recycler View Click listener
     **/

    void onClick(View view, int position);

    void onLongClick(View view, int position);
}