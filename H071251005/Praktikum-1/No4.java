import java.util.Scanner;

public class No4 {
 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input : ");
        int n = input.nextInt();

        int hasil = faktorial(n);

        System.out.println("Output : " + hasil);

        input.close();
    }
     static int faktorial(int n) {

        if (n == 1) {
            return 1;
        }

        return n * faktorial(n - 1);
    }
}
   
