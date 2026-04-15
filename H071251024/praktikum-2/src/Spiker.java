public class Spiker {
  public String nama;
  public int stamina = 100;
  public Sepatu sepatu = new Sepatu();


  public Spiker(String nama) {
    this.nama = nama;
  }

  public Spiker(String nama, int stamina, Sepatu sepatu) {
    this.nama = nama;
    this.stamina = stamina;
    this.sepatu = sepatu;
  }

  public Spiker(String nama, Sepatu sepatu) {
    this.nama = nama;
    this.sepatu = sepatu;
  }

  public void gantiSepatu(Sepatu sepatuBaru) {
    this.sepatu = sepatuBaru;
    System.out.println(this.nama + " sekarang menggunakan sepatu " + sepatu.merek);
  }

  public void smashTebas(Spiker lawan) {
    System.out.println(this.nama + " melakukan Cross Spike tajam ke arah " + lawan.nama + "!");

    int damage = 10 + (this.sepatu.bonusLompatan / 2);
    lawan.stamina -= damage;

    System.out.println("Stamina " + lawan.nama + " berkurang sebesar " + damage);
    System.out.println("Sisa stamina " + lawan.nama + ": " + lawan.stamina);
    System.out.println("-------------------------------------------------");
  }

  public void GetInfoPlayer() {
    String tabel = " Sepatu: " + this.sepatu.merek + " (Bonus Lompatan: " + this.sepatu.bonusLompatan + ") ";
    String tabelnama = " Nama: " + this.nama;
    String tabelstamina = " Stamina: " + this.stamina;
    System.out.println("╔"+"═".repeat(tabel.length())+"╗");
    System.out.println("║"+ tabelnama + " ".repeat(tabel.length()-tabelnama.length()) +"║");
    System.out.println("║"+ tabelstamina + " ".repeat(tabel.length()-tabelstamina.length()) +"║");
    System.out.println("╠"+"═".repeat(tabel.length())+"╣");
    System.out.println("║"+tabel+"║");
    System.out.println("╚"+"═".repeat(tabel.length())+"╝");
  }
}