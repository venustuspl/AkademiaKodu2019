public class dzielniki {

    public static void main(String[] args) {
        int number = 6;
        System.out.println(dzielniks(number));
    }

   static  int dzielniks (int a){
int sum = 0;
        for (int i=1; i<=a;i++)
            if (a%i==0) {
                System.out.println(i);
            sum++;
            }
    return sum;
    }
}
