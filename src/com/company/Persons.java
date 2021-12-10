package com.company;

import java.util.Objects;

abstract class Persons implements PositiveExpressionAction, LocationAction{

    protected String name;
    protected Locations place;

    public Persons(Locations place) {
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void laugh(int power){
        if (power == 0){
            System.out.printf("%s не смеется.\n", name);
        } else if (power < 3){
            System.out.printf("%s смеется не очень громко.\n", name);
        } else if (power > 5){
            System.out.printf("%s смеется очень громко.\n", name);
        } else {
            System.out.printf("%s смеется.\n", name);
        }
    }

    protected Locations getPlace() {
        return place;
    }

    public void changeLocations(Locations place, int power){
        Locations oldPlace = this.place;
        this.place = place;
        String speed = "";
        if (power > 5){
            speed = "быстро";
        }
        System.out.printf("%s %s переместилось(-ась) от %s к %s.\n", name, speed, oldPlace, place);
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Persons)) return false;
        Persons person = (Persons) o;
        return Objects.equals(name, person.getName()) &&
                Objects.equals(place, person.getPlace());
    }

    @Override
    public String toString() {
        return "Персонаж " + name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, place);
    }

}
