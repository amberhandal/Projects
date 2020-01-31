import java.util.Scanner;

public class BlackJack {
    public static <round> void main(String args[]) {
        Scanner reading = new Scanner(System.in);

        boolean startGame = true;
        int[] round = {1};
        int card;
        final int ACE = 1;
        final int JACK = 11;
        final int QUEEN = 12;
        final int KING = 13;
        int playerHand = 0;
        int dealerHand = 0;
        //Declaring variables for cards, rounds, and menus

        while (startGame)
        System.out.println("START GAME #" + round[1] + "\n");
        //When game ends the round increases by 1 upon restarting
        class P1Random {
            P1Random rng = new P1Random();
            int playerHand = rng.nextInt(10);
            private void main() {
                int menu = reading.nextInt();
                System.out.println();
                System.out.println("1. Get another card");
                System.out.println("2. Hold hand");
                System.out.println("3. Print statistics");
                System.out.println("4. Exit");
                System.out.println();

                if (menu == 1) {
                    if (playerHand == 21)
                        System.out.println("You win!");
                    else if (playerHand >= 21)
                        System.out.println("You exceeded 21! You lose");

                } else if (menu == 2) {

                } else if (menu == 3) {

                } else if (menu == 4) {
                    return;
                } else {
                    System.out.println("Invalid input!\n Please enter an integer value between 1 and 4.");
                }
            }
        }
        round[0]++;
    }
}
