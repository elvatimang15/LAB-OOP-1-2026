import java.util.Scanner;

public class Nomor5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] nums = {
            {2, 2, 2},
            {4, 5, 6},
            {7, 8, 9}
        };

        try {
            System.out.print("Masukkan angka yang dicari: ");
            int cari = input.nextInt();

            boolean found = false;

            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {

                    if (nums[i][j] == cari) {
                        System.out.println("Found " + cari + " at [" + i + "][" + j + "]");
                        found = true;
                        // break;
                    }
                }
            }

            if (!found) {
                System.out.println("Angka tidak ditemukan");
            }

        } catch (Exception e) {
            System.out.println("Input harus berupa angka!");
        }

        input.close();
    }
}