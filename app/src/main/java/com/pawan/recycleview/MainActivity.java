package com.pawan.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recycleView);

        List<contracts> contractsList=new ArrayList<>();
        contractsList.add(new contracts("Ronaldo","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.","22:00",R.drawable.ronaldo));
        contractsList.add(new contracts("Messi","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.","21:00",R.drawable.messi));
        contractsList.add(new contracts("Neymar","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.","14:00",R.drawable.neymar));
        contractsList.add(new contracts("Ronaldo","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.","22:00",R.drawable.ronaldo));
        contractsList.add(new contracts("Messi","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.","21:00",R.drawable.messi));
        contractsList.add(new contracts("Neymar","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.","14:00",R.drawable.neymar));
        contractsList.add(new contracts("Ronaldo","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.","22:00",R.drawable.ronaldo));
        contractsList.add(new contracts("Messi","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.","21:00",R.drawable.messi));
        contractsList.add(new contracts("Neymar","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.","14:00",R.drawable.neymar));
        contractsList.add(new contracts("Ronaldo","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.","22:00",R.drawable.ronaldo));
        contractsList.add(new contracts("Messi","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.","21:00",R.drawable.messi));
        contractsList.add(new contracts("Neymar","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.","14:00",R.drawable.neymar));


        contactAdapter contactAdapter=new contactAdapter(this,contractsList);
        recyclerView.setAdapter(contactAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
