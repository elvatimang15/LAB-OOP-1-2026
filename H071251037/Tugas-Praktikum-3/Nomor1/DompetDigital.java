package Nomor1;

public class DompetDigital {
    private String password; // atribut private(1)
    private String noHp; // atribut private(2)
    private int saldo; // atribut private(3)
    protected String userID; // atribut protected
    String name; // atribut default

    public DompetDigital(String password, String noHp, String userID, String name){
        this.password = password;
        this.noHp = noHp;
        this.userID = userID;
        this.saldo = 0;
        this.name = name;
    }

    // Metode Getter
    public String getUserID(){
        return userID;
    }
    public String getNomorHp(){
        return noHp;
    }
    public int getSaldo(){
        return saldo;
    }
    public String getName(){
        return name;
    }

    // Metode Setter
    public void setPassword(String OldPass, String newPass) {
        if (cekPassword(OldPass)){
            if (newPass.length() == 6){
                this.password = newPass;
                System.out.println("Password Anda berhasil diubah!");
            } else{
                System.out.println("Password baru harus memiliki panjang tepat 6 karakter.");
            }
        } else{
            System.out.println("Pastikan Anda memasukkan password lama yang benar!");
        }
    }
    public void setNoHp(String inputPassword, String noHp){
        if (cekPassword(inputPassword)){
            if (noHp.length() >= 10){
                this.noHp = noHp;
                System.out.println("Nomor HP Anda berhasil diubah!");
            } else {
                System.out.println("ERROR: Nomor HP tidak valid.");
            }
        } else {
            System.out.println("Password yang Anda masukkan salah!");
        }
    }

    // Metode Transaksi
    public int setorTunai(int tunai){
        if (tunai > 0){
            saldo += tunai;
            System.out.println("Berhasil menyetor "+tunai+" ke dalam saldo E-Wallet Anda!");
            System.out.printf("⤷ Total saldo terbaru: Rp%,d", saldo);
            System.out.println("");
        } else {
            System.out.println("ERROR: Tidak menerima angka minus/negatif.");
        }
        return saldo;
    }
    public void tarikTunai(String inputPassword, int tunai){
        if (cekPassword(inputPassword)){
            if (saldo >= tunai){
                saldo -= tunai;
                System.out.println("Berhasil menarik "+tunai+" dari saldo E-Wallet Anda!");
                System.out.printf("⤷ Total saldo terbaru: Rp%,d", saldo);
                System.out.println("");
            } else{
                System.out.println("Sistem gagal! Saldo tidak mencukupi.");
            }
        } else{
            System.out.println("Password yang Anda masukkan salah!");
        }
    }

    // Method Internal
    private boolean cekPassword(String input){
        return this.password.equals(input);
    }
}
