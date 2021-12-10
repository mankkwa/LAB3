package com.company;

interface PositiveExpressionAction {
    void laugh(int power);
}

interface NegativeExpressionAction {
    void scream(int power);
}

interface FurnitureAction {
    void throwObjects(FurnitureObject furniture);
    void disassembleBarricade(int power, BarricadeObject barricade);
}

interface LocationAction {
    void changeLocations(Locations place, int power);
    default void throwError(){
        System.out.println("Нельзя сделать это в данном месте!\n");
    }
}
