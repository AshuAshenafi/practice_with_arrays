import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.min;
import static java.lang.String.valueOf;


public class Q1ArrayHoldNums {
    public static void main(String[] args) {

        // instantiate scanner object
        Scanner keyboard = new Scanner(System.in);


        boolean cont1 = true;   // first while loop control
/*
 * The first while loop is for my instructor to traverse from first exercise to the next or to exit anytime
 */

        while (cont1 == true) {    //first while loop

/*
 * Question #1 - create an array to hold the numbers from 1 to 10
 */
            // array declaration
            int arr[] = new int[10];

            for (int i = 0; i < 10; i++) {
                arr[i] = (i + 1);                   // assign each array with value
            }
/*
 * Question #2 - loop through the array and sum the numbers 1 to 10,
 *              then print that total to the screen
 */
            boolean cont2 = true;       //second whileloop

            do {
                String input2;
                int sum = 0;
                for (int i = 0; i < 10; i++) {
                    sum += arr[i];
                }
                // output for second question
                System.out.printf("Here is output for Q2.\n");
                System.out.println("The array is: " + Arrays.toString(arr));
                System.out.printf("Sum of the numbers 1 to 10 = %d.\n", sum);

                //confirm if user wants to quit or continue?
                System.out.print("\nEnter (n/N) to exit or \nany other key to go to 3rd Question. ");
                input2 = keyboard.nextLine();


                // if user hits n/N key exit.
                if (input2.equalsIgnoreCase("n")) {
                    System.out.printf("\nThank you for checking so far.");
                    cont2 = false;
                    cont1 = false;

                    return;
                }
                // if user hits any other key go to third question
                else {
                    cont2 = false;
                }
            } while (cont2 == true);   // end of second while loop


/*
 * Q#3. Create an array to hold 10 number inputs from the user and print that total to the screen.
 */


            double arr3[] = new double[10];
            double sum3 = 0;
            int n3 = arr3.length;
            boolean cont3 = true;       // control for third question

            do {
                String input31;
                double input3;

                System.out.println("\nQuestion 3. Enter ten numbers.");
                for (int i = 0; i < n3; i++) {
                    System.out.printf("Enter number (%2d/%d): ", (i + 1), n3);
                    input3 = keyboard.nextDouble();
                    arr3[i] = input3;
                    sum3 += arr3[i];
                }

                System.out.printf("\nHere is output for Q3.\n");
                System.out.println("----------------------------");
                System.out.println("The array is: " + Arrays.toString(arr3));
                System.out.println("Total sum of values is: " + sum3);


                //confirm if user wants to quit or continue?
                System.out.print("\nEnter (n/N) to exit or \nany other key to go to 4th Question. ");
                input31 = keyboard.nextLine();
                keyboard.nextLine();


                // if user hits n/N key exit.
                if (input31.equalsIgnoreCase("n")) {
                    System.out.printf("\nThank you for checking so far.");
                    cont3 = false;
                    cont1 = false;

                    return;
                }
                // if user hits any other key go to next question
                else {
                    cont3 = false;
                }


            } while (cont3 == true);

/*
 * Q4. Average of the ten numbers entered
 */

            boolean cont4 = true;

            do {
                String input4;

                System.out.println("\nHere is output for Q4.");
                System.out.println("----------------------------");
                System.out.println("The array you entered previously is: " + Arrays.toString(arr3));

                // average is equal to sum divided by number of values
                double avg = (double) sum3 / n3;
                System.out.printf("Average of the ten numbers is: %.2f", avg);


                //confirm if user wants to quit or continue?
                System.out.println("\n");
                System.out.print("Enter (n/N) to exit or \nany other key to go to 5th Question. ");

                input4 = keyboard.nextLine();

                // if user hits n/N key exit.
                if (input4.equalsIgnoreCase("n")) {
                    System.out.printf("\nThank you for checking so far.");
                    cont4 = false;
                    cont1 = false;

                    return;
                }
                // if user hits any other key go to next question
                else {
                    cont4 = false;
                }

            } while (cont4 == true);


/*
 * Q#5. Create an array to store 3 names, loop through that array to print out the names.
 */
            boolean cont5 = true;

            do {
                String input5;
                String arr5[] = new String[3];
                int n5 = arr5.length;
                String input51;

                System.out.println("\nHere is Q5.");
                System.out.println("----------------------------");
                System.out.println("\nEnter three names.");
                for (int i = 0; i < n5; i++) {
                    System.out.printf("Enter name (%2d/3): ", (i + 1));
                    input5 = keyboard.nextLine();
                    arr5[i] = input5;
                }
                System.out.println("\nHere is output for Q5.");
                System.out.println("----------------------------");
                System.out.printf("The three names are: [");
                for (int i = 0; i < n5; i++) {
                    if (i > 0) {
                        System.out.printf(", ");
                    }
                    System.out.printf("%s", arr5[i]);
                    if (i == 2) {
                        System.out.printf("]");
                    }
                }
/////////////////////////////////////////////////////////////

                //confirm if user wants to quit or continue?
                System.out.println("\n");
                System.out.print("Enter (n/N) to exit or \nany other key to go to 6th Question. ");
                input51 = keyboard.nextLine();

                // if user hits n/N key exit.
                if (input51.equalsIgnoreCase("n")) {
                    System.out.printf("\nThank you for checking so far.");
                    cont5 = false;
                    cont1 = false;

                    return;
                }
                // if user hits any other key go to next question
                else {
                    cont5 = false;
                }

/////////////////////////////////////////////////////////////
            } while (cont5 == true);


/*
 * Q#6. Create an array with the following values: [2,5,9,0,2,1,8,5,4]
 * Loop through the array and print out the index each time the value equals 5.
 */

            boolean cont6 = true;
            do {
                String input6;

                int arr6[] = {2, 5, 9, 0, 2, 1, 8, 5, 4};

                int k = 0;
                int val = 5;    // check array values equal to this variable name val.

                System.out.println("\nHere is output for Q6.");
                System.out.println("----------------------------");
                System.out.println("The subject array is: " + Arrays.toString(arr6));
                System.out.printf("\nList of array index whose value = %d : [", val);

                for (int i = 0; i < arr6.length; i++) {
                    if (arr6[i] == val) {
                        if (k > 0) {
                            System.out.printf(", ");
                        }
                        k++;
                        System.out.printf("%s", i);
                    }
                    if (i == (arr6.length - 1)) {
                        System.out.printf("]");
                    }
                }
/////////////////////////////////////////////////////////////

                //confirm if user wants to quit or continue?
                System.out.println("\n");
                System.out.print("Enter (n/N) to exit or \nany other key to go to 7th Question. ");
                input6 = keyboard.nextLine();

                // if user hits n/N key exit.
                if (input6.equalsIgnoreCase("n")) {
                    System.out.printf("\nThank you for checking so far.");
                    cont6 = false;
                    cont1 = false;
                    return;
                }
                // if user hits any other key go to next question
                else {
                    cont6 = false;
                }

/////////////////////////////////////////////////////////////

            } while (cont6 == true);


/*
Q#7. Declare an array with the numbers 1-10. Print the numbers 1-10 backwards from the array.
 */
            boolean cont7 = true;

            do{
                String input7;

                int arr7[] = new int[10];

                for (int i = 0; i < 10; i++) {
                    arr7[i] = (i + 1);
                }

                System.out.println("\nHere is output for Q7.");
                System.out.println("----------------------------");
                System.out.println("original array is: " + Arrays.toString(arr7));
                System.out.print("List of array values in reverse order: {");

                for (int i = 9; i >= 0; i--) {
                    if (i < 9) {
                        System.out.printf(", ");
                    }
                    System.out.printf("%s", arr7[i]);
                    if (i == 0) {
                        System.out.printf("}");
                    }
                }
/////////////////////////////////////////////////////////////

                //confirm if user wants to quit or continue?
                System.out.println("\n");
                System.out.print("Enter (n/N) to exit or \nany other key to go to 8th-(i) Question. ");
                input7 = keyboard.nextLine();

                // if user hits n/N key exit.
                if (input7.equalsIgnoreCase("n")) {
                    System.out.printf("\nThank you for checking so far.");
                    cont7 = false;
                    cont1 = false;
                    return;
                }
                // if user hits any other key go to next question
                else {
                    cont7 = false;
                }

/////////////////////////////////////////////////////////////


            }while(cont7 == true);
/*
Q8(i). Given the following array: ["w",   "t",  "y",  "h",  "k"]
Loop through the array and replace the the letter 't' with the word "hello" once it's found.
*/
            boolean cont8 = true;

            do {
                String input82;

                String orig_arr[] = {"w",   "t",  "y",  "h",  "k"};
                int arr_len = orig_arr.length;
                String new_arr[] = new String[arr_len];

                for(int i = 0; i < arr_len; i++){
                    if("t".equals(orig_arr[i])){
                        new_arr[i] = "hello";
                    }
                    else{
                        new_arr[i] = orig_arr[i];
                    }
                }
                System.out.println("\nHere is output for Q8(i).");
                System.out.println("----------------------------");

                System.out.println("Original Array is: " + Arrays.toString(orig_arr));
                System.out.println("\nAfter replacing \"t\" with \"hello\"");
                System.out.println("The New Array is: " + Arrays.toString(new_arr));
/////////////////////////////////////////////////////////////

            //confirm if user wants to quit or continue?
            System.out.println("\n");
            System.out.print("Enter (n/N) to exit or \nany other key to go to Next Question. ");
            input82 = keyboard.nextLine();

            // if user hits n/N key exit.
            if (input82.equalsIgnoreCase("n")) {
                System.out.printf("\nThank you for checking so far.");
                cont8 = false;
                cont1 = false;
                return;
            }
            // if user hits any other key go to next question
            else {
                cont8 = false;
            }

///////////////////////////////////////////////////////////




            }while(cont8 == true);
/*
Q#8(ii). Instructor changed it after I already did it. However I have done both ways.
Given the following array: ['w','t','y','h','k']
Loop through the array and replace the the letter 't' with the word "hello" once it's found.
 */
            boolean cont82 = true;

        do{
            String input8;

            char orig_arr[] = {'w','t','y','h','t'};
            int arr_len = orig_arr.length;

            // since the given array is of char data type and
            // we can't insert (even by replacing) string value ("hello") to a character.
            // A new string array is a must to create and copy all the values.
            String new_arr[] = new String [arr_len];

            // copy values of char array into string array
            for(int i = 0; i < arr_len; i++){
                new_arr[i] = valueOf(orig_arr[i]);
            }
            // look for 't' now that mean 't' is changed into string value
            for(int i = 0; i < arr_len; i++){

                if(new_arr[i].equals("t")){

                    // if "t" is found replace it with "hello"
                    new_arr[i] = "hello";
                }
            }

            System.out.println("\nHere is output for Q.8(ii).");
            System.out.println("----------------------------");

            System.out.println("Original array is: " + Arrays.toString(orig_arr));
            System.out.printf("\nAfter replacing 't' with \"hello\" \nNew Array is : {");
            for(int i = 0; i < arr_len; i++){
                if(i > 0){
                    System.out.printf(", ");
                }
                System.out.printf("%s", new_arr[i]);
                if(i == (arr_len-1)){
                    System.out.printf("}");
                }
            }
/////////////////////////////////////////////////////////////

            //confirm if user wants to quit or continue?
            System.out.println("\n");
            System.out.print("Enter (n/N) to exit or \nany other key to go to 9th Question. ");
            input8 = keyboard.nextLine();

            // if user hits n/N key exit.
            if (input8.equalsIgnoreCase("n")) {
                System.out.printf("\nThank you for checking so far.");
                cont82 = false;
                cont1 = false;
                return;
            }
            // if user hits any other key go to next question
            else {
                cont82 = false;
            }

///////////////////////////////////////////////////////////
        }while(cont82 == true);


/*
Q#9. Given array 1: [1,7,6,5,9] and array 2: [2,7,6,3,4]
Write a program that will print out all matching pairs from arrays 1 and 2.
Expected output:
(7,7) and (6,6)

 */



            boolean cont9 = true;

            do{
                String input9;

                // two given arrays to compare their value for match
                int arr91[] = {1, 7, 6, 5, 2};
                int arr92[] = {2, 7, 6, 3, 4};

                int mlenth = min(arr91.length, arr92.length);
                int arr93[] = new int[mlenth];


                int count = 0;
                for (int i = 0; i < arr91.length; i++) {
                    boolean equal_values = false;
                    for (int j = 0; j < arr92.length; j++) {
                        if (arr91[i] == arr92[j]) {
                            equal_values = true;
                        }
                    }
                    //
                    if (equal_values) {
                        arr93[count] = arr91[i];
                        count++;
                    }
                }
                System.out.println("\nHere is output for Q.9.");
                System.out.println("----------------------------");

                //display the two given arrays
                System.out.println("First Array is: " + Arrays.toString(arr91));
                System.out.println("Second Array is: " + Arrays.toString(arr92));

                //display the matching pairs
                System.out.print("\nMatching pairs are: { ");
                for (int i = 0; i < count; i++) {
                    if (i > 0 && i < count - 1) {
                        System.out.print(", ");
                    }
                    if (i == count - 1) {
                        System.out.print("and ");
                    }
                    System.out.print("(" + arr93[i] + ", " + arr93[i] + ") ");
                    if (i == count - 1) {
                        System.out.print(" }\n");
                    }
                }
/////////////////////////////////////////////////////////////

                //notify user to enter any key to exit?
                System.out.println("\n");
                System.out.print("Press any key to exit. ");
                input9 = keyboard.nextLine();

                // both options lead to exit.
                if (input9.equalsIgnoreCase("n")) {
                    System.out.println("Thank you for checking all.");
                    cont9 = false;
                    cont1 = false;

                }

                // both options lead to exit.
                else {
                    System.out.println("Thank you for checking all.");
                    cont9 = false;
                    cont1 = false;

                }
/////////////////////////////////////////////////////////////
            }while(cont9 == true);

            keyboard.close();
            cont1 = false;
        }  //end of first while loop



    }   //end of main
}   // end of class
