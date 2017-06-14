package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PlacesActivity extends AppCompatActivity {
    private ArrayList<Site> sites = new ArrayList<>();

    private ArrayList<Site> getPlacesList() {
        sites.add(new Site("Museum", "Description", "Dongfeng Road", "0731-88808844", "opening time: 7:00am - 10:pm"));
        sites.add(new Site("Museum", "Description", "Dongfeng Road", "0731-88808844", "opening time: 7:00am - 10:pm"));
        sites.add(new Site("Museum", "Description", "Dongfeng Road", "0731-88808844", "opening time: 7:00am - 10:pm"));
        sites.add(new Site("Museum", "Description", "Dongfeng Road", "0731-88808844", "opening time: 7:00am - 10:pm"));
        sites.add(new Site("Museum", "Description", "Dongfeng Road", "0731-88808844", "opening time: 7:00am - 10:pm"));
        return sites;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);
        ListView listView = (ListView) findViewById(R.id.list_view);
        //Get data source
        sites = getPlacesList();
        AnotherSiteAdapter adapter = new AnotherSiteAdapter(getBaseContext(), R.layout.anoter_item_site, sites);
        //Connect list view to data source
        listView.setAdapter(adapter);
    }
}
