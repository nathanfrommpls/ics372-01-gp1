package store.ui;

import store.entities.*;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInterface {
	private static UserInterface userInterface;
	private static Store store;
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static final int EXIT = 0;
    private static final int ENROLL_MEMBER = 1;
    private static final int REMOVE_MEMBER = 2;
    private static final int ADD_PRODUCT = 3;
    private static final int CHECKOUT = 4;
    private static final int PROCESS_SHIPMENT = 5;
    private static final int CHANGE_PRICE = 6;
    private static final int RETRIEVE_PRODUCT_INFO = 7;
    private static final int RETRIEVE_MEMBER_INFO = 8;
    private static final int PRINT_TRANSACTIONS = 9;
    private static final int LIST_OUTSTANDING_ORDERS = 10;
    private static final int LIST_ALL_MEMBERS = 11;
    private static final int LIST_ALL_PRODUCTS = 12;
    private static final int SAVE = 13;
    private static final int HELP = 14;

	public static void main(String[] args) {
		UserInterface.instance().mainMenu();
	}

    public static UserInterface instance() {
        if (userInterface == null) {
            return userInterface = new UserInterface();
        } else {
            return userInterface;
        }
    }
    
    private UserInterface() {
    	System.out.println("Do you want to load from disk?");
    }
	
	public void logo() {
		System.out.println("︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿\n"
		+ "\n"
		+ "                  WELCOME TO THE\n"
		+ "   ____  _____ ____    ____  _____     _______ ____  \n"
		+ "  |  _ \\| ____|  _ \\  |  _ \\|_ _\\ \\   / / ____|  _ \\ \n"
		+ "  | |_) |  _| | | | | | |_) || | \\ \\ / /|  _| | |_) |\n"
		+ "  |  _ <| |___| |_| | |  _ < | |  \\ V / | |___|  _ < \n"
		+ "  |_| \\_\\_____|____/  |_| \\_\\___|  \\_/  |_____|_| \\_\\\n"
		+ "                                                   \n"
		+ "         ____ ___   ___  ____  _____ ____      _  _____ _____     _______ \n"
		+ "        / ___/ _ \\ / _ \\|  _ \\| ____|  _ \\    / \\|_   _|_ _\\ \\   / / ____|\n"
		+ "       | |  | | | | | | | |_) |  _| | |_) |  / _ \\ | |  | | \\ \\ / /|  _|  \n"
		+ "       | |__| |_| | |_| |  __/| |___|  _ <  / ___ \\| |  | |  \\ V / | |___ \n"
		+ "        \\____\\___/ \\___/|_|   |_____|_| \\_\\/_/   \\_\\_| |___|  \\_/  |_____|\n"
		+ "\n"
		+ "︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿\n");
	}
	
	public void help() {
		System.out.println(" At the prompt enter the number for the function "
		+ "you need to perform:\n\n"
		+ "  " + ENROLL_MEMBER + ": Enroll a member.\t\t" + REMOVE_MEMBER + ": Remove a member.\n"
		+ "  " + ADD_PRODUCT + ": Add a product.\t\t" + CHECKOUT + ": Check out a memeber's items.\n"
		+ "  " + PROCESS_SHIPMENT + ": Process Shipment.\t\t" + CHANGE_PRICE + ": Change price.\n"
		+ "  " + RETRIEVE_PRODUCT_INFO + ": Retrieve product info.\t" + RETRIEVE_MEMBER_INFO + ": Retrieve member info.\n"
		+ "  " + PRINT_TRANSACTIONS + ": Print Transactions.\t" + LIST_OUTSTANDING_ORDERS + ": List all outstanding orders.\n"
		+ "  " + LIST_ALL_MEMBERS + ": List all members.\t\t" + LIST_ALL_PRODUCTS + ": List all products.\n"
		+ "  " + SAVE + ": Save.\t\t\t" + HELP + ": Help.\n"
		+ "  " + EXIT + ": Exit."
		);
	}
	
	private void mainMenu() {
		int selection;
		logo();
		help();
		
	}
	
    public int getCommand() {
        do {
            try {
                int value = Integer.parseInt(getToken("Enter command:" + HELP + " for help"));
                if (value >= EXIT && value <= HELP) {
                    return value;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Enter a number");
            }
        } while (true);
    }
    
    public String getToken(String prompt) {
        do {
            try {
                System.out.println(prompt);
                String line = reader.readLine();
                StringTokenizer tokenizer = new StringTokenizer(line, "\n\r\f");
                if (tokenizer.hasMoreTokens()) {
                    return tokenizer.nextToken();
                }
            } catch (IOException ioe) {
                System.exit(0);
            }
        } while (true);
    }

}
