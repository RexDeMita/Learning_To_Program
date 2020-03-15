package Problems;
import java.util.Scanner;

//This program was created to find the first non repeating character in a given string.

public class FirstNonRepeatingCharacter {
    public static void main (String [] args) {

        //Scanner to take in user input of the given string
        Scanner console = new Scanner(System.in);
        String givenString = console.next();

        //Initialize the repChar string to catch repetitive characters
        String repChar = " ";

        //currChar is the current character to be examined against the character that follows it, nextChar
        char currChar = ' ';
        int currIndex;
        char nextChar;
        int nextIndex = 0;

        //this is a for loop that will iterate over the string given by the user
        for (int i = 0; i < givenString.length(); i++) {

            //this if/else statement is used to exit the for loop when the nextIndex variable is 1 less than the length
            //of the string. This indicates that the non repeating character has been found due to reaching the end of
            //the given string.
            if  ((nextIndex + 1) - givenString.length() == 0) {
                break;
            }

            currIndex = i;
            currChar = givenString.charAt(currIndex);
            nextIndex = currIndex + 1;
            nextChar = givenString.charAt(nextIndex);

            //This if/else statement is to check to see if the currChar is in repChar.
            //If so, repChar is updated.
            //If not, a while loop is entered.
            if (repChar.indexOf(currChar) == -1) {

                //The while loop is meant to compare currChar with each subsequent character.
                //The loop terminates when the two characters being compared are the same.
                while (currChar != nextChar) {

                        //This if/else statement is a safeguard against
                        // updating the nextIndex to a value beyond the last index of the given string.
                        //If the condition is met, the nextChar is updated so that the next character is compared
                        //against the the current character
                        if  ((nextIndex + 1) - givenString.length() != 0) {
                            nextIndex = nextIndex + 1;
                            nextChar = givenString.charAt(nextIndex);
                        }
                        else {

                            //This break is meant to exit the while loop once nextIndex corresponds to the last
                            //character in the string.
                            break;
                        }
                }
                //updates the repeating characters if the two characters being compared are the same.
                repChar = repChar + currChar;

            }




        }

        //Prints out currChar, the answer.
        System.out.println(currChar);
    }


}
