package homework7.Animals;

public class Dog extends Animal {
    private static int countDog = 0;

    public Dog(String name){
        super(name);
        countDog++;
    }

    public static int getCountDog() {
        return countDog;
    }

    @Override
    public void animalRun(int m) {
        System.out.println((m<=500)? getName() + " пробежал " + m + "м.":"Собака " + getName() + " не может пробежать такое расстояние.");
    }

    @Override
    public void animalSwim(int m) {
        System.out.println((m<=10)? getName() + " проплыл " + m + "м.":"Собака " + getName() + " не может проплыть такое расстояние.");
    }
}
