package com.example.android.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnToAttractions = (Button) findViewById(R.id.btn_to_attractions);
        Button btnToActivities = (Button) findViewById(R.id.btn_to_activities);
        Button btnToPlaces = (Button) findViewById(R.id.btn_to_places);
        Button btnToRestaurants = (Button) findViewById(R.id.btn_to_restaurants);
        btnToAttractions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AttractionsActivity.class);
                startActivity(intent);
            }
        });

        btnToActivities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ActivitiesActivity.class);
                startActivity(intent);
            }
        });
        btnToPlaces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PlacesActivity.class);
                startActivity(intent);
            }
        });
        btnToRestaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RestaurantsActivity.class);
                startActivity(intent);
            }
        });

    }
}
