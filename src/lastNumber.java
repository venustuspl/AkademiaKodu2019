import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class lastNumber {
    public static void main(String[] args) {
        System.out.println("Podaj dowolną liczbę całkowitą:");
        Scanner scanner = new Scanner(System.in);
        int numberOne = 2;// scanner.nextInt();
        int numberOne1 = 3;
        float wynik = (float) numberOne / numberOne1;
        System.out.println("Suma liczb to:" + wynik);


        BigInteger bigNumber = new BigInteger("123145678142");
        System.out.println(bigNumber);


        Random randomNumber = new Random();
        int a = randomNumber.nextInt(9);
        int b = randomNumber.nextInt(50);
        int c = randomNumber.nextInt(100);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        c = b;
        b = a;
        a = c;
        System.out.println("----");
        System.out.println(a);
        System.out.println(b);
        System.out.println("----");
        a = a + b;
        b = (a - b);
        a = (a- b);
        System.out.println("----");
        System.out.println(a);
        System.out.println(b);
        System.out.println("----");
        double wynik2 = (a + b) / 2;
        System.out.printf("%.2f", wynik2);


    }

}


