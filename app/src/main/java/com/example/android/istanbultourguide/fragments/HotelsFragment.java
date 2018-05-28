package com.example.android.istanbultourguide.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
//import android.widget.ListAdapter; ******belki kalkar***
import com.example.android.istanbultourguide.R;
import com.example.android.istanbultourguide.TourPlaces;
import com.example.android.istanbultourguide.adapters.TourAdapter;

import java.util.ArrayList;

public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        // Create a list of places
        ArrayList<TourPlaces> places = new ArrayList<>();
        places.add(new TourPlaces(getResources().getString(R.string.hotel01_name), getResources().getString(R.string.hotel01_address), R.drawable.tarabya));
        places.add(new TourPlaces(getResources().getString(R.string.hotel02_name), getResources().getString(R.string.hotel02_address), R.drawable.themarmara));
        places.add(new TourPlaces(getResources().getString(R.string.hotel03_name), getResources().getString(R.string.hotel03_address), R.drawable.doubletree));
        places.add(new TourPlaces(getResources().getString(R.string.hotel04_name), getResources().getString(R.string.hotel04_address), R.drawable.perapalace));
        places.add(new TourPlaces(getResources().getString(R.string.hotel05_name), getResources().getString(R.string.hotel05_address), R.drawable.hush));
        places.add(new TourPlaces(getResources().getString(R.string.hotel06_name), getResources().getString(R.string.hotel06_address), R.drawable.orient));
        places.add(new TourPlaces(getResources().getString(R.string.hotel07_name), getResources().getString(R.string.hotel07_address), R.drawable.dedeman));
        places.add(new TourPlaces(getResources().getString(R.string.hotel08_name), getResources().getString(R.string.hotel08_address), R.drawable.hyatt));

        //Create an TourAdapter, whose data source is a list of places.
        TourAdapter adapter = new TourAdapter(getActivity(), places);

        //Find the ListView object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        //Make the ListView use the TourAdapter.
        listView.setAdapter(adapter);

        return rootView;
    }
}
