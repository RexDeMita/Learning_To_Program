package Problems.AllPermutations;

public class SwappingCharacters {

    public static void main (String [] args){
        swapLetters(1,2);
    }

    public static void swapLetters (int x, int y){

        StringBuilder stringToSwap = new StringBuilder("aba");
        stringToSwap.setCharAt(0, 'b');
        stringToSwap.setCharAt(1, 'a');
        System.out.println(stringToSwap);


        int n;

        x = 1;
        y = 2;

        System.out.println(x);
        System.out.println(y);

        n = x;
        x = y;
        y = n;

        System.out.println(x);
        System.out.println(y);
    }

}
