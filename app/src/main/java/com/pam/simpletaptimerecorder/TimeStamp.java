package com.pam.simpletaptimerecorder;

import java.util.Date;

/**
 * Created by Pam on 9/30/2017.
 */

public class TimeStamp {

    Date created;

    public TimeStamp(){
        this.created = new Date();
    }

    public Date getCreated(){
        return created;
    }

}

