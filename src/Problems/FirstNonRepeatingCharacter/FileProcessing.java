package Problems.FirstNonRepeatingCharacter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileProcessing {

    //the location of the file depends on whether you are running the program from
    //within IntelliJ or though the command line

    //in IntelliJ, the file location is under your project file.
    public static final String FILE_NAME = ".idea/test.txt";

    private String content = "";

    public String getContent(){

        return content;
    }

    /**
     * This method reads in the content of files as Strings using the Scanner class.
     */

    public void readInFile() throws FileNotFoundException {
        File file = new File(FILE_NAME);
        Scanner fileReader = new Scanner(file);

        //note that StringBuffer or StringBuilder would be better than appending
        //a string to another string here
        while(fileReader.hasNextLine()){
            content = content + fileReader.nextLine() + "\n";
        }

    }

}
