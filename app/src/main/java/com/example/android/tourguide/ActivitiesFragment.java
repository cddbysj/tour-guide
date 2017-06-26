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
public class ActivitiesFragment extends Fragment {
    private ArrayList<Site> sites;

    public ActivitiesFragment() {
        // Required empty public constructor
    }

    private ArrayList<Site> getActivitiesList() {
        sites = new ArrayList<>();
        sites.add(new Site(getString(R.string.name_activities_1), getString(R.string.address_activities_1), R.drawable.climbing, getString(R.string.description_activities_1)));
        sites.add(new Site(getString(R.string.name_activities_2), getString(R.string.address_activities_2), R.drawable.watching_fireworks, getString(R.string.description_activities_2)));
        sites.add(new Site(getString(R.string.name_activities_3), getString(R.string.address_activities_3), R.drawable.boating, getString(R.string.description_activities_3)));
        sites.add(new Site(getString(R.string.name_activities_4), getString(R.string.address_activities_4), R.drawable.walking, getString(R.string.description_activities_4)));
        return sites;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_activities, container, false);
        sites = getActivitiesList();
        ListView listView = (ListView) rootView.findViewById(R.id.list_view);
        SiteAdapter adapter = new SiteAdapter(getActivity(), R.layout.item_site, sites);
        listView.setAdapter(adapter);
        return rootView;
    }

}
