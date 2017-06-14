package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {
    private ArrayList<Site> sites = new ArrayList<>();

    private ArrayList<Site> getRestaurantsList() {
        sites.add(new Site("Toufu House", "Description", "Huangxing Road", "0731-88808844", "opening time: 10:00am - 12:pm"));
        sites.add(new Site("Huogong palace", "Description", "Huangxing Road", "0731-88808844", "opening time: 10:00am - 12:pm"));
        sites.add(new Site("XuLiuShan", "Description", "Huangxing Road", "0731-88808844", "opening time: 10:00am - 12:pm"));
        sites.add(new Site("Toufu House", "Description", "Huangxing Road", "0731-88808844", "opening time: 10:00am - 12:pm"));
        sites.add(new Site("Toufu House", "Description", "Huangxing Road", "0731-88808844", "opening time: 10:00am - 12:pm"));
        return sites;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        ListView listView = (ListView) findViewById(R.id.list_view);
        //Get data source
        sites = getRestaurantsList();
        AnotherSiteAdapter adapter = new AnotherSiteAdapter(getBaseContext(), R.layout.anoter_item_site, sites);
        //Connect list view to data source
        listView.setAdapter(adapter);
    }
}
