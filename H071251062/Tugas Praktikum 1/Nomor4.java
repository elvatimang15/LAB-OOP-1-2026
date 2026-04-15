import java.util.Scanner;

public class Nomor4 {
    public static void main(String[] args) {
    Scanner a = new Scanner(System.in);
    System.out.print("Masukkan angka: ");
    int bilangan = a.nextInt();

    if (bilangan < 0)
      System.out.println("Bilangan negatif tidak berlaku untuk faktorial.");
    else{
      int faktorial = 1;
      for (int i= 1; i <= bilangan; i++){
          faktorial *=i;
      }
    System.out.println(faktorial);
    }
    a.close();
  }
}
