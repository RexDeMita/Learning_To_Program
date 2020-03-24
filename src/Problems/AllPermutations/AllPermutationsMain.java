package Problems.AllPermutations;

//this program is designed to find all the permutations of a string

public class AllPermutationsMain {
    String string;
    int n = string.length();
    StringBuilder stringToSwap = new StringBuilder(string);

    public static void main (String [] args) {
       // permutationGenerator();
        //swap(1,2);
    }

    public static void permutationGenerator (String string, int n) {

        //this for loop is meant to isolate each element so that the other elements can be swapped
        for (int i = 0; i < n; i++){

            //this for loop is meant to do all the swapping
            for (int j = 0; j < n; j++){
                if (n % 2 != 0){
                    swap("aba", 0, n );
                }
                else {
                    swap("aba", j, n);
                }
            }
        }
    }

    public static String swap (String string, int j, int n){

        //A string builder is initialized so that the string whose permutations are being found can be edited and returned
        StringBuilder stringToSwap = new StringBuilder(string);

        //first character of the string at index 0
        char a = string.charAt(j);

        //the character at the index specified by variable j in the second for loop
        char b = string.charAt(n - 1);

        //changing the character at index 0 to the value of b
        stringToSwap.setCharAt(j, b);

        System.out.println(stringToSwap);

        //changing the character at index j to the value of a
        stringToSwap.setCharAt(n - 1, a);

        System.out.println(stringToSwap);

        //conversion of stringbuilder into string
        String swappedString = stringToSwap.toString();

        return swappedString;
    }
}
