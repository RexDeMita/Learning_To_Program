package Problems.AllPermutations;

//this program is designed to find all the permutations of a string

public class AllPermutationsMain {

    public static void main (String [] args) {

        String string = "1234";
        int n = string.length();
        StringBuilder stringToSwap = new StringBuilder(string);
        System.out.println(factorial(4));
        permutationGenerator(string, n);

    }

    public static void permutationGenerator (String string, int n) {
        System.out.println(string);
        //this for loop is meant to isolate each element so that the other elements can be swapped
        for (int i = 0; i < n; i++){

                if (n % 2 != 0){
                    swap(string, 0, n);
                }
                else {
                    for (int j = 0; j < n; j++){
                        swap(string, j, n);
                    }
                }
                n--;
        }
    }

    public static String swap (String string, int j, int n){

        System.out.println(string);

        //A string builder is initialized so that the string whose permutations are being found can be edited and returned
        StringBuilder stringToSwap = new StringBuilder(string);

        //first character of the string at index 0
        char a = string.charAt(j);
        System.out.println(a);

        //the character at the index specified by variable j in the second for loop
        char b = string.charAt(n - 1);
        System.out.println(b);

        //changing the character at index 0 to the value of b
        stringToSwap.setCharAt(j, b);

        System.out.println(stringToSwap);

        //changing the character at index j to the value of a
        stringToSwap.setCharAt(n - 1, a);

        System.out.println(stringToSwap);

        //conversion of StringBuilder into string
        String swappedString = stringToSwap.toString();

        return swappedString;
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
