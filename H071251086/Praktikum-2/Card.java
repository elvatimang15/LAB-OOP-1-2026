public class Card {
    public String color;
    public String value;
    public String cardType;

    public Card() {
        this.color = "Wild";
        this.value = "0";
        this.cardType = "Normal";
    }

    
    public Card(String color, String value, String cardType) {
        this.color = color;
        this.value = value;
        this.cardType = cardType;
    }

    
    public String activateEffect() {
        switch (cardType) {
            case "Skip":      
                return "Giliran lawan di-SKIP!";

            case "Reverse": 
                return "Urutan dibalik!";

            case "Draw Two":  
                return "Lawan harus ambil 2 kartu!";
            
            case "Wild" :
                return "Pilih warna yang kamu mau!";

            case "Wild Draw Four":
                return "Lawan harus ambil 4 kartu!";

            default:         
                return "Kartu normal dimainkan.";
        }
    }

    
    public int getCardPower() {
        switch (cardType) {
            case "Skip":     
                  return 20;
            case "Reverse": 
                   return 20;
            case "Draw Two":    
               return 20;
            case "Wild" :      
                return 50;
            case "Wild Draw Four":
                 return 50;
            default:            
               return Integer.parseInt(value);
        }
    }

    
    public String getColor() { 
        return color; }
    public String getValue() {
        return value; }
    public String getCardType() {
        return cardType; }
    public void setColor(String color) {
        this.color = color; }
    public void setValue(String value) {
        this.value = value; }
    public void setCardType(String cardType) {
        this.cardType = cardType; }
}
