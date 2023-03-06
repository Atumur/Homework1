public class HomeWorkApp {

        public static void main(String[] args) {
            System.out.println("1:");
            printTW();

            System.out.println("2:");
            System.out.println("Первое - 1, второе - 99");
            checkSumSign(1, 99);
            System.out.println("Первое - 10, второе - -10");
            checkSumSign(10, -10);

            System.out.println("3:");
            System.out.println("Число 1");
            printColor(1);
            System.out.println("Число: 0");
            printColor(0);
            System.out.println("Число: -99");
            printColor(-99);
            System.out.println("Число: 100");
            printColor(100);
            System.out.println("Число: 105");
            printColor(105);

            System.out.println("4:"); // Сравнение двух значений
            System.out.println("Первое - 1, второе - 99");
            compareNumbs(1, 99);
            System.out.println("Первое - 8, второе - 2");
            compareNumbs(8, 2);
            System.out.println("Первое - 1, второе - 1");
            compareNumbs(1, 1);
        }

        // 1
        public static void printTW(){
            String w1 = "Orange \n"+
                    "Banana \n"+
                    "Apple";
            System.out.println(w1);
        }

        // 2
        public static void checkSumSign(int a, int b){
            if(a+b>=0)
                System.out.println("Сумма положительная");
            else
                System.out.println("Сумма отрицательная");
        }

        // 3
        public static void printColor(int lightInt){
            if(lightInt<=0)
                System.out.println("Красный"); else
            if(lightInt<=100)
                System.out.println("Желтый"); else
                System.out.println("Зеленый");
        }

        // 4
        public static void compareNumbs(int a, int b){
            if(a>=b)
                System.out.println("a>=b"); else
            if(a<=b)
                System.out.println("a<=b");
        }
    }
