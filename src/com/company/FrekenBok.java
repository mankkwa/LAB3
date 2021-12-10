package com.company;

public class FrekenBok extends Persons implements FurnitureAction, NegativeExpressionAction{

    FrekenBok(Locations place){
        super(place);
    }

    public void scream(int power){
        if (power == 0){
            System.out.printf("%s не кричит.\n", name);
        } else if (power < 3){
            System.out.printf("%s кричит очень громко.\n", name);
        } else if (power > 5){
            System.out.printf("%s кричит не очень громко.\n", name);
        } else{
            System.out.printf("%s кричит.\n", name);
        }
    }

    public void throwObjects(FurnitureObject furniture){
            System.out.printf("%s швыряет: %s мебель.\n", name, furniture.size);
    }

    public void disassembleBarricade(int power, BarricadeObject barricade){
        if (!(barricade.getPlace().equals(this.place))) {throwError();}
        else {
            if (power < 3) {
                System.out.printf("%s медленно разбирает: %s баррикада.\n", name, barricade.size);
            } else if (power > 5) {
                System.out.printf("%s быстро разбирает: %s баррикада.\n", name, barricade.size);
            } else {
                System.out.printf("%s разбирает: %s баррикада.\n", name, barricade.size);
            }
            barricade = null;
            System.gc();
            System.out.println("Баррикада разрушена!");
        }

    }

    {
        name = "Фрекен Бок";
    }

}
