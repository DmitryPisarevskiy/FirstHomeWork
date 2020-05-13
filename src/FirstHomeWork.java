public class FirstHomeWork {
    public static final String ANSI_RESET="\u001B[0m";
    public static final String ANSI_GREEN="\u001B[32m";

    //        1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
    public static void main(String[] args) {
        System.out.println(ANSI_GREEN+"1. Создать пустой проект в IntelliJ IDEA и прописать метод main() \n"+ANSI_RESET+"Выполнено\n");

        //        2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
        System.out.println(ANSI_GREEN+"2. Создать переменные всех пройденных типов данных, и инициализировать их значения;"+ANSI_RESET);
        varInitialization();

        //        3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
        System.out.println(ANSI_GREEN+"3. Написать метод вычисляющий выражение a * (b + (c / d));"+ANSI_RESET);
        System.out.println("a=1, b=2, c=0.5, d=4\nРезультат = "+formula(1,2,0.5,4)+"\n");

        //        4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
        System.out.println(ANSI_GREEN+"4. Написать метод, проверяющий что сумма чисел лежит в пределах от 10 до 20(включительно);"+ANSI_RESET);
        System.out.println("a=10, b=10\nРезультат = "+isSumInInterval(10,10)+"\n");

        //        5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
        System.out.println(ANSI_GREEN+"5. Написать метод, напечатающий в консоль положительное ли число передали, или отрицательное"+ANSI_RESET);
        System.out.println("a=0");
        isPositiveOrNegative(0);

        //        6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
        System.out.println(ANSI_GREEN+"6. Написать метод, который должен вернуть true, если число отрицательное;"+ANSI_RESET);
        System.out.println("a=-1\nРезультат = "+isNegative(-1)+"\n");

        //        7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
        System.out.println(ANSI_GREEN+"7. Написать метод, которому передается имя, метод выводит в консоль «Привет, имя!»;"+ANSI_RESET);
        System.out.println("Андрей");
        helloName("Aндрей");


        //        8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
        System.out.println(ANSI_GREEN+"8. * Написать метод, который определяет является ли год високосным"+ANSI_RESET);
        System.out.println("2020 год");
        isYearVisokos((short)(2020));

    }
    public static void varInitialization(){
        byte bt;
        bt=(byte)(127+2);
        System.out.println("bt = "+bt+" - byte");
        short shrt=32000;
        shrt+=2;
        System.out.println("shrt = "+shrt+" - short");
        int nt=10045600;
        System.out.println("nt = "+nt+" - integer");
        long lng;
        lng= 10045604567950L;
        System.out.println("lng = "+lng+" - long");
        float flt=3.14f;
        System.out.println("flt = "+flt+" - float");
        double dbl=1.22645987654113156467;
        System.out.println("dbl = "+dbl+" - double");
        char chr;
        chr=65;
        System.out.println("chr = "+chr+" - char");
        boolean bln=true;
        System.out.println("bln = "+bln+" - boolean\n");
    }

    public static double formula(double a, double b, double c, double d){
        return a * (b + (c / d));
    }

    public static boolean isSumInInterval(double a, double b){
        return a+b<=20 && a+b>=10;
    }

    public static void isPositiveOrNegative(int a){
        if (a >= 0){
            System.out.println("Число положительное\n");
        } else {
           System.out.println("Число отрицательное\n");
        }
    }

    public static boolean isNegative(int a){
        return a<0;
    }

    public static void helloName(String strng){
        System.out.println("Привет, "+strng+"!\n");
    }

    public static void isYearVisokos(short a){
        if (a % 4 ==0 && (a % 100 != 0 || a % 400 ==0)) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год невисокосный");
        }
    }
}
