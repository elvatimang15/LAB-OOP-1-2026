public class Main {
    public static void main(String[] args) {

        Card skip = new Card("Red", "Skip", "Skip");
        Card draw2 = new Card("Blue", "Draw Two", "Draw Two");
        Card wild4 = new Card("Wild", "Wild Draw Four", "Wild Draw Four");

        UnoPlayer player1 = new UnoPlayer("Fauzi", 7, 0, skip);
        UnoPlayer player2 = new UnoPlayer("Bella", 7, 0, draw2);

        System.out.println("\n====== PERMAINAN UNO DIMULAI! ======");

        while (player1.getScore() < 100 && player2.getScore() < 100) {

            player1.playCard(player2);
            if (player1.getScore() >= 100) break;

            player2.playCard(player1);
            if (player2.getScore() >= 100) break;

            
            player1.setCard(wild4);
            player2.setCard(draw2);
        }

      
    }
}


// public class Main {
//     public static void main(String[] args) {

//         Card card1 = new Card("Red", "Skip", "Skip");
//         Card card2 = new Card("Blue", "Draw Two", "Draw Two");
//         Card card3 = new Card("Wild", "Wild Draw Four", "Wild Draw Four");
//         // Card card4 = new Card("Green", "Blue", "Wild");

//         UnoPlayer player1 = new UnoPlayer("Fauzi", 7, 0, card1);
//         UnoPlayer player2 = new UnoPlayer("Bella", 7, 0, card2);

//         System.out.println("\n====== PERMAINAN UNO DIMULAI! ======");

//         while (player1.getHandCards() > 0 && player2.getHandCards() > 0){

//             player1.playCard(player2);
//             if (player1.getHandCards() == 0) break;

//             player2.playCard(player1);
//             if (player2.getHandCards() == 0) break;

//             player1.setCard(card3);
//             player2.setCard(card2);

//         }
       

       
//     }

// }
