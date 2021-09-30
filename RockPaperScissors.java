package assessment;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    final static String ROCK = "rock";
    final static String PAPER = "paper";
    final static String SCISSORS = "scissors";

    private static Scanner sc = new Scanner(System.in);

    public static String compMove(){

        String move;

        Random random = new Random();
        int input = random.nextInt(3);
        if (input == 0) {
            move = ROCK;
        }
        else if(input == 1) {
            move = PAPER;
        }
        else {
            move = SCISSORS;
        }
        return move;
    }

    public static String playerMove(){

        boolean invalidInput = false;

        String userMove = "";

        do{
            System.out.println("\nPlease choose rock, paper or scissors");
            String userIn = sc.nextLine().toLowerCase();

            switch (userIn){

                case ROCK:
                case PAPER:
                case SCISSORS:
                    invalidInput = true;
                    userMove = userIn;
                default:
                    System.out.println("Error: Invalid input");
            }
        }
        while (invalidInput == false);

        return userMove;


    }

    public static void main(String[] args){

        boolean keepPlaying = true;


        do{

            int tieCount = 0;
            int winCount = 0;
            int lossCount = 0;

            System.out.println("How many rounds would you like to play?");
            int rounds = Integer.parseInt(sc.nextLine());

            if(rounds <= 10 && rounds > 0){

                for (int i = 0; i < rounds; i++){

                    String player = playerMove();
                    String comp = compMove();

                    System.out.println("\nThe player choose " + player);
                    System.out.println("The computer choose " + comp);


                    if(player.equals(comp)){
                        tieCount++;
                        System.out.println("This round is tie");
                    }
                    else{
                        switch (player){
                            case ROCK:
                                if(comp.equals(SCISSORS)){
                                    winCount++;
                                    System.out.println("Player wins!");
                                }
                                else{
                                    lossCount++;
                                    System.out.println("Computer wins!");
                                }
                                break;

                            case PAPER:
                                if(comp.equals(ROCK)){
                                    winCount++;
                                    System.out.println("Player wins!");
                                }
                                else{
                                    lossCount++;
                                    System.out.println("Computer wins!");
                                }
                                break;

                            case SCISSORS:
                                if(comp.equals(PAPER)){
                                    winCount++;
                                    System.out.println("Player wins!");
                                }
                                else{
                                    lossCount++;
                                    System.out.println("Computer wins!");
                                }
                                break;

                        }

                    }

                }

                System.out.println("\n The score is: \n Player wins: " + winCount + "\n Computer wins: " + lossCount + "\n Ties: " + tieCount + "\n");

                if(winCount > lossCount){
                    System.out.println("You win");
                }
                else if(winCount < lossCount){
                    System.out.println("You lose");
                }
                else{
                    System.out.println("You drew with the computer");
                }

                System.out.println("\n Would you like to play again?");
                String play = sc.nextLine();
                if(play.equals("no")){
                    keepPlaying = false;
                    System.out.println("Thanks for playing!");
                }
                else{
                    keepPlaying = true;
                }
            }
            else{
                System.out.println("Error: you did not enter a value between 0 and 10");
            }

        }while (keepPlaying== true);






    }




}
