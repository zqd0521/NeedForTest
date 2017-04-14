package com.ec.needforread;

import java.io.Serializable;

/**
 * Created by ec on 4/13/17.
 */

public class Item_Model implements Serializable {

    /*  Model class for List and Recycler Items  */
    private String title, subTitle;

    public Item_Model(String title, String subTitle) {
        this.title = title;
        this.subTitle = subTitle;
    }

    public String getTitle() {
        return title;
    }

    public String getSubTitle() {
        return subTitle;
    }
}
