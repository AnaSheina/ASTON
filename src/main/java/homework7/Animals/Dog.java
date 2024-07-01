package homework7.Animals;

public class Dog extends Animal {
    private static int countDog = 0;

    public Dog(String name) {
        super(name);
        countDog++;
    }

    public static int getCountDog() {
        return countDog;
    }

    @Override
    public void run(int m) {
        int runLimit = 500;
        System.out.println((m <= runLimit) ? getName() + " пробежал " + m + "м." : "Собака " + getName() + " не может пробежать такое расстояние.");
    }

    @Override
    public void swim(int m) {
        int swimLimit = 50;
        System.out.println((m <= swimLimit) ? getName() + " проплыл " + m + "м." : "Собака " + getName() + " не может проплыть такое расстояние.");
    }
}
