import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class rockPaperScissorGame
{
    public static void main(String ar[])
    {
        System.out.println("""
                Welcome to Rock Paper Scissor -->

                S.no           Options                Values
                1.              Rock              rock/Rock/ROCK
                2.              Paper             paper/Paper/PAPER
                3.              Scissor           scissor/Scissor/SCISSOR

                Choose how many intervals you want to play :-->

                """);
        Scanner obj=new Scanner(System.in);
        int interval=obj.nextInt();
        Random obj1=new Random();
        String array[]={"rock","paper","scissor"};
        int computer_score = 0;
        int my_score = 0;
        for (int initial_value=0 ; initial_value<interval ; initial_value++) {
            System.out.println("Enter your value :-->");
            String value = obj.next();
            value = value.toLowerCase();
            while (!Arrays.asList(array).contains(value)) {
                System.out.println("Please enter a valid values available here");
                System.out.println("""
                        Welcome to Rock Paper Scissor -->

                        S.no           Options                Values
                        1.              Rock              rock/Rock/ROCK
                        2.              Paper             paper/Paper/PAPER
                        3.              Scissor           scissor/Scissor/SCISSOR

                        Choose how many intervals you want to play :-->""");
                value = obj.nextLine();
                value = value.toLowerCase();

            }

            int computer_int_value = obj1.nextInt(1, 4);
            String computer_value;

            if (computer_int_value == 1) {
                computer_value = "rock";
                System.out.println("computer choosed ROCK");
            } else if (computer_int_value == 2) {
                computer_value = "paper";
                System.out.println("computer choosed PAPER");
            } else {
                computer_value = "scissor";
                System.out.println("computer choosed SCISSOR");
            }

            if (computer_value.equals("rock") && value.equals("scissor")) {
                computer_score=computer_score+1;

            } else if (computer_value.equals("rock") && value.equals("paper")) {
                my_score=my_score+1;

            } else if (computer_value.equals("scissor") && value.equals("rock")) {
                my_score=my_score+1;

            } else if (computer_value.equals("scissor") && value.equals("paper")) {
                computer_score=computer_score+1;

            } else if (computer_value.equals("paper") && value.equals("rock")) {
                computer_score=computer_score+1;

            } else if (computer_value.equals("paper") && value.equals("scissor")) {
                my_score=my_score+1;

            }




            System.out.println("""
                                   SCOREBOARD
                    My_Score                      Computer_Score""");
            System.out.print("  "+my_score+"         ");
            System.out.println("                             "+computer_score);

           if (initial_value==interval-1) {
               System.out.println("""
                                           
                       The Winner is ::->""");
               if (my_score > computer_score) {
                   System.out.println("              USER               ");
               } else if (my_score <computer_score) {
                   System.out.println("              COMPUTER            ");

               }
               else
               {
                   System.out.println("              DRAW                 ");
               }
           }


        }

        }


    }
