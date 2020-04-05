package Problems.AllPermutations;

//this program is designed to find all the permutations of a string

public class AllPermutationsMain {

    public static void main (String [] args) {
        //This is the string whose permutations are found
        String string = "123";

        //Prints out all the permutations of the string
        System.out.println(threeDistinctObjectPermutationGenerator(string));

    }

    public static String threeDistinctObjectPermutationGenerator (String string) {

        System.out.println(string);
        //first permutation

        String stringToSwap = swap(string, 0, 1);
        System.out.println(stringToSwap);
        //second permutation

        stringToSwap = oneIndexToTheRight(stringToSwap);
        System.out.println(stringToSwap);
        //third permutation

        stringToSwap = swap(stringToSwap, 0, 1);
        System.out.println(stringToSwap);
        //fourth permutation

        stringToSwap = oneIndexToTheLeft(stringToSwap);
        System.out.println(stringToSwap);
        //fifth permutation

        stringToSwap = swap(stringToSwap, 0, 1);
        //this return is the final permutation which gets printed out by the method call

        return (stringToSwap);

    }


    public static String swap (String string, int j, int k){


        //A string builder is initialized so that the string whose permutations are being found can be edited and returned
        StringBuilder stringToSwap = new StringBuilder(string);

        //first character of the string at index 0
        char a = string.charAt(j);

        //the second character at index 1
        char b = string.charAt(k);

        //changing the character at index 0 to the value of b
        stringToSwap.setCharAt(j, b);

        //changing the character at index j to the value of a
        stringToSwap.setCharAt(k, a);

        //conversion of StringBuilder into string
        String swappedString = stringToSwap.toString();

        return swappedString;
    }

    public static String oneIndexToTheRight (String string){

        //moves the characters one index to the right

        //adds the last character to the beginning of the string
        String newString = string.charAt(string.length() - 1) + string;

        //creates a substring that excludes the last character
        newString = newString.substring(0, (newString.length() - 1));

        return newString;
    }

    public static String oneIndexToTheLeft (String string){

        //moves the characters to the left

        //Adds the first character to the end of a substring starting at index 1
        String newString = string.substring(1) + string.charAt(0);

        return newString;
    }

    public static int factorial (int n){
       System.out.println(n);

        if (n==0) {
            return 1;
        } else {
            return(n * factorial(n-1));
        }
    }
}
