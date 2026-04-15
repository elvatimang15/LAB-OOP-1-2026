public class Main {
    public static void main(String[] args) {

        DompetDigital dompet = new DompetDigital("ID001", "123456");

        System.out.println("ID Nasabah: " + dompet.getIdNasabah() + "\n");

        dompet.setPin("000000", "654321");

        dompet.setPin("123456", "654321");

        dompet.setor(50000, "654321");

        dompet.setor(-10000, "654321");

        dompet.tarik(20000, "123456");

        dompet.tarik(20000, "654321");

        System.out.println("Saldo akhir: " + dompet.getSaldo());
    }
}