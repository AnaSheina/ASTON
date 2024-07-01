package homework7.Animals;

public abstract class Animal {
    private String name;
    private static int countAnimal;

    public Animal(String name) {
        this.name = name;
        countAnimal++;
    }

    public String getName() {
        return name;
    }

    public static int getCountAnimal() {
        return countAnimal;
    }

    public abstract void run(int m);

    public abstract void swim(int m);
}
