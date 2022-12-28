import java.util.Scanner;

//import static com.sun.org.apache.xerces.internal.util.XMLChar.trim;
//import static com.sun.tools.javac.util.StringUtils.toUpperCase;

public class lesson10Varrars {

    public static void main(String[] args) {
        //System.out.println(summ(1,2,3,4,5,6,7));
        String[] names = {"Name 1","Name 2","Name 3"};
        name(names);

        Scanner sc = new Scanner(System.in);
        System.out.println("Дайте тринг!");
        String s =  sc.nextLine();
        SozBol(s);
    }



    static void SozBol(String s){
        System.out.println(s.toUpperCase());
        System.out.println(s.trim());
        System.out.println();

        System.out.println(s.contains("A"));
        for (int i = 0; i < s.length(); i++) {
            if (s.contains("A")==false){
                System.out.println(s.substring(i));
            } else {
                System.out.println("Жок");
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
