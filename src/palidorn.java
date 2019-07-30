import java.util.Scanner;

public class palidorn {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = "rotatora";//scanner.nextLine();
        String word2="";

        for (int i =(word.length());i>=1;i--) {
            word2 = word2 + word.charAt(i-1);
            System.out.println(word2);
        }

        //if (Character.isDigit(word.charAt(i)))
                System.out.println(word.equals(word2));

        StringBuilder word3 = new StringBuilder(word2);
        System.out.println(word3.reverse());


    }
}
