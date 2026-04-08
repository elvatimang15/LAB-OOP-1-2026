public class UnoPlayer {
    public String nama;
    public int handCards;
    public int score;
    public Card card; 

    public UnoPlayer() {
        this.nama = "Unknown Player";
        this.handCards = 7;
        this.score = 0;
        this.card = new Card();
    }

    public UnoPlayer(String nama, int handCards, int score, Card card) {
        this.nama = nama;
        this.handCards = handCards;
        this.score = score;
        this.card = card;
    }

    public void playCard(UnoPlayer enemy) {
    System.out.println("\n" + nama + " memainkan kartu: [" + card.getColor() + " " + card.getValue() + " - " + card.getCardType() + "]");
    System.out.println("Efek: " + card.activateEffect());

    this.handCards--;
    this.score += card.getCardPower(); 

    switch (card.getCardType()) {
        case "Draw Two":
            enemy.handCards += 2;
            break;
        case "Wild Draw Four":
            enemy.handCards += 4;
            break;
    }

    System.out.println(enemy.nama + " sekarang punya " + enemy.handCards + " kartu di tangan.");
    System.out.println(nama + " total score: " + this.score);

    
    if (this.score >= 100) {
        System.out.println("\n===== GAME SELESAI =====");
        System.out.println("Pemenang : " + this.nama);
        System.out.println("Kalah    : " + enemy.nama);
    }
}

    // public void playCard(UnoPlayer enemy) {
    //     System.out.println("\n" + nama + " memainkan kartu: [" + card.getColor() + " " + card.getValue() + " - " + card.getCardType() + "]");
    //     System.out.println("Efek: " + card.activateEffect());

    //     this.handCards--;

    //     switch (card.getCardType()) {
    //         case "Draw Two":
    //             enemy.handCards += 2;
    //             break;
    //         case "Wild Draw Four":
    //             enemy.handCards += 4;
    //             break;
    //         default:
    //             break;
    //     }
    //     System.out.println(enemy.nama + " sekarang punya " + enemy.handCards + " kartu di tangan.");

    //     if (this.handCards == 1){
    //         System.out.println(nama + " teriak : UNO!");
    //     }

    //     if (this.handCards == 0) {
    //         System.out.println("\n===== GAME SELESAI =====");
    //         System.out.println("Pemenang : " + this.nama);
    //         System.out.println("Kalah    : " + enemy.nama);
    //     }
    // }

    public void checkHand() {
        System.out.println("\n=== Status: " + nama + " ===");
        System.out.println("Kartu di tangan : " + handCards);
        System.out.println("Score           : " + score);
        System.out.println("Kartu aktif     : " + card.getColor() + " " + card.getValue() + " [" + card.getCardType() + "]");
        System.out.println("Power kartu     : " + card.getCardPower());

        if (handCards == 1) {
            System.out.println("Status          : UNO! Hampir menang!");
        } else if (handCards == 0) {
            System.out.println("Status          : MENANG!");
        } else {
            System.out.println("Status          : Masih bermain...");
        }
    }

    
    public String getNama() { 
        return nama; }
    public int getHandCards() {
        return handCards; }
    public int getScore() {
        return score; }
    public Card getCard() { 
        return card; }
    public void setNama(String nama) {
         this.nama = nama; }
    public void setHandCards(int handCards) {
         this.handCards = handCards; }
    public void setScore(int score) {
         this.score = score; }
    public void setCard(Card card) {
         this.card = card; }
}
