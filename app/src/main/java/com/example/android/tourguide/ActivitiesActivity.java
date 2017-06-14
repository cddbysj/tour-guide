package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ActivitiesActivity extends AppCompatActivity {
    private static ArrayList<Site> sites;

    private static ArrayList<Site> getActivitiesList() {
        sites = new ArrayList<>();
        sites.add(new Site("climbing", "Yuelu Mountain", R.drawable.orange_isle_06, "description"));
        sites.add(new Site("climbing", "Yuelu Mountain", R.drawable.orange_isle_06, "description"));
        sites.add(new Site("climbing", "Yuelu Mountain", R.drawable.orange_isle_06, "description"));
        sites.add(new Site("climbing", "Yuelu Mountain", R.drawable.orange_isle_06, "description"));
        sites.add(new Site("climbing", "Yuelu Mountain", R.drawable.orange_isle_06, "description"));
        sites.add(new Site("climbing", "Yuelu Mountain", R.drawable.orange_isle_06, "description"));
        sites.add(new Site("climbing", "Yuelu Mountain", R.drawable.orange_isle_06, "description"));
        return sites;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activities);
        sites = getActivitiesList();
        ListView listView = (ListView) findViewById(R.id.list_view);
        SiteAdapter adapter = new SiteAdapter(getBaseContext(), R.layout.item_site, sites);
        listView.setAdapter(adapter);
    }
}
