public class tree {

    public static void main(String[] args) {
       int n = 4;
        int m = 6;


        for (int i=1; i<=m;i++){
            for (int j=1; j<=(m-i);j++) {
                System.out.print(" ");
          n =j;
            }    //int n = j;
                for (int k=1; k<=(2*i-1);k++)
                    System.out.print("*");


            System.out.println(" ");
        }
    }

}


/*

123*
12***
1*****
*******



 */



