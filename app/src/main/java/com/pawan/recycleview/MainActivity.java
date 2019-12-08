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
        contractsList.add(new contracts("Ronaldo","8324732784732",R.drawable.ronaldo));
        contractsList.add(new contracts("Messi","3567432i483",R.drawable.messi));
        contractsList.add(new contracts("Neymar","63646327",R.drawable.neymar));

        contactAdapter contactAdapter=new contactAdapter(this,contractsList);
        recyclerView.setAdapter(contactAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
