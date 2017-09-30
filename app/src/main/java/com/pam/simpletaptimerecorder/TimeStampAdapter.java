package com.pam.simpletaptimerecorder;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Pam on 9/30/2017.
 */

public class TimeStampAdapter {


    Context context;

    public TimeStampAdapter(Context context, int resource){
        super(context, resource);
        this.context= context;
    }

    //This method is used to create a view for a given list item. It's a convenient
    //place to insert the data about one particular list item into the its own view.

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        View rowView = convertView;

        //Android recycles views as the list scrolls. If the view is shown for the first
        //time, or if Android can't find it for some reason it needs to be inflated from the layout.
        //so you don't need to inflate it again

        if(rowView == null){
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            rowView = inflater.inflate(R.layout.time_stamp_list, parent, false);
        }

        //In either case, you have a View to display information for one list item,
        // and you ned to add your data to it

        //Get the correct TimeStamp
        TimeStamp timeStampItem = getTimeStamp(position);

        //Find the UI elements in the view
        TextView todoDate = (TextView) rowView.findViewById(R.id.time_stamp);

        //Add set their values
        todoDate.setText(timeStampItem.getCreated().toString());

        //Return the row, to be displayed in the ListView.
        return rowView;
    }
}
