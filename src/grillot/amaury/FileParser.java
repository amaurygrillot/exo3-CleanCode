package grillot.amaury;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileParser {



    public ArrayList<String> getAllLinesFromFile(String filename)
    {
        try {
            File myObj = new File(filename);
            Scanner myReader = new Scanner(myObj);
            ArrayList<String> allLines = new ArrayList<>();
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
                allLines.add(data);
            }
            myReader.close();
            return allLines;
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return new ArrayList<>();

    }
}
