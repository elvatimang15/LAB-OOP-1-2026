import java.util.Scanner;

public class no5 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int [][] data = {
            {2, 2, 2},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        try {
            System.out.print("Input:");
            int cari = input.nextInt();

            boolean ditemukan = false;

            for (int i= 0; i< data.length; i++){
                for (int j= 0; j< data[i].length; j++) {

                    if (data[i][j] == cari){
                        System.out.println("Found "+ cari + " at ["+ i + "]["+ j + "]");
                        ditemukan = true;
                
                    }
                }
                if (ditemukan){
                    break;
                }
            }
            if (!ditemukan){
                System.out.println("Angka tidak ditemukan");
            }
        }catch (Exception e){
            System.out.println("Input harus angka !!");
        }
        input.close();
    }
}

