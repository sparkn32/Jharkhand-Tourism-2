package com.example.abhinav.jharkhand;

public class Item {
    String placeName;
    int placeImage;

    public Item(String placeName,int placeImage)
    {
        this.placeImage=placeImage;
        this.placeName=placeName;
    }
    public String getplaceName()
    {
        return placeName;
    }
    public int getplaceImage()
    {
        return placeImage;
    }
}
