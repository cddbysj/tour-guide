package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by billwen on 2017/6/15.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    private final int PAGE_COUNT = 4;
    private Context mContext;

    //从所在的Fframent传一个context对象，用以获取strings资源
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new AttractionsFragment();
            case 1:
                return new ActivitiesFragment();
            case 2:
                return new PlacesFragment();
            case 3:
                return new RestaurantsFragment();
            default:

        }
        return null;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.title_attractions);
            case 1:
                return mContext.getString(R.string.title_activities);
            case 2:
                return mContext.getString(R.string.title_public_places);
            case 3:
                return mContext.getString(R.string.title_restaurants);
            default:
        }
        return null;
    }
}
