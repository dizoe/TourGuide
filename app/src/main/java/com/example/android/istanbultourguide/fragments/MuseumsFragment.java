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

public class MuseumsFragment extends Fragment {
    public MuseumsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        // Create a list of places
        ArrayList<TourPlaces> places = new ArrayList<>();
        places.add(new TourPlaces(getResources().getString(R.string.museum01_name), getResources().getString(R.string.museum01_address), R.drawable.arkeoloji));
        places.add(new TourPlaces(getResources().getString(R.string.museum02_name), getResources().getString(R.string.museum02_address), R.drawable.ayasofya));
        places.add(new TourPlaces(getResources().getString(R.string.museum03_name), getResources().getString(R.string.museum03_address), R.drawable.topkapi));
        places.add(new TourPlaces(getResources().getString(R.string.museum04_name), getResources().getString(R.string.museum04_address), R.drawable.pera));
        places.add(new TourPlaces(getResources().getString(R.string.museum05_name), getResources().getString(R.string.museum05_address), R.drawable.turkveislam));
        places.add(new TourPlaces(getResources().getString(R.string.museum06_name), getResources().getString(R.string.museum06_address), R.drawable.borusan));
        places.add(new TourPlaces(getResources().getString(R.string.museum07_name), getResources().getString(R.string.museum07_address), R.drawable.sabanci));
        places.add(new TourPlaces(getResources().getString(R.string.museum08_name), getResources().getString(R.string.museum08_address), R.drawable.salt));

        //Create an TourAdapter, whose data source is a list of places.
        TourAdapter adapter = new TourAdapter(getActivity(), places);

        //Find the ListView object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        //Make the ListView use the TourAdapter
        listView.setAdapter(adapter);

        return rootView;
    }
}