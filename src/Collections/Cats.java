package Collections;


public class Cats {

    //fields
    private String breed;
    private int avgWeight;
    private int age;

    //constructor
    public Cats(String breed, int avgWeight, int age) {
        this.breed = breed;
        this.avgWeight = avgWeight;
        this.age = age;
    }

    //getters and setters
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAvgWeight() {
        return avgWeight;
    }

    public void setAvgWeight(int avgWeight) {
        this.avgWeight = avgWeight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" + "breed: " + breed +  ", avgWeight: " + avgWeight +  ", age: " + age + "}";
    }
}