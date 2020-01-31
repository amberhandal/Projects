import java.util.Random;
import java.util.Scanner;

public class BlackJack {
    public static void main(String args[]) {
        Scanner reading = new Scanner(System.in);
        double menu;
        boolean start = true;
        int round = 1;
        int card;
        final int ACE; ACE = 1;
        final int JACK; JACK = 11;
        final int QUEEN; QUEEN = 12;
        final int KING; KING = 13;


        while (true) {
            System.out.println("START GAME #" + round + "\n");

                class P1Random {
                    P1Random rng = new P1Random();

                    private void main() {
                    double menu;
                        menu = reading.nextDouble();
                        System.out.println();
                        System.out.println("1. Get another card");
                        System.out.println("2. Hold hand");
                        System.out.println("3. Print statistics");
                        System.out.println("4. Exit");
                        System.out.println();
                        if (menu == 1) {

                        } else if (menu == 2) {

                        } else if (menu == 3) {

                        } else if (menu == 4) {
                            return;
                        } else {
                            System.out.println("Invalid input!\n Please enter an integer value between 1 and 4.");
                        }
                    }
                }

            round++;}
        }
    }

