package com.example.android.istanbultourguide.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.android.istanbultourguide.R;
import com.example.android.istanbultourguide.TourPlaces;
import com.example.android.istanbultourguide.adapters.TourAdapter;

import java.util.ArrayList;

public class AttractionsFragment extends Fragment {
    public AttractionsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        // Create a list of places
        ArrayList<TourPlaces> places = new ArrayList<>();
        places.add(new TourPlaces(getResources().getString(R.string.att01_name), getResources().getString(R.string.att01_address), R.drawable.blue));
        places.add(new TourPlaces(getResources().getString(R.string.att02_name), getResources().getString(R.string.att02_address), R.drawable.sur));
        places.add(new TourPlaces(getResources().getString(R.string.att03_name), getResources().getString(R.string.att03_address), R.drawable.bogaz));
        places.add(new TourPlaces(getResources().getString(R.string.att04_name), getResources().getString(R.string.att04_address), R.drawable.yerebatan));
        places.add(new TourPlaces(getResources().getString(R.string.att05_name), getResources().getString(R.string.att05_address), R.drawable.hipodrom));
        places.add(new TourPlaces(getResources().getString(R.string.att06_name), getResources().getString(R.string.att06_address), R.drawable.islands));
        places.add(new TourPlaces(getResources().getString(R.string.att07_name), getResources().getString(R.string.att07_address), R.drawable.kapali));
        places.add(new TourPlaces(getResources().getString(R.string.att08_name), getResources().getString(R.string.att08_address), R.drawable.fenerjpg));

        //Create an TourAdapter, whose data source is a list of places.
        TourAdapter adapter = new TourAdapter(getActivity(), places);

        //Find the ListView object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        //Make the ListView use the TourAdapter.
        listView.setAdapter(adapter);

        return rootView;
    }
}
