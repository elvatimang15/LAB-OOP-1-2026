public class Mobil {
    // atribut
    String nama;
    int kecepatan;

    // constructor
    public Mobil(String nama){
        this.nama = nama;
        this.kecepatan = 0;
    }

    // method accelerate
    public int accelerate(int nilai){
        kecepatan += nilai;
        System.out.println("Mobil "+nama+" berakselerasi. Kecepatan sekarang "+kecepatan+" km/jam");
        return kecepatan;
    }

    // method brake
    public void brake(int nilai){
        kecepatan -= nilai;
        System.out.println("Mobil "+nama+" mengerem. Kecepatan sekarang "+kecepatan+" km/jam");
        if (kecepatan < 0){
            kecepatan = 0;
        }
    }

    // method Getter
    public int getKecepatan(){
        return kecepatan;
    }
}
