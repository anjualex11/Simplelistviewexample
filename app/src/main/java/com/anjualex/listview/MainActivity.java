package com.anjualex.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView mylistview = (ListView)findViewById(R.id.listView);
        final ArrayList<String>myarraylist=new ArrayList<String>();
        myarraylist.add("C");
        myarraylist.add("C++");
        myarraylist.add("JAVA");
        myarraylist.add("PHP");
        ArrayAdapter<String>myadapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,myarraylist);
        mylistview.setAdapter(myadapter);
        mylistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,myarraylist.get(position),Toast.LENGTH_SHORT).show();

            }
        });

    }
}
