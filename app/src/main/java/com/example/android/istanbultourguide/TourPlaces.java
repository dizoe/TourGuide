package com.example.android.istanbultourguide;

public class TourPlaces {

    /**
     * Constant value that represents no image is provided for that place
     */
    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * Name of the place
     */
    private String name;
    /**
     * Address of the place
     */
    private String address;
    /**
     * Image resource ID for the place
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Create a constructor.
     *
     * @param name    is the name of the place.
     * @param address is the address of the place.
     */
    public TourPlaces(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * Create a a constructor that contain image.
     *
     * @param name            is the name of the place.
     * @param address         is the address of the place.
     * @param imageResourceId is the drawable resource ID for the image associated with the TourPlaces.
     */
    public TourPlaces(String name, String address, int imageResourceId) {
        this.name = name;
        this.address = address;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the name of that place.
     */
    public String getPlaceName() {
        return this.name;
    }

    /**
     * Get the address of that place.
     */
    public String getPlaceAddress() {
        return this.address;
    }


    /**
     * Return the image resource ID of the TourPlaces.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Return whether or not there is an image for that TourPlaces.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
