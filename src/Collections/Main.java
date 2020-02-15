package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("*** Arrays ***");

        Cats[] catArr = new Cats[3];
        catArr[0] = new Cats("Egyptian", 10, 5);
        catArr[2] = new Cats("Arctic", 15, 7);
        catArr[1] = new Cats("Slums", 5, 3);

        //For Loop Array
        for (int i = 0; i < catArr.length; i++) {
            System.out.println(catArr[i]);
        }


        System.out.println("\n*** ArrayList ***");
        ArrayList<Cats> catsArrayList = new ArrayList<Cats>();
        catsArrayList.addAll(Arrays.asList(catArr));
        catsArrayList.add(new Cats("Fury", 13, 9));

        //For Each Loop ArrayList
        for (Cats c : catsArrayList) {
            System.out.println(c);
        };

        System.out.println();

        //Loop through List
        for (Cats c : catsArrayList) {
            if (c.getAvgWeight() >= 12) {
                System.out.println(c.getBreed() + " are big");
            } else {
                System.out.println(c.getBreed() + " are small");
            }
        }

        System.out.println("\n*** HashMaps ***");

    }
}