public class Mobil {
    String nama;
    int kecepatan;

    public Mobil(String nama){
        this.nama = nama;
        this.kecepatan = 0;
    }

    public void accelerate(int Tambahkecepatan){
            kecepatan += Tambahkecepatan;
            System.out.println(nama + " berakselerasi. Kecepatan sekarang : " + kecepatan + "km/jam" );
    
    }

    public void brake(int brake){
        kecepatan -= brake;
            if(kecepatan < 0){
                kecepatan = 0;
            }
            System.out.println(nama + " mengerem. Kecepatan sekarang : " + kecepatan + "km/jam");
        
    }

    public int getKecepatan(){
        return kecepatan;
    }
    

}


