package ConditionalStatements;

import java.util.Scanner;


        public class RockPaperScissorsGame {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Rock, Paper, Scissors Game Program");
                System.out.println("Enter your move: (rock, paper, scissors)");
                String playerMove = scanner.next().toLowerCase();

                String[] moves = {"rock", "paper", "scissors"};
                String computerMove = moves[(int) (Math.random() * 3)];

                System.out.println("Computer's move: " + computerMove);

                if (playerMove.equals(computerMove)) {
                    System.out.println("It's a tie!");
                } else if (
                        (playerMove.equals("rock") && computerMove.equals("scissors")) ||
                                (playerMove.equals("paper") && computerMove.equals("rock")) ||
                                (playerMove.equals("scissors") && computerMove.equals("paper"))
                ) {
                    System.out.println("You win!");
                } else {
                    System.out.println("Computer wins!");
                }

                scanner.close();
            }
        }
