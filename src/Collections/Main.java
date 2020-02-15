package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

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

        //add and set elements to arrayList
        ArrayList<Cats> catsArrayList = new ArrayList<Cats>();
        catsArrayList.addAll(Arrays.asList(catArr));
        catsArrayList.add(new Cats("Fury", 13, 9));
        catsArrayList.add(2, new Cats("Grek", 20, 6));

        catsArrayList.set(2, new Cats("greky", 21, 7));

        //For Each Loop ArrayList
        for (Cats c : catsArrayList) {
            System.out.println(c);
        };

        System.out.println("\nArrayList size: " + catsArrayList.size());


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
        
        //Creating HashMap
        HashMap<Integer, Cats> catsHashMap = new HashMap<Integer, Cats>();

        //Add some Data
        int hashcount = 0;
        for (Cats c : catsArrayList) {
            catsHashMap.put(hashcount, c);
            hashcount++;
        }

        //get element 2
        System.out.println(catsHashMap.get(2));
        //get size
        System.out.println(catsHashMap.size());
        //remove element 2
        catsHashMap.remove(2);
        //get element 2
        System.out.println(catsHashMap.get(2));

        //get all elements
        for (Integer i : catsHashMap.keySet()) {
            System.out.println("key: " + i + " value: " + catsHashMap.get(i));
        }

        System.out.println();

        //Sort HashMap, first create arraylist from hashmap
        ArrayList<HashMap.Entry<Integer, Cats>> sortedMap = new ArrayList<HashMap.Entry<Integer, Cats>>();

        //add data to arraylist
        sortedMap.addAll(catsHashMap.entrySet());

        //now sort
        Collections.sort(sortedMap, new Comparator<HashMap.Entry<Integer, Cats>>() {
            public int compare(HashMap.Entry<Integer, Cats> o1, HashMap.Entry<Integer, Cats> o2) {
                return o1.getValue().getBreed().compareToIgnoreCase(o2.getValue().getBreed());
                // return o2.getValue().getAvgWeight() - o1.getValue().getAvgWeight();
            }
        });

        //print sorted
        for (HashMap.Entry<Integer, Cats> c : sortedMap) {
            System.out.println("key: " + c.getKey() + " Value: " + c.getValue());
        }

        System.out.println();
    }
}