package AntiElite.com;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> munchiesList = new ArrayList<>();

        ArrayList<String> snackList = new ArrayList<>();
        snackList.add("Cheetos");
        snackList.add("Doritos");
        snackList.add("Skittles");
        snackList.add("Kit kat Dark chocolate");
        snackList.add("Jumping jack pop corn");

        ArrayList<String> bevList = new ArrayList<>();
        bevList.add("Sprite zero sugar");
        bevList.add("Water");
        bevList.add("Ginger ale");
        bevList.add("Lean");
        bevList.add("Mineral Water");
        bevList.add("Mountain Dew");

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("Garlic bread");
        bakeryList.add("Donuts");
        bakeryList.add("pasta");
        bakeryList.add("Eggs");
        bakeryList.add("Lettuce");
        bakeryList.add("Mushrooms");

        munchiesList.add(bevList);
        munchiesList.add(snackList);
        munchiesList.add(bakeryList);

        System.out.println(munchiesList.get(1).get(4));





    }
}
