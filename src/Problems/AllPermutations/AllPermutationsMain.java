package Problems.AllPermutations;

//this program is designed to find all the permutations of a string

public class AllPermutationsMain {

    public static void main (String [] args) {

        String string = "123";
        int n = string.length();
        StringBuilder stringToSwap = new StringBuilder(string);
       // System.out.println(factorial(4));
        System.out.println(threeObjectPermutationGenerator(string, n));
       // swap(string, 0, 1);
       // System.out.println(oneIndexToTheRight(string));

    }

    public static String threeObjectPermutationGenerator (String string, int n) {
        System.out.println(string);
        //this for loop is meant to isolate each element so that the other elements can be swapped
       // for (int i = 0; i < n; i++){
        String stringToSwap = swap(string, 0, 1);
        System.out.println(stringToSwap);
        stringToSwap = oneIndexToTheRight(stringToSwap);
        System.out.println(stringToSwap);
        stringToSwap = swap(stringToSwap, 0, 1);
        System.out.println(stringToSwap);
        stringToSwap = oneIndexToTheLeft(stringToSwap);
        System.out.println(stringToSwap);
        stringToSwap = swap(stringToSwap, 0, 1);





/*
                if (n % 2 != 0){
                    swap(string, 0, n);
                }
                else {
                    for (int j = 0; j < n; j++){
                        swap(string, j, n);
                    }
                }
                n--;*/
        //}
        return (stringToSwap);
    }

    public static String swap (String string, int j, int k){

        //System.out.println(string);

        //A string builder is initialized so that the string whose permutations are being found can be edited and returned
        StringBuilder stringToSwap = new StringBuilder(string);

        //first character of the string at index 0
        char a = string.charAt(j);
       // System.out.println(a);

        //the second character at index 1
        char b = string.charAt(k);
       // System.out.println(b);

        //changing the character at index 0 to the value of b
        stringToSwap.setCharAt(j, b);

       // System.out.println(stringToSwap);

        //changing the character at index j to the value of a
        stringToSwap.setCharAt(k, a);

       // System.out.println(stringToSwap);

        //conversion of StringBuilder into string
        String swappedString = stringToSwap.toString();

        return swappedString;
    }

    public static String oneIndexToTheRight (String string){
        String newString = string.charAt(string.length() - 1) + string;
        //System.out.println(newString);
        newString = newString.substring(0, (newString.length() - 1));
       // System.out.println(newString);
        return newString;
    }

    public static String oneIndexToTheLeft (String string){
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
