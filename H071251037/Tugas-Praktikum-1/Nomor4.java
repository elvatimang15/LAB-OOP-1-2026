import java.util.Scanner;

public class Nomor4 {

    public static int rekursi(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * rekursi(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();

        if (n < 0) {
            System.out.println("ERROR: Tidak bisa menghitung faktorial bilangan negatif");
        } else {
            System.out.println("Faktorial dari " + n + " adalah: " + rekursi(n));
        }

        input.close();
    }
}