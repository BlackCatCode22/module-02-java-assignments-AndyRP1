import java.util.Scanner;

// aR 8/29/24
/*
* LoopsAndArrays.java
*
* This Program will
*
*
*
*
*
*
*
 */
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LoopsAndArrays {
    public static void main(String[] args) {

        // Create a Scanner object for user input.
        Scanner scanner = new Scanner()

        System.out.printf("\n Welcome to my friendly For Loop Program\n");

        // Create a for loop that diplays 'Hello There!' five times


        // the loop control variable of this loop
        // is named i (it means integer (whole number)).
        // this loop control variable must be:intialized, checked and changed.
        for (int i = 0; i < 10; i++) {
            System.out.println("The value of i is:" + i);
        }
        System.out.println("\n This is the end of our Program!");

        // Create a while loop that does the same thing.
        int loopControlVariable = 0;
        while (loopControlVariable < 10) {
            System.out.println("The value of loopControlVariable is:" + loopControlVariable);
            // Change the loop control variable.
            loopControlVariable++;

        }

        // Create a String array of five words.
        //String[] names = new String[10];
        String[] names = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

        int[]myNumbers = new int [10];

        // Use a for loop to get ten whole numbers from the user.
        for (int i=0; i<10 ; i++){
         System.out.println("Please enter number"+(i+1));
            myNumbers[i] = scanner.nextInt();
        }

        System.out.println("One of our names is :" + names[4]);
        // Output the length of our array named name.
        System.out.println("\n The length of out array 'names' is  :" + names.length);

        //Create an int array with 10 elements
        int [] myNumbers = new int [10];
        // Use a for loo[ to get ten whole numbers from the user.
        for (int i=0; i<10; i++)
            System.out.println("Please enter number"+ (i+1));


        // Create a for loop that outputs all element values in the names array.


        for (int i = 0; i < names.length; i++) {
            System.out.println("names["+i+"] is..."+ names [i]);



            System.out.println("\n This is the end of our Program!");
        }
    }

}