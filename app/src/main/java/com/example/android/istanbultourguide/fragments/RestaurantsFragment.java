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

public class RestaurantsFragment extends Fragment {
    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        // Create a list of places
        ArrayList<TourPlaces> places = new ArrayList<>();
        places.add(new TourPlaces(getResources().getString(R.string.rest01_name), getResources().getString(R.string.rest01_address), R.drawable.vogue));
        places.add(new TourPlaces(getResources().getString(R.string.rest02_name), getResources().getString(R.string.rest02_address), R.drawable.yenilokanta));
        places.add(new TourPlaces(getResources().getString(R.string.rest03_name), getResources().getString(R.string.rest03_address), R.drawable.bosphorus));
        places.add(new TourPlaces(getResources().getString(R.string.rest04_name), getResources().getString(R.string.rest04_address), R.drawable.lebiderya));
        places.add(new TourPlaces(getResources().getString(R.string.rest05_name), getResources().getString(R.string.rest05_address), R.drawable.neolokal));
        places.add(new TourPlaces(getResources().getString(R.string.rest06_name), getResources().getString(R.string.rest06_address), R.drawable.mythos));
        places.add(new TourPlaces(getResources().getString(R.string.rest07_name), getResources().getString(R.string.rest07_address), R.drawable.bankalar));
        places.add(new TourPlaces(getResources().getString(R.string.rest08_name), getResources().getString(R.string.rest08_address), R.drawable.galapagos));

        //Create an TourAdapter, whose data source is a list of places.
        TourAdapter adapter = new TourAdapter(getActivity(), places);

        //Find the ListView object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        //Make the ListView use the TourAdapter
        listView.setAdapter(adapter);

        return rootView;
    }
}
