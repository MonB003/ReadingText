/* Unit 7 Reading Text Assignment
By: Monica 
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // Method to get a word from the user that will be searched for in each line of the file
    public static int findWordIndexes (String searchWord) throws IOException {

        // Create a FilerReader and BufferedReader to read each line in the in.txt file
        FileReader fr = new FileReader("in.txt");
        BufferedReader br = new BufferedReader(fr);

        // Create a string that represents each line in the in.txt file
        String line;

        // Index variable keeps track of index position being read by BufferedReader
        int index = 0;

        // While loop that reads each line that's not empty
        while((line = br.readLine()) != null) {

            // Statement of each line that's read
            System.out.println("Just read: " + line);

            // If statement to search for user's word in the text
            // If the line contains the user's word, print out the index position of where the word is in the line
            if (line.contains(searchWord)) {

                // For loop continues reading the rest of the line if the line contains the word multiple times
                // Loop starts from the next index position after the word is found and keeps searching for more instances of the word until it reaches the end of the line
                for (index = line.indexOf(searchWord); index >= 0; index = line.indexOf(searchWord, index + 1)) {

                    // Statement of each index position of the word
                    System.out.println("Found the word " + searchWord + " in index: " + index);
                }
            }
        }

        return index;
    }


    public static void main(String[] args) throws IOException {

        //Statement asking user to type a word
        System.out.println("Please enter a word to search for in the text file: ");

        // Scan user input
        Scanner scan = new Scanner(System.in);

        // String that represents the word being searched for in the file (user's input)
        String searchWord = scan.nextLine();

        // Statement of every index position of txtFileLines Arraylist that the word is in
        System.out.println("Found the word " + searchWord + " in index " + findWordIndexes(searchWord));



        // Method to copy each line of in.txt file into its own element of an ArrayList

        // Create an ArrayList to store each line of the text file
        ArrayList<String> txtFileLines = new ArrayList<>();

        // Create a FilerReader and BufferedReader to read each line in the in.txt file and store it in the out.txt file
        FileReader fr = new FileReader("in.txt");
        BufferedReader br = new BufferedReader(fr);

        // String that represents each line in the in.txt file
        String line;

        // While loop reads each line in the in.txt file
        while((line = br.readLine()) != null) {
            // Add each line to txtFileLines ArrayList using the add method
            txtFileLines.add(line);
        }
        br.close();

        // Create a FilerWriter and BufferedWriter to write each line of txtFileLines ArrayList into the out.txt file
        FileWriter fw = new FileWriter("out.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Writing to OUT File from IN file\r");

        // For loop writes each line into out.txt file
        for (String s : txtFileLines) {
            bw.write(s + "\r");
        }
        bw.close();

    }
}
