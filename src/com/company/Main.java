package com.company;

public class Main {

    public static void main(String[] args) {

        FrekenBok frekenBok = new FrekenBok(Locations.ROOM);
        Ghost ghost = new Ghost(Locations.BED, "Маленькое");
        FurnitureObject furniture = new FurnitureObject("Средняя");
        BarricadeObject barricade = new BarricadeObject("Внушительная", Locations.DOOR);

        ghost.changeLocations(Locations.ROOM, 7);
        ghost.laugh(6);
        frekenBok.laugh(0);
        frekenBok.changeLocations(Locations.DOOR, 6);
        frekenBok.throwObjects(furniture);
        frekenBok.disassembleBarricade(7, barricade);
        frekenBok.scream(2);
        frekenBok.changeLocations(Locations.ANTECHAMBER, 8);
    }
}
