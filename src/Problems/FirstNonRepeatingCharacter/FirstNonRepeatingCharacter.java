package Problems.FirstNonRepeatingCharacter;

import java.io.FileNotFoundException;

//This program was created to find the first non repeating character in a given string.

public class FirstNonRepeatingCharacter {

    public static void main (String [] args) throws FileNotFoundException {

        //create new FileProcessing object
        FileProcessing fileProcessing = new FileProcessing();

        //the object fileProcessing is accessing the method readInFile from the FileProcessing class
        //this process builds the string called content in the FileProcessing object using the contents of the file
        fileProcessing.readInFile();

        /*The object fileProcessing is accessing the method getContent
        This process creates a string called contentFromFile that is composed of characters from the string called
        content in the object FileProcessing
         */
        String contentFromFile = fileProcessing.getContent();

        //Initialize the repChar string to catch repetitive characters
        StringBuilder repChar = new StringBuilder(" ");

        //currChar is the current character to be examined against the character that follows it, nextChar
        char currChar = ' ';
        int currIndex;
        char nextChar;
        int nextIndex = 0;

        //this is a for loop that will iterate over the string given by the user
        for (int i = 0; i < contentFromFile.length(); i++) {

            /*this if/else statement is used to exit the for loop when the nextIndex variable is 1 less than the length
            of the string. This indicates that the non repeating character has been found due to reaching the end of
            the given string.
             */
            if  ((nextIndex + 1) - contentFromFile.length() == 0) {
                break;
            }

            currIndex = i;
            currChar = contentFromFile.charAt(currIndex);
            nextIndex = currIndex + 1;
            nextChar = contentFromFile.charAt(nextIndex);

            /*This if/else statement is to check to see if the currChar is in repChar.
            If so, repChar is updated.
            If not, a while loop is entered.
            */
            if (repChar.toString().indexOf(currChar) == -1) {

                //The while loop is meant to compare currChar with each subsequent character.
                //The loop terminates when the two characters being compared are the same.
                while (currChar != nextChar) {

                        /*This if/else statement is a safeguard against
                        updating the nextIndex to a value beyond the last index of the given string.
                        If the condition is met, the nextChar is updated so that the next character is compared
                        against the the current character
                        */
                        if  ((nextIndex + 1) - contentFromFile.length() != 0) {
                            nextIndex = nextIndex + 1;
                            nextChar = contentFromFile.charAt(nextIndex);
                        }
                        else {

                            //This break is meant to exit the while loop once nextIndex corresponds to the last
                            //character in the string.
                            break;
                        }
                }
                //updates the repeating characters if the two characters being compared are the same.
                repChar.append(currChar);

            }




        }

        //Prints out currChar, the answer.
        System.out.println(currChar);
    }


}
