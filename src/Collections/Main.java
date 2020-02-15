package Collections;

public class Main {
    public static void main(String[] args) {

        System.out.println("*** Arrays ***");

        Cats[] catArr = new Cats[3];
        catArr[0] = new Cats("Egyptian", 10, 5);
        catArr[2] = new Cats("Arctic", 15, 7);

        //For Loop
        for (int i = 0; i < catArr.length; i++) {
            System.out.println(catArr[i]);
        }

        System.out.println();

        System.out.println("*** ArrayList ***");

        System.out.println("*** HashMaps ***");

    }
}