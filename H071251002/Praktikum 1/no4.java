 import java.util.Scanner;

public class no4 {

    // fungsi rekursi
    public static int faktorial(int n) {
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * faktorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input : ");
        int n = input.nextInt(); 

        int hasil = faktorial(n);

        System.out.println("Output : " + hasil);

        input.close();
    }
}

