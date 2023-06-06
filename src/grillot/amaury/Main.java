package grillot.amaury;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    TextDisplayManager textDisplayManager = new TextDisplayManager();
        InputManager inputManager = new InputManager();
        FileParser fileParser = new FileParser();
        textDisplayManager.displayFirstMessage();
        String filename = inputManager.nextLine();
        String operation = inputManager.nextLine();
        ArrayList<String> allLines = fileParser.getAllLinesFromFile(filename);
        int subtotal = 0;
        if(operation.equals("*"))
        {
            subtotal = 1;
            for (String line: allLines)
            {
                int lineInt = Integer.parseInt(line);
                subtotal = subtotal * lineInt;
                textDisplayManager.displaySubtotal(operation, subtotal);
            }
        }
    }
}
