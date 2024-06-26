package homework7.animals;

public abstract class Animal {
    private String animalName;
    private static int countAnimal;

    public Animal(String name){
        this.animalName=name;
        countAnimal++;
    }
    public String getName(){
        return animalName;
    }

    public static int getCountAnimal() {
        return countAnimal;
    }

    public abstract void animalRun(int m);
    public abstract void animalSwim(int m);
}
