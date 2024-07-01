package homework7.Animals;

public class Cat extends Animal {
    private static int countCat = 0;
    private boolean fullness;

    public Cat(String name) {
        super(name);
        countCat++;
        this.fullness = false;
    }

    public static int getCountCat() {
        return countCat;
    }

    public String catFull() {
        return (this.fullness ? getName() + " сыт." : getName() + " голоден.");
    }

    public boolean isFullness() {
        return fullness;
    }

    @Override
    public void run(int m) {
        int runLimit = 200;
        System.out.println((m <= runLimit) ? getName() + " пробежал " + m + "м." : "Кот " + getName() + " не может пробежать такое расстояние.");
    }

    @Override
    public void swim(int m) {
        System.out.println("Кот " + getName() + " не умеет плавать.");
    }

    public void eat(Bowl Bowl, int foodAmount) {
        if (Bowl.getFoodAmount() >= foodAmount) {
            Bowl.decreaseFood(foodAmount);
            this.fullness = true;
        }
    }
}
