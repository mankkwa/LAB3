package com.company;

public class BarricadeObject extends Objects{

    private Locations place;

    BarricadeObject(String size, Locations place){
        super(size);
        this.place = place;
    }

    public void setPlace(Locations place){
        this.place = place;
    }
    public Locations getPlace(){
        return place;
    }

}
