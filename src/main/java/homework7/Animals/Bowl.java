package homework7.Animals;

public class Bowl {
    private int foodAmount;

    public Bowl(int food) {
        this.foodAmount = food;
    }

    //текущее количечтво еды
    public int getFoodAmount() {
        return foodAmount;
    }

    //добавление еды
    public void addFood(int food) {
        this.foodAmount = getFoodAmount() + food;
    }

    //убрать еду после приема пищи
    public void decreaseFood(int food) {
        this.foodAmount = getFoodAmount() - food;
    }
}
