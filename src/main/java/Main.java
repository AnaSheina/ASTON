import Geometry.Circle;
import Geometry.Rectangle;
import Geometry.Triangle;
import homework7.animals.Animal;
import homework7.animals.Bowl;
import homework7.animals.Cat;
import homework7.animals.Dog;

public class Main {
    public static void main(String[] args) {
        //Задание про животных
        //создали котов
        Cat cat1 = new Cat("Додо");
        Cat cat2 = new Cat("Персик");
        Cat cat3 = new Cat("Светлячок");
        Cat cat4 = new Cat("Сэм");
        //проверили котов на бег и плавание
        cat1.animalRun(300);
        cat2.animalSwim(200);
        //создали собак
        Dog dog1 = new Dog("Мышь");
        Dog dog2 = new Dog("Кико");
        //проверили собак на бег и плавание
        dog1.animalRun(300);
        dog2.animalSwim(5);
        //вывели информацию о количестве
        System.out.printf("Количество котов: %s\n", Cat.getCountCat());
        System.out.printf("Количество собак: %s\n", Dog.getCountDog());
        System.out.printf("Количество животных: %s\n", Animal.getCountAnimal());
        //создали массив котов
        Cat[] cats = {cat1,cat2,cat3,cat4};
        //создали миску
        Bowl bowl1 = new Bowl(50);
        //покормили кота
        cat1.eat(bowl1,5);
        //добавили в миску еду
        bowl1.addFood(10);
        //покормили массив котов и вывели информацию о их сытости
        for (Cat any : cats){
            any.eat(bowl1,30);
            System.out.println(any.catFull());
        }

        //Задание про фигуры
        //треугольник
        Triangle tr1 = new Triangle(3,4,5,"Red","Green");
        tr1.printInfo();
        //прямоугольник
        Rectangle r1= new Rectangle(7,5);
        r1.setBorderColor("Yellow");
        r1.setFillColor("White");
        r1.printInfo();
        //круг
        Circle c1 = new Circle(5,"Purple","Black");
        c1.printInfo();


        }
}