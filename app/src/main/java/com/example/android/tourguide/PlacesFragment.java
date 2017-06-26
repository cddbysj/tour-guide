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
public class PlacesFragment extends Fragment {
    private ArrayList<Site> sites;

    public PlacesFragment() {
        // Required empty public constructor
    }

    private ArrayList<Site> getPlacesList() {
        sites = new ArrayList<>();
        sites.add(new Site(getString(R.string.name_places_1), getString(R.string.description_places_1), getString(R.string.address_places_1), getString(R.string.tel_places_1), getString(R.string.open_time_places_1)));
        sites.add(new Site(getString(R.string.name_places_2), getString(R.string.description_places_2), getString(R.string.address_places_2), getString(R.string.tel_places_2), getString(R.string.open_time_places_2)));
        sites.add(new Site(getString(R.string.name_places_3), getString(R.string.description_places_3), getString(R.string.address_places_3), getString(R.string.tel_places_3), getString(R.string.open_time_places_3)));
        return sites;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_places, container, false);
        ListView listView = (ListView) rootView.findViewById(R.id.list_view);
        //Get data source
        sites = getPlacesList();
        AnotherSiteAdapter adapter = new AnotherSiteAdapter(getActivity(), R.layout.anoter_item_site, sites);
        //Connect list view to data source
        listView.setAdapter(adapter);
        return rootView;
    }

}
