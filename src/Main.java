public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        // Вывести сообщение наступило ли совершеннолетие или нет
        int age = 19;
        int age2 = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
    }
        if (age2 < 18) {
            System.out.println("Если возраст человека равен " + age2 + ", то он не достиг совершеннолетия, нужно немного подождать");
        } else {
            System.out.println("Если возраст человека равен " + age2 + ", то он совершеннолетний");
        }
    }
        public static void task2 () {
        System.out.println("Задача 2");
        // Нужно ли надевать шапку
        int temp = 3;
        int temp2 = 7;
        if (temp < 5){
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }
        if (temp2 > 5){
            System.out.println("На улице " + temp2 + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + temp2 + " градусов, нужно надеть шапку");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        // Превышение скорости
        int speed = 50;
        int speed2 = 70;
        if (speed < 60){
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
        }
        if (speed2 > 60){
            System.out.println("Если скорость " + speed2 + " км/ч, то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed2 + " км/ч, то можно ездить спокойно");
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");
        // В какое учреждение необходимо отправить человека
        int age = 27;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский");
        }
        else if (age >= 7 && age <= 18)
        { System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        else if (age > 18 && age < 24)
        { System.out.println("Если возраст человека равен " + age + ", то его место в университете");
        }
        else if (age > 24)
        { System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        // Ограничение по возрасту на отракционах
        int age = 17;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то он не может кататься на аттракционе");
        }
        else if (age > 5 && age < 14)
        { System.out.println("Если возраст ребенка равен " + age + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        }
        else if (age > 14)
        { System.out.println("Если возраст ребенка равен " + age + ", то он может кататься без сопровождения взрослого");
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        // Кол-во свободных мест в вагоне
        int age = 99; // Кол-во на входе
        int totalPerson = 102; // Всего мест в вагоне
        int seat = 60; // Всего сидячих мест в вагоне
        int standPlace = totalPerson - seat; // Всего стоячих мест
        int freeSeat = seat - age; // Всего  свободных сидячих мест


        if (age <= 60) {
            System.out.println("Количество сидячих мест в вагоне " + freeSeat + " и " + standPlace + " стоячих мест");
        }
        else if (age > 60 && age < 102)
        { System.out.println("Количество сидячих мест в вагоне 0 и " + (freeSeat + standPlace) + " стоячих мест");
        }
        else if (age >= 102)
        { System.out.println("Свободных мест в вагоне нет, вагон полностью забит");
        }
    }
        public static void task7 () {
            System.out.println("Задача 7");
            // Какое из 3-х чисел большее
            int one = 1;
            int two = 2;
            int three = 3;
            if (one > two && one > three) {
                System.out.println("Число " + one + " больше чем " + two + " и " + three );
            }
            else if (two > one && two > three) {
                System.out.println("Число " + two + " больше чем " + one + " и " + three );
            }
            else if (three > one && three > two) {
                System.out.println("Число " + three + " больше чем " + one + " и " + two );
            }
        }

    }