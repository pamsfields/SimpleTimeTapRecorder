package com.pam.simpletaptimerecorder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addNewButton = (Button) findViewById(R.id.new_time_stamp_button);

        ListView timestampListView = (ListView) findViewById(R.id.time_stamp_listview);

        //Create ArrayAdapter
        final TimeStampAdapter timeStampAdapter = new TimeStampAdapter(this, R.layout.time_stamp_list);

        //Configure the ListView to use this Adapter for data
        timestampListView.setAdapter((ListAdapter) timeStampAdapter);

        //Add listener to the button, to add items to the ListView
        addNewButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                TimeStamp newTimeStamp = new TimeStamp();

                //Create a new ToDoItem from the text, and add to the ArrayAdapter
                timeStampAdapter.add(newTimeStamp);

                //And notify the ArrayAdapter that the data set has changed, to request UI update
                timeStampAdapter.notifyDataSetChanged();;

            }
        });
    }
}