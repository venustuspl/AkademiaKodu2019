import java.util.Scanner;

public class Ify {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj zmienną: ");
        int value = 9;//   scanner.nextInt();
        if (
                value % 3 == 0)
            System.out.println("Zmiena podzielna przez 3");

        String word = "Akademia";//scanner.next();
        if (word.equals("Akademia"))
            System.out.println("Wyraz to Akademia\n");
        else
            System.out.printf("Wyraz to nie Akademia");
        System.out.println(word.equals("Akademia")
                ? "Dobre hasło"
                : "Złe hasło");
        word = "Ala";//scanner.next();

        System.out.println(word.endsWith("a") && !word.equals("Kuba")
                ? "Imię żęskie"
                : "Imię męskie");

        int a = 4; //scanner.nextInt();
        int b = 5;
        System.out.printf("Max = " + (a > b ? a : b));

        word = "Maja ma";//scanner.next();

        if (word.endsWith("M"))
            System.out.println("M");
        else
            System.out.println("Nie M");
        System.out.println();
        String word2 = "Maja ma";
        //scanner.nextLine();

        if (word.equals(word2))
            System.out.println("Równe");

        String address = "http://www.wddddddddddddddp.de";
        System.out.println(address.charAt(address.length() - 3));
        char kropka = '.';


        if ((address.startsWith("www.") || address.startsWith("http://www.")) && (address.charAt(address.length() - 3) == kropka)) {
            System.out.println("Tak to jest prawidłowy adres www.");
        } else
            System.out.println("Nie to nie jest prawidłowy adres www.");

        String postCode = "12-444";
        if (postCode.length() == 6)
            if (postCode.charAt(2) == '-') {
                if ((Character.isDigit(postCode.charAt(0)) && (Character.isDigit(postCode.charAt(1))) && (Character.isDigit(postCode.charAt(3))) && (Character.isDigit(postCode.charAt(4))) && (Character.isDigit(postCode.charAt(5)))))
                    System.out.println("Tak kod podcztowy jest prawidłowy");

            } else {
                System.out.println("Na drugim mniejscu nie znajduje się myślnik");
            }
        else
            System.out.println("Cyfr w kodzie jest za mało.");
    }

}
