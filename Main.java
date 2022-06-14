import java.util.Scanner;

/***************************************************************
 Filename: OddOrEven
 Created by: Melat Semereab
 Created on: 10/4/2021
 Comment: prompts the user to enter an integer, then test
 whether the number entered was even or not and output a suitable message informing the user of
 the result
 ***************************************************************/
public class Main {
public static void main(String[] args) {
Scanner keyboard = new Scanner(System.in);
    int number;

    System.out.println("Enter an integer:");
    number = keyboard.nextInt();

    if (number%2 == 0)
       {
        System.out.println("\n" + number + " is an even number" );
       }//if
     else if (number % 2!=0)
       {
        System.out.println("\n" + number + " is an odd number.");
       } else
       {
        System.out.println("You entered invalid character");
      }//if

   }//main
}//class