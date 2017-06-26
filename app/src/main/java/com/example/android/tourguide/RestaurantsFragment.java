package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {
    private ArrayList<Site> sites;

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    private ArrayList<Site> getRestaurantsList() {
        sites = new ArrayList<>();
        sites.add(new Site(getString(R.string.restaurants_name_1), getString(R.string.description), getString(R.string.restaurants_address_1), getString(R.string.restaurants_tel_1), getString(R.string.restaurants_open_time)));
        sites.add(new Site(getString(R.string.restaurants_name_2), getString(R.string.description), getString(R.string.restaurants_address_1), getString(R.string.restaurants_tel_2), getString(R.string.restaurants_open_time)));
        sites.add(new Site(getString(R.string.restaurants_name_3), getString(R.string.description), getString(R.string.restaurants_address_1), getString(R.string.restaurants_tel_3), getString(R.string.restaurants_open_time)));
        sites.add(new Site(getString(R.string.restaurants_name_4), getString(R.string.description), getString(R.string.restaurants_address_1), getString(R.string.restaurants_tel_4), getString(R.string.restaurants_open_time)));
        sites.add(new Site(getString(R.string.restaurants_name_5), getString(R.string.description), getString(R.string.restaurants_address_1), getString(R.string.restaurants_tel_5), getString(R.string.restaurants_open_time)));
        sites.add(new Site(getString(R.string.restaurants_name_6), getString(R.string.description), getString(R.string.restaurants_address_1), getString(R.string.restaurants_tel_6), getString(R.string.restaurants_open_time)));
        return sites;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_restaurants, container, false);
        ListView listView = (ListView) rootView.findViewById(R.id.list_view);
        //Get data source
        sites = getRestaurantsList();
        AnotherSiteAdapter adapter = new AnotherSiteAdapter(getActivity(), R.layout.anoter_item_site, sites);
        //Connect list view to data source
        listView.setAdapter(adapter);
        return rootView;
    }

}
