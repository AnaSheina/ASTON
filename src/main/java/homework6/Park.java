package homework6;

/*
Задание 3
Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах,
времени их работы и стоимости
 */
public class Park {
    String name;
    public class Attraction{
        private String name;
        private String timetable;
        private int price;

        public Attraction(String name, String timetable, int price){
            this.name=name;
            this.timetable=timetable;
            this.price=price;
        }

        public String getName(){
            return name;
        }
        public String getTimetable(){
            return timetable;
        }
        public int getPrice(){
            return price;
        }
    }
}