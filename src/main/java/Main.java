import homework6.Employee;
import homework6.Park;

public class Main {
    public static void main(String[] args){
        Employee person1 = new Employee("Иванов Иван Иванович","Администратор","Ivanov@mail.ru","+79543546725",25000,26);
        person1.info();

        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Сергеев Сергей Сергеевич", "Инженер", "Sergeev@mail.ru", "+79542365142", 50000,41);
        persArray[1] = new Employee("Алексеев Алексей Алексеевич","Технический директор", "Alekseev@mail.ru","+7911568595",73000,45);
        persArray[2] = new Employee("Иванов Иван Иванович","Администратор","Ivanov@mail.ru","+79543546725",25000,26);
        persArray[3] = new Employee("Семенов Семен Семенович", "Электрик", "Smirnov@mail.ru", "+79854568459", 43000, 32);
        persArray[4] = new Employee("Антонов Антон Антонович", "Бухгалтер", "Antonov@mail.ru", "+7965845965", 32000, 27);

        Park.Attraction attraction1 = new Park().new Attraction("Колесо обозрения", "с 9 до 18 ", 150);

    }
}
