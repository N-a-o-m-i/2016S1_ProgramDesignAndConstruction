package Task1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Naomi
 */
public class IOTask {

    public IOTask(){
    
    }
    
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
            //create a variable to store a line
            String line = "";
            while((line = br.readLine()) != null)
            {
                //Create a char array to hold the current line per character
                char[] chars = new char[line.length()];
                //Convert it to a proper char array
                chars = line.toCharArray();
                //Cycle through the array in reverse order
                for(int i = line.length() - 1; i >= 0; i--)
                {
                    char currentChar = line.charAt(i);
                    //check if the current character is a letter
                    if(Character.isLetter(currentChar))
                    {
                        chars[i] = line.charAt(i);
                        //write the character to output reader
                        bw.append(Character.toUpperCase(chars[i]));
                    }
                }
                //keep a new line between each line from reader
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            System.err.println("IOException Error: " + e.getMessage());
        }
    }
    
}
