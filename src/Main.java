import java.io.Writer;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        Random rd = new Random();
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Дайте значение массиву: ");
            arr[i] = sc.nextInt();
        }
        arrayOne(arr);
        arrayTwo(arr);





/******************Сравнивает трех чисел******************************/
//
///*Создайте метод который будет принимать в
//параметр 3 цифры, метод должен отсортировать
//цифры и вывести на консоль.*/
//        int a,b,c;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Дайте значение для а: ");
//        a = sc.nextInt();
//        System.out.print("Дайте значение для b: ");
//        b= sc.nextInt();
//        System.out.print("Дайте значение для c: ");
//        c= sc.nextInt();
//        maxMin(a,b,c);
/******************Сравнивает трех чисел******************************/

/******Алгоритма сортировки пузырьком *******/
//        int [] mas = {11, 3, 14, 16, 7};
//
//        boolean isSorted = false;
//        int buf;
//        while(!isSorted) {
//            isSorted = true;
//            for (int i = 0; i < mas.length-1; i++) {
//                if(mas[i] > mas[i+1]){
//                    isSorted = false;
//                    buf = mas[i];
//                    mas[i] = mas[i+1];
//                    mas[i+1] = buf;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(mas));

/******Алгоритма сортировки пузырьком *******/

/*********************Средняя арифметическое двух цисел***********************************/
//        /*Создайте метод, который будет принимать в
//        параметр 2 цифры и должен вывести на консоль
//        среднее арифметическое значение.*/
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Этот программа должен вывести на консоль среднее арифметическое значение ");
////        System.out.print("Дайте первого цифры: ");
////        float a = sc.nextFloat();
////        System.out.print("Дайте второго цифры: ");
////        float b = sc.nextFloat();
////
////        arifOrtochosan(a, b);

/*********************Средняя арифметическое двух цисел*****конец******************************/
    }

    static void arrayOne(int [] arr){

        int max = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }

        System.out.println("\nМаксимальное циcло массива: "+max);
        System.out.println("Индекс максимального числа: " + (index));

    }
    static void arrayTwo(int [] arr){
        int min = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }

        System.out.println("\nМаксимальное циcло массива: "+min);
        System.out.println("Индекс максимального числа: " + (index));

    }

    }



/******************Сравнивает трех чисел******************************/

//    static void maxMin(int a, int b, int c){
//
//        if (a >= b && b >= c) {
//            System.out.println("******************************");
//            System.out.println(c + " " + b + " " + a);
//        }
//        else if (a >= c && c >= b) {
//            System.out.println("******************************");
//            System.out.println(b + " " + c + " " + a);
//        }
//        else if (c >= a && a >= b) {
//            System.out.println("******************************");
//            System.out.println(b + " " + a + " " + c);
//        }
//        else if (b >= a && a >= c) {
//            System.out.println("******************************");
//            System.out.println(c + " " + a + " " + b);
//        }
//        else if (c >= b && b >= a) {
//            System.out.println("******************************");
//            System.out.println(a + " " + b + " " + c);
//        }
//        else if (b >= c && c >= a) {
//            System.out.println("******************************");
//            System.out.println(a + " " + c + " " + b);
//        }
//    }

/******************Сравнивает трех чисел****Конец*****************/


//    static void arifOrtochosan(float a, float b) {
//
//        float sum = (a + b) / 2;
//        System.out.println("Среднее арифметическое значение двух чисел равно: " + sum);
//    }


/*************массив ге консольдон маани беруу*********/

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("second name");
//        int r = sc.nextInt();
//
      //  zhylduzcha(r);


//        Random rd = new Random();
//        int i = 0;

/*************не четный цифрыларды консольго чыгаруу*********/
//        Scanner sc = new Scanner(System.in);
//        System.out.println("С какого цисло начать? ");
//        int namber1 = sc.nextInt();
//
//        System.out.println("С какого цисло начать? ");
//        int namber2 = sc.nextInt();
//        System.out.println("Из Них не четные цисло: ");
//        while (namber1++ < namber2) {
//            if (namber1 % 2 != 0) {
//                System.out.print(namber1+" ");
//            }
//        }

/*************массив ге консольдон маани беруу*********/
//
//    static void zhylduzcha(int array){
//        for (int i = 0; i < array; i++) {
//            System.out.print("*");
//        }
//    }
//     System.out.println("second name");
////        r[0]= sc.next();
////        System.out.println("name");
////        r[1]= sc.next();
////        System.out.println("LastName");
////        r[2]= sc.next();
////        name(r);
/*************консолго ат массив чыгаруу*********/
//    static void name(String [] array){
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i]+",");
//        }
//    }
/*************консолго массив чыгаруу****аягы*****/

/*************консолго ат чыгаруу*********/

//    static void name(String name){
//
//            System.out.println("Салам "+name);
//
//    }
//
/*************консолго ат чыгаруу аягы*********/
//
/*************Кобойтуу*********/
//    static void koboituu(){
//        int sum;
//        for (int i = 1; i <=10; i++) {
//            for (int j = 1; j <= 10; j++) {
//                sum= i*j;
//                System.out.print(i+"*"+j+"="+sum+"    \n");
//            }
//            System.out.println();
//        }
//    }
//
/**********Кобойтуу*****аягы******/



