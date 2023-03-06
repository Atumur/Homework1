package org.example;

public class Main {

    public static void main(String[] args) {
        System.out.println("1:");
        print();

        System.out.println("2:");
        System.out.println("Первое - 1, второе - 99");
        Sum(1, 99);
        System.out.println("Первое - 10, второе - -10");
        Sum(10, -10);

        System.out.println("3:");
        System.out.println("Число 1");
        trafficLight(1);
        System.out.println("Число: 0");
        trafficLight(0);
        System.out.println("Число: -99");
        trafficLight(-99);
        System.out.println("Число: 100");
        trafficLight(100);
        System.out.println("Число: 105");
        trafficLight(105);

        System.out.println("4:"); // Сравнение двух значений
        System.out.println("Первое - 1, второе - 99");
        comparison(1, 99);
        System.out.println("Первое - 8, второе - 2");
        comparison(8, 2);
        System.out.println("Первое - 1, второе - 1");
        comparison(1, 1);
    }

    // 1
        public static void print(){
            String w1 = "Слово \n"+
                 "Рушит \n"+
                 "Тишину";
            System.out.println(w1);
        }

    // 2
        public static void Sum(int Int1, int Int2){
            if(Int1+Int2>=0)
                System.out.println("Сумма положительная");
            else
                System.out.println("Сумма отрицательная");
        }

    // 3
        public static void trafficLight(int lightInt){
            if(lightInt<=0)
                System.out.println("Красный"); else
                if(lightInt<=100)
                    System.out.println("Желтый"); else
                    System.out.println("Зеленый");
        }

    // 4
        public static void comparison(int Int1, int Int2){
            if(Int1>Int2)
                System.out.println("Первое число больше второго"); else
                if(Int1<Int2)
                    System.out.println("Второе число больше первого"); else
                    System.out.println("Числа равны");
        }
}