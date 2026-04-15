import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Masukkan judul film: ");
        String text = a.nextLine();
        text = text.toLowerCase();
        

        String[] judul = text.split(" ");
        String judulBaru = "";

        for (int i = 0; i < judul.length; i ++){
            String kata = judul[i];
            judulBaru += (Character.toUpperCase(kata.charAt(0)) + kata.substring(1) + " ");
        }
        System.out.println(judulBaru);
        a.close();
    }
}
