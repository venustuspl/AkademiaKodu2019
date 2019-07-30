public class fAdd {

    public static void main(String[] args) {


        int a = 1234567;
        int d = 5;
String pierwszy ="aa";
String drugi    ="bb";
        System.out.println(sumStr(pierwszy,drugi));
        sumInt(a);
        //System.out.println(czyParzysta(a));
        /*System.out.println(add(5,9));
        System.out.println(substract(5, 7.999));
        System.out.println(multiply(5, 7.999));
        System.out.println(divide(0, 7));
*/
    }

static int max;
    static String sumStr(String a, String b){
        return a+b;
    }

    static void sumInt(int a) {
        int result = 0;
        while (a % 10 != 0) {
            result += a % 10;
            a = a / 10;


        }
        System.out.println(result);
    }


    static double add(double a, double b) {
        return a + b;
    }

    static double substract(double a, double b) {
        return a - b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Dzielnik nie może być zerem.");
            return 0;
        }
    }

    static boolean czyParzysta(int a) {
        if (a % 2 == 0)
            return true;
        else
            return false;
    }
}

