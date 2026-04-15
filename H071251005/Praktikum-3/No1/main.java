public class main {
    public static void main(String[] args) {
         DompetDigital dompet = new DompetDigital("USER123", "123456");
         System.out.println("=== DATA AKUN ===");
         System.out.println("ID Nasabah: " + dompet.getIdNasabah());


         System.out.println("\n=== UBAH PIN ===");
         dompet.ubahPin("000000", "654321");
         dompet.ubahPin("123456", "654321");

         System.out.println("\n=== SETOR ===");
         dompet.setor(500000);
         dompet.setor(-100000);

         System.out.println("\n=== TARIK ===");
         dompet.tarik(100000, "123456");
         dompet.tarik(100000, "654321");
         
         System.out.println("\n=== SALDO AKHIR ===");
          System.out.println("Saldo akhir: " + dompet.getSaldo());

    }
}
