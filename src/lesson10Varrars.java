import java.util.Scanner;

//import static com.sun.org.apache.xerces.internal.util.XMLChar.trim;
//import static com.sun.tools.javac.util.StringUtils.toUpperCase;

public class lesson10Varrars {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Напишите код, который будет\n" +
                "запрашивать слово из консоли.\n" +
                "Создайте метод и передайте слово\n" +
                "которое получите из консоли в параметр метода\n" +
                "Метод должен превратить все буквы в\n" +
                "слове на заглавные и убрать все лишние\n" +
                "пробелы в слове.\n" +
                "Если в слове содержится буква «А» то\n" +
                "метод должен обрезать слово до букв «А»\n" +
                "и вернуть его.\n" +
                "Если слово не содержит букву «А» то\n" +
                "должен вернуть сообщение что слово «Не\n" +
                "содержит».\n"+
                "запрашивать слово из консоли.");
        System.out.print("Дайте cтринг!: ");
        String s = sc.nextLine();
        SozBol(s);
    }



    static void SozBol(String s){
        System.out.println("Первая задача успешно!");
        System.out.println(s.toUpperCase());
        System.out.println("Втарая задача успешно!");
        System.out.println(s.trim());
        System.out.println("Третая задача успешно!");
        char[] c =s.toCharArray();
        int index = 0;
        for (int i = 0; i< c.length; i++) {
            index++;
            if (s.contains("А") || s.contains("A")) {
                if (c[i] == 'А'|| c[i] == 'A') {
                    System.out.println(s.substring(index));
                }
            } else  {

                System.out.println("Четвертая задача успешно!");
                System.out.println("Жок!");
            }

            }

        }

    static void name(String...name){
        for (String a: name
             ) {
            System.out.println(a+" мен сени жакшы кором!");
            
        }
    }
    

    static int summ(int...a){
        int summa = 0;
        for (int i = 0; i < a.length; i++) {
            summa += a[i];
        }
        return summa;
    }
}
