package com.example.arcti.androidlab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> target;
    private ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] valuse = new String[]{"Pies","Kot","Kon","Galab","Kruk","Dzik","Karp","Osiol","Chomik","Mysz","Jez","Karaluch"};
        this.target = new ArrayList<String>();
        this.target.addAll(Arrays.asList(valuse));

        this.adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,this.target);

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(this.adapter);
    }
    //TODO cos do zriobienia
    //drugie TODO
}
