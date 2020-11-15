package hw.lesson5;

import java.util.ArrayList;
import java.util.List;

public class RucksackTest {

    public static void main(String[] args) {
        rucksackTest();
    }

    private static List<Thing> initThings(){
        List<Thing> thingsList = new ArrayList<>();
        thingsList.add (new Thing("Book",1, 600));
        thingsList.add (new Thing("Binoculars",2, 5_000));
        thingsList.add (new Thing("First-aid kit",4, 1_500));
        thingsList.add (new Thing("Laptop",2, 40_000));
        thingsList.add (new Thing("Pot",1, 500));
        thingsList.add (new Thing("Table game",1, 1_000));
        thingsList.add (new Thing("Clothes",2, 1_500));
        thingsList.add (new Thing("Tablet",1, 6_500));
        thingsList.add (new Thing("Artist's set",2, 3_500));
        thingsList.add (new Thing("Chess",2, 2_500));
        return thingsList;
    }

    private static void rucksackTest(){
        Rucksack someRucksack = new Rucksack(10);
        someRucksack.countTheBestSet(initThings());
        for (Thing thing : someRucksack.getTheBestSet()){
            System.out.println (thing.getTitle() + " " +
                                thing.getWeight() + " kg "  +
                                thing.getPrice() + " RUB");
        }
        System.out.println("The overall chosen things' price is " + someRucksack.getTheBestPrice());
    }
}
