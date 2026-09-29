package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // ---------- Collection Exercise 2 ---------- //
        CollectionExercises collectionExercises = new CollectionExercises();
        String[] fruitsTwo = collectionExercises.makeFruitStringArrayWithSize(3);
        System.out.println("");
        System.out.println("Collection Exercise 2:");
        System.out.println("----------------------");
        System.out.println(Arrays.toString(fruitsTwo));

        // ---------- Collection Exercise 3 ---------- //
        String[] fruitsThree = collectionExercises.makeFruitStringArray();
        String[] topThree = collectionExercises.makeTopThreeArray(fruitsThree);
        System.out.println("");
        System.out.println("Collection Exercise 3:");
        System.out.println("----------------------");
        System.out.println(Arrays.toString(topThree));

        // ---------- Collection Exercise 4 ---------- //
        ArrayList<String> fruitsFour = collectionExercises.makeFruitList();
        System.out.println("");
        System.out.println("Collection Exercise 4:");
        System.out.println("----------------------");
        for (String fruit : fruitsFour) {
            System.out.println(fruit);
        }

        // System.out.println(fruitsThree);

        // ---------- Collection Exercise 5 ---------- //
        String[] threeFruits = collectionExercises.makeFruitStringArray();
        ArrayList<String> fruitsFive = collectionExercises.makeListOfThreeFruits(
                threeFruits[0],
                threeFruits[1],
                threeFruits[2]
        );

        System.out.println("");
        System.out.println("Collection Exercise 5:");
        System.out.println("----------------------");
        for (String fruit : fruitsFive) {
            System.out.println(fruit);
        }

        // ---------- Collection Exercise 6 ---------- //
        HashMap<String, String> fruitColors = collectionExercises.makeFruitMap();
        System.out.println("");
        System.out.println("Collection Exercise 6:");
        System.out.println("----------------------");
        for (Map.Entry<String, String> entry : fruitColors.entrySet()){
            String fruit= entry.getKey();
            String fruitColor = entry.getValue();

            System.out.println(fruit + " -> " + fruitColor);
        }

        // ---------- Collection Exercise 7 ---------- //
        HashMap<String, String> fruitColorApple = collectionExercises.makeFruitMap();
        String appleColor = collectionExercises.lookupAppleColor(fruitColorApple);
        System.out.println("");
        System.out.println("Collection Exercise 7:");
        System.out.println("----------------------");
        System.out.println(appleColor);

        // ---------- Collection Exercise 8 ---------- //
        HashSet<String> fruitSet = collectionExercises.makeFruitSet("apple", "banana", "cherry");
        System.out.println("");
        System.out.println("Collection Exercise 8:");
        System.out.println("----------------------");
        System.out.println(fruitSet);


//        StudentManager studentManager = new StudentManager();
//        studentManager.mainMenu();

    }
}