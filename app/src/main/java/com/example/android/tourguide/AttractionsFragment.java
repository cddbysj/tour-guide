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
public class AttractionsFragment extends Fragment {
    private ArrayList<Site> attractionList;

    public AttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_attractions, container, false);
        ListView listView = (ListView) rootView.findViewById(R.id.list_view);
        attractionList = getAttractionsList();
        SiteAdapter adapter = new SiteAdapter(getActivity(), R.layout.item_site, attractionList);
        listView.setAdapter(adapter);
        return rootView;
    }

    private ArrayList<Site> getAttractionsList() {
        attractionList = new ArrayList<>();
        attractionList.add(new Site(getString(R.string.name_attractions_1), getString(R.string.address_attractions_1), R.drawable.orange_isle_01, getString(R.string.description_attractions_1)));
        attractionList.add(new Site(getString(R.string.name_attractions_1), getString(R.string.address_attractions_1), R.drawable.orange_isle_02, getString(R.string.description_attractions_1)));
        attractionList.add(new Site(getString(R.string.name_attractions_1), getString(R.string.address_attractions_1), R.drawable.orange_isle_03, getString(R.string.description_attractions_1)));
        attractionList.add(new Site(getString(R.string.name_attractions_2), getString(R.string.address_attractions_2), R.drawable.du_fu_jiang_pavilion, getString(R.string.description_attractions_2)));
        attractionList.add(new Site(getString(R.string.name_attractions_3), getString(R.string.address_attractions_3), R.drawable.colorful_world_01, getString(R.string.description_attractions_3)));
        attractionList.add(new Site(getString(R.string.name_attractions_3), getString(R.string.address_attractions_3), R.drawable.colorful_world_02, getString(R.string.description_attractions_3)));
        attractionList.add(new Site(getString(R.string.name_attractions_3), getString(R.string.address_attractions_3), R.drawable.colorful_world_03, getString(R.string.description_attractions_3)));
        attractionList.add(new Site(getString(R.string.name_attractions_4), getString(R.string.address_attractions_4), R.drawable.yuelu_mountain_01, getString(R.string.description_attractions_4)));
        attractionList.add(new Site(getString(R.string.name_attractions_4), getString(R.string.address_attractions_4), R.drawable.yuelu_mountain_02, getString(R.string.description_attractions_4)));
        attractionList.add(new Site(getString(R.string.name_attractions_4), getString(R.string.address_attractions_4), R.drawable.yuelu_mountain_03, getString(R.string.description_attractions_4)));
        attractionList.add(new Site(getString(R.string.name_attractions_5), getString(R.string.address_attractions_5), R.drawable.martyrs_park_01, getString(R.string.description_attractions_5)));
        return attractionList;
    }

}
