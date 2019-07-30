import java.util.Scanner;

public class Stringi {

    public static void main(String[] args) {
        String word = "Hej";
        String word2 = "Tomek";
String word3 = word+word2;
        System.out.println(word + " " + word2);

        System.out.println(word.substring(0,2));
        System.out.println(word3);
        System.out.println(word3.length());
        System.out.println(word3.charAt(3));
        System.out.println(word.equals(word3));
    StringBuilder word4 = new StringBuilder("Hejo");
    word4.append(word2);
        System.out.println(word4);
        System.out.println(word4.delete(0,2));
        System.out.println(word4);


        Scanner scanner = new Scanner(System.in);

        //String name = scanner.nextLine();
String name = "Tomek";
        // String surname = scanner.next();

        //System.out.println(name +" "+ surname);
        System.out.println("\"Mowa jest srebrem\n" +
                " a milczenie złotem.\"");
int dlugosc = name.length();
        System.out.println("Długość: "+name.length()+" "+ name);
        System.out.println(name.substring(dlugosc-2,dlugosc-1));
        System.out.println(name.charAt(dlugosc-1));

    StringBuilder text = new StringBuilder("Tekstowo");
        System.out.println(name.contains("om"));
        System.out.println(name.toLowerCase());
        System.out.println(name.replace('o','a'));
        String word5 ="meo";
        System.out.println(word5.equals(name.substring(dlugosc-3,dlugosc)))    ;

        System.out.println(word5.endsWith("meo"))    ;

    }
}
