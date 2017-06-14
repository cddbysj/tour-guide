package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class AttractionsActivity extends AppCompatActivity {
    private static ArrayList<Site> attractionList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attractions);

        ListView listView = (ListView) findViewById(R.id.list_view);
        attractionList = getAttractionsList();
        SiteAdapter adapter = new SiteAdapter(getBaseContext(), R.layout.item_site, attractionList);
        listView.setAdapter(adapter);
    }

    private ArrayList<Site> getAttractionsList() {
        attractionList = new ArrayList<>();
        attractionList.add(new Site("Orange Isle", "Xiangjiang river", R.drawable.orange_isle_06, "description"));
        attractionList.add(new Site("Orange Isle", "Xiangjiang river", R.drawable.orange_isle_06, "description"));
        attractionList.add(new Site("Orange Isle", "Xiangjiang river", R.drawable.orange_isle_06, "description"));
        attractionList.add(new Site("Orange Isle", "Xiangjiang river", R.drawable.orange_isle_06, "description"));
        attractionList.add(new Site("Orange Isle", "Xiangjiang river", R.drawable.orange_isle_06, "description"));
        attractionList.add(new Site("Orange Isle", "Xiangjiang river", R.drawable.orange_isle_06, "description"));
        attractionList.add(new Site("Orange Isle", "Xiangjiang river", R.drawable.orange_isle_06, "description"));
        attractionList.add(new Site("Orange Isle", "Xiangjiang river", R.drawable.orange_isle_06, "description"));
        attractionList.add(new Site("Orange Isle", "Xiangjiang river", R.drawable.orange_isle_06, "description"));
        attractionList.add(new Site("Orange Isle", "Xiangjiang river", R.drawable.orange_isle_06, "description"));
        attractionList.add(new Site("Orange Isle", "Xiangjiang river", R.drawable.orange_isle_06, "description"));
        return attractionList;
    }
}
