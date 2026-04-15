public class Mobil {
    String nama;
    int kecepatan = 0;


    Mobil(String nama){
        this.nama = nama;
    }
    public void accelerate(int accelerate){
        this.kecepatan += accelerate;
        System.out.println( nama + " berakselerasi. kecepatan sekarang: " + kecepatan + " km/jam");
    }
    public void brake(int brake){
       kecepatan -= brake;
       if (kecepatan < 0) {
            kecepatan = 0;
       }
        System.out.println(nama + " mengerem. kecepatan sekarang: " + kecepatan + " km/jam");
    }
    public int getKecepatan(){
        return kecepatan;
    }
   
    
    


}
