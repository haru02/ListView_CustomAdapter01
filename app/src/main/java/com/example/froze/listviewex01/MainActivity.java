package com.example.froze.listviewex01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<DataProvider> arr = new ArrayList<>();

        String[] titlearr = {"OnePiece", "OnePiece","OnePiece","OnePiece","OnePiece"};
        String[] namearr = {"Ruffy", "Zoro", "Nami", "Chopepr", "Sanzi"};
        int image=R.drawable.chopper;

        int i=0;
        for(String a:titlearr){
            DataProvider dataProvider = new DataProvider(titlearr[i], namearr[i], image);
            i++;
            arr.add(dataProvider);
        }

        ListView listView = (ListView)findViewById(R.id.list_view);
        MyAdapter adapter = new MyAdapter(this, R.layout.custom_list_layout, arr);
        listView.setAdapter(adapter);

    }
}
