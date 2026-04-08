import java.util.Random;
public class PelindungKesehatan {
    String vitamin;
    String mineral;

    public PelindungKesehatan(){
        
    }

    
    public PelindungKesehatan(String vitamin, String mineral) {
        this.vitamin = vitamin;
        this.mineral = mineral;
    }

    public int tambahEnergi(int max) {
        Random rand = new Random();
        return rand.nextInt(max);
    }
}
