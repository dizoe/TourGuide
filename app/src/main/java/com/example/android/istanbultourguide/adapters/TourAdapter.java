package com.example.android.istanbultourguide.adapters;

        import android.app.Activity;
        import android.content.Context;
        import android.support.annotation.NonNull;
        import android.util.DisplayMetrics;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.widget.ImageView;
        import android.widget.TextView;
        import android.widget.Toast;

        import com.example.android.istanbultourguide.R;
        import com.example.android.istanbultourguide.TourPlaces;

        import java.util.ArrayList;

public class TourAdapter extends ArrayAdapter<TourPlaces> {

    /**
     * Create a new {@link TourAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter
     *                is being created in.
     * @param places  is the list of {@link TourPlaces}s to be displayed.
     */
    public TourAdapter(Context context, ArrayList<TourPlaces> places) {
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link TourPlaces} object located at this position in the list
        final TourPlaces currentPlace = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID name_text_view.
        TextView name = (TextView) listItemView.findViewById(R.id.name_text_view);
        // Get the name of the place from the currentPlace object and set this text on name.
        name.setText(currentPlace.getPlaceName());


        // Find the TextView in the list_item.xml layout with the ID address_text_view.
        TextView address = (TextView) listItemView.findViewById(R.id.address_text_view);
        // Get the address of the place from the currentPlace object and set this text on address.
        address.setText(currentPlace.getPlaceAddress());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);
        final int image = currentPlace.getImageResourceId();

        if (currentPlace.hasImage()) {
            imageView.setImageResource(currentPlace.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        // Enlarge the image when the user clicks on the image
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayMetrics display = new DisplayMetrics();
                // Find this screen
                ((Activity) getContext()).getWindowManager().getDefaultDisplay().getMetrics(display);
                // Get height
                int height = display.heightPixels;
                // Get width
                int width = display.widthPixels;
                // Make inflater
                LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                // Inflate layout take my layout id , id of layout that have ImageView
                View sub_layout = inflater != null ? inflater.inflate(R.layout.zoom_layout, (ViewGroup) ((Activity) getContext()).findViewById(R.id.layout)) : null;
                // Get reference to the ImageView
                ImageView img = (ImageView) sub_layout.findViewById(R.id.zoom_image);
                // Set image
                img.setImageResource(image);
                // Set height of image is height from DisplayMetrics Full Screen
                img.setMinimumHeight(height);
                // Set width of image is width from DisplayMetrics Full Screen
                img.setMinimumWidth(width);
                img.setMaxHeight(height);
                img.setMaxWidth(width);
                // Show this sub_layout in Toast
                Toast toast = new Toast(getContext().getApplicationContext());
                // Set view
                toast.setView(sub_layout);
                // Show this toast
                toast.show();
            }
        });

        return listItemView;
    }


}

