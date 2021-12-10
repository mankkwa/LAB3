package com.company;

public class Ghost extends Persons{

    private String sizeOfGhost;

    public Ghost(Locations place, String sizeOfGhost){
        super(place);
        this.sizeOfGhost = sizeOfGhost;
    }
    @Override
    public void changeLocations(Locations place, int power){
        Locations oldPlace = this.place;
        this.place = place;
        String speed = "";
        if (power > 5){
            speed = "быстро";
        }
        System.out.printf("%s %s %s переместилось(-ась) от %s к %s.\n", sizeOfGhost, name, speed, oldPlace, place);
    }

    public void setSizeOfGhost(String sizeOfGhost) {
        this.sizeOfGhost = sizeOfGhost;
    }

    public String getSizeOfGhost() {
        return sizeOfGhost;
    }


    {
        name = "Привидение";
    }

}
