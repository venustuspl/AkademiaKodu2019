import java.util.Scanner;

public class Pierwsza {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = 6;//scanner.nextLine();
        boolean zlozona = false;
        if (number < 2)
            System.out.println("Jest to liczba pierwsza.");
        else {
            for (int i = 2; i < number; i++)
                if (number % i == 0) {
                    System.out.println("Jest to liczba złożona");
                    zlozona = true;
                }

        }

        if (zlozona == false)
            System.out.println("Nie jest to liczba złożona");


    }
}