package TugasPraktikum3;
import java.util.Scanner;

public class DompetDigital {
    private double pin;
    private double saldo = 0;
    protected String pengguna;
    String ID;

    public DompetDigital(String pengguna, double pin, String id) {
        this.pengguna = pengguna;
        this.pin = pin;
        this.ID = id;
    }

    public void InformasiPengguna(){
        int tabel = 30;
        if (tabel < pengguna.length() || tabel < ID.length()) {
            if (pengguna.length() < ID.length()) {
                tabel = ID.length();
            } else {
                tabel = pengguna.length();
            }
        }
        System.out.println("╔═════════════════" + "═".repeat(tabel+3)                                  + "╗");
        System.out.println("║ NAMA PENGGUNA : " + pengguna + " ".repeat(tabel+3-pengguna.length())     + "║");
        System.out.println("║ ID   PENGGUNA : " + ID + " ".repeat(tabel+3-ID.length())                 + "║");
        System.out.println("╚═════════════════" + "═".repeat(tabel+3)                                  + "╝");
    }

    public void SetPin(int pinBaru) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n╔═════════════════════════╗");
        System.out.println(  "║    Mengubah Ubah PIN    ║");
        System.out.println(  "╚═════════════════════════╝");
        System.out.print("Masukkan PIN lama: ");
        int pinLama = scanner.nextInt();
        Boolean validasi = true;
        if (pinLama != this.pin) {
            System.out.println("❌ PIN lama salah!");
            validasi = false;
        }
        String pinStr = String.valueOf(pinBaru);
        if ( pinStr.length() != 6) {
            System.out.println("❌ PIN baru harus 6 karakter!");
            validasi = false;
        }
        if (validasi) {
            this.pin = pinBaru;
            System.out.println("✅ PIN berhasil diubah.");
        }

    }

    public void SetorTunai(double jumlah) {
        Scanner rizz = new Scanner(System.in);
        System.out.println("\n╔═════════════════════════╗");
        System.out.println(  "║     Menyetor Saldo      ║");
        System.out.println(  "╚═════════════════════════╝");
        System.out.print("Masukkan PIN untuk menyetor saldo: ");
        int pinInput = rizz.nextInt();
        boolean validasi = true;
        if (jumlah <= 0) {
            System.out.println("❌ Jumlah setoran harus lebih besar dari 0.");
            validasi = false;
        }

        if (pinInput != this.pin) {
            System.out.println("❌ PIN salah! Tidak dapat melakukan penyetoran.");
            validasi = false;
        }
        if (!validasi) {
            logTransaksi("SETOR TUNAI", jumlah, false);
        }

        if (validasi) {
            saldo += jumlah;
            System.out.println("Setor Tunai Berhasil. Saldo Saat Ini: " + saldo);
            logTransaksi("SETOR TUNAI", jumlah, true);
        }
    }

    public void TarikTunai(double jumlah) {
        Scanner rizz = new Scanner(System.in);
        System.out.println("\n╔═════════════════════════╗");
        System.out.println(  "║      Menarik Saldo      ║");
        System.out.println(  "╚═════════════════════════╝");
        System.out.print("Masukkan PIN untuk menarik saldo: ");
        int pinInput = rizz.nextInt();
        boolean validasi = true;
        if (jumlah > saldo) {
            System.out.println("❌ Saldo tidak cukup untuk melakukan penarikan.");
            validasi = false;
        } else if (jumlah <= 0) {
            System.out.println("❌ Jumlah tarik tunai harus lebih besar dari 0.");
            validasi = false;
        }

        if (pinInput != this.pin) {
            System.out.println("❌ PIN salah! Tidak dapat melakukan penarikan.");
            validasi = false;
        }

        if (!validasi) {
            logTransaksi("TARIK TUNAI", jumlah, false);
        }

        if (validasi) {
            saldo -= jumlah;
            System.out.println("Tarik tunai berhasil. Saldo saat ini: " + saldo);
            logTransaksi("TARIK TUNAI", jumlah, true);
        }
    }

    public void TampilkanSaldo() {
        Scanner rizz = new Scanner(System.in);
        System.out.println("\n╔═════════════════════════╗");
        System.out.println(  "║    Menampilkan Saldo    ║");
        System.out.println(  "╚═════════════════════════╝");
        System.out.print("Masukkan PIN untuk melihat saldo: ");
        int pinInput = rizz.nextInt();
        if (pinInput == this.pin) {
            System.out.println("Saldo saat ini: Rp " + saldo + "0-");
        } else {
            System.out.println("❌ PIN salah! Tidak dapat menampilkan saldo.");
        }
    }

    private void logTransaksi(String jenis, double jumlah, boolean status) {
        String hasil = status ? "BERHASIL" : "GAGAL";
        System.out.println("[LOG] " + jenis + " " + jumlah + " : " + hasil);
    }
}