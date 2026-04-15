package Nomor1;

public class Main {
    public static void main(String[] args) {
        DompetDigital user = new DompetDigital("PinR4has1a", "0812345678", "user123", "Mufidah");

        System.out.println("\n=== INFORMASI IDENTITAS AKUN ===");
        System.out.println("» User ID : " + user.getUserID());
        System.out.println("» Nama    : " + user.getName());
        System.out.println("» No HP   : " + user.getNomorHp());
        System.out.println("» Saldo   : " + user.getSaldo());

        System.out.println("\n=== UBAH PASSWORD ===");
        // Password lama salah
        pembatas();
        user.setPassword("PinRAhas1a", "In1Pin");
        // Password lama benar
        pembatas();
        user.setPassword("PinR4has1a", "In1Pin");

        System.out.println("\n=== SETOR TUNAI ===");
        // Setor tunai (nominal valid)
        pembatas();
        user.setorTunai(500000);
        // Setor tunai (nominal negatif)
        pembatas();
        user.setorTunai(-50000);

        System.out.println("\n=== TARIK TUNAI ===");
        // Tarik tunai (password lama/salah)
        pembatas();
        user.tarikTunai("PinR4has1a", 100000);
        // Tarik tunai (password baru/benar)
        pembatas();
        user.tarikTunai("In1Pin", 100000);
        // Tarik tunai (saldo tidak mencukupi)
        pembatas();
        user.tarikTunai("In1Pin", 1000000);

        System.out.println("\n=== SALDO E-WALLET ===");
        System.out.printf("𝜗ৎ Saldo : Rp%,d", user.getSaldo());
        System.out.print(" ⋆.𐙚 ̊");
    }

    public static void pembatas() {
        System.out.print("» ");
    }
}