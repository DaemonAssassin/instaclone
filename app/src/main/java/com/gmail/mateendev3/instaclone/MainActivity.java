package com.gmail.mateendev3.instaclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rcRecyclerViewMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcRecyclerViewMain = findViewById(R.id.rc_recycler_view_main);
        ItemAdapter adapter = new ItemAdapter(generateData());
        rcRecyclerViewMain.setLayoutManager(new LinearLayoutManager(this));
        rcRecyclerViewMain.setAdapter(adapter);

    }

    private List<Item> generateData() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(R.drawable.usamasaeed, "usamasaeed", R.drawable.usama_saeedu, "enjoying at moon", R.drawable.mateenmehmood, "1 hour ago - "));
        items.add(new Item(R.drawable.ali_najfi, "ali_najfi", R.drawable.ali_najfiu, "Remember!!!", R.drawable.mateenmehmood, "4 hour ago - "));
        items.add(new Item(R.drawable.junaid_sikandar, "junaid_sikandar", R.drawable.junaidu, "Sunset is great.", R.drawable.mateenmehmood, "11 hour ago - "));
        items.add(new Item(R.drawable.khubaib_aalamgeer, "khubaib_aalamgeer", R.drawable.khubaib_u, "What a view.", R.drawable.mateenmehmood, "2 hour ago - "));
        items.add(new Item(R.drawable.mudassar_ditta, "mudassar_ditta", R.drawable.mudassaru, "What a window.", R.drawable.mateenmehmood, "22 hour ago - "));
        items.add(new Item(R.drawable.umershaikh, "umershaikhu", R.drawable.umer_shaikhu, "Murree is great", R.drawable.mateenmehmood, "15 min ago - "));
        items.add(new Item(R.drawable.zohaibkhan, "zohaibkhan8", R.drawable.zohaibu, "Sunset with see", R.drawable.mateenmehmood, "58 min ago - "));

        return items;
    }
}