//importing scanner
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //pseudo code
        //class
        //	main()
        //		num numberOne
        //		num numberTwo
        //      String trash
        //		output “Enter the first number”
        //      if input nextDouble then
        //		    input numberOne
        //		    output “Enter the second number”
        //		    input numberTwo
        //		    if numberOne == numberTwo then
        //			    output numberOne + “ is equal to “ + numberTwo
        //		    else  if numberOne > numberTwo then
        //			    output numberTwo + “ is less than “ + numberOne
        //		    else numberOne < numberTwo
        //			    output numberOne + “ is less than “ + numberTwo
        //		    end if
        //      else
        //          trash = input
        //          output "You said the number is " + trash
        //          output "Please run the program again and enter a valid number!"
        //	return
        //end class

        //declaring variables
        Scanner in = new Scanner(System.in);
        double numberOne = 0; //using doubles in case user enters decimal
        double numberTwo = 0;
        String trash = ""; //using this string in case user enters a non numeric value

        //output asking for first number from user
        System.out.println("Enter the first number:");

        //using if else structure so that if a valid number is inputted then program will proceed but if not then
        // program indicates invalid number
        if(in.hasNextDouble())
        {
            numberOne = in.nextDouble();
            in.nextLine(); //clearing buffer
            System.out.println("Enter the second number: ");
            if(in.hasNextDouble()) //nesting if statement here to ask user for second number to then compare
            {
                numberTwo = in.nextDouble();
                in.nextLine();
                if(numberOne == numberTwo) //nesting if statement here to run program and compare the numbers indicating if they are equal or the lesser oen
                {
                    System.out.println(numberOne + " is equal to " + numberTwo);
                }
                else if(numberOne > numberTwo)
                {
                    System.out.println(numberTwo + " is less than " + numberOne);
                }
                else {
                    System.out.println(numberOne + " is less than " + numberTwo);
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You said the number is " + trash);
                System.out.println("Please run the program again and enter a valid number!");
            }
        }
        else
        {
            trash = in.nextLine(); //because the input is not a valid number so it is read as a string
            System.out.println("You said the number is " + trash);
            System.out.println("Please run the program again and enter a valid number!");
        }
    }
}