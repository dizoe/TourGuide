package com.example.android.istanbultourguide.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.istanbultourguide.R;
import com.example.android.istanbultourguide.fragments.AttractionsFragment;
import com.example.android.istanbultourguide.fragments.HotelsFragment;
import com.example.android.istanbultourguide.fragments.MuseumsFragment;
import com.example.android.istanbultourguide.fragments.RestaurantsFragment;


public class CategoryAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context mContext;

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param context is the context of the app
     * @param fm      is the fragment manager that will keep each fragment's state in the adapter
     *                across swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new RestaurantsFragment();
        } else if (position == 1) {
            return new AttractionsFragment();
        } else if (position == 2) {
            return new MuseumsFragment();
        } else {
            return new HotelsFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    /**
     * Get the title of each page.
     */
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_restaurants);
        } else if (position == 1) {
            return mContext.getString(R.string.category_attractions);
        } else if (position == 2) {
            return mContext.getString(R.string.category_museums);
        } else {
            return mContext.getString(R.string.category_hotels);
        }
    }
}