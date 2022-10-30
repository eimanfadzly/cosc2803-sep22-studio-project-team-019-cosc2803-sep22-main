package helper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CTGProcessSeventeenOutcomes {

    private static final String DATABASE = "jdbc:sqlite:database/ctg.db";
    private static final String CSV_FILE = "database/PersonaAttribute.csv";
    
    public static void main (String[] args) {
        CSVLoader(CSV_FILE, DATABASE);
    }

    public static void CSVLoader(String csv_file, String DB){

        // JDBC Database Object
        Connection connection = null;

        // Like JDBCConnection, we need some error handling.
        try {
            // Open A CSV File to process, one line at a time
            // CHANGE THIS to process a different file
            Scanner lineScanner = new Scanner(new File(CSV_FILE));

            // Read the first line of "headings"
            String header = lineScanner.nextLine();
            System.out.println("Heading row" + header + "\n");

            // Setup JDBC
            // Connect to JDBC data base
            connection = DriverManager.getConnection(DATABASE);

            // Read each line of the CSV
            int row = 1;
            while (lineScanner.hasNext()) {
                // Always get scan by line
                String line = lineScanner.nextLine();
                
                // Create a new scanner for this line to delimit by commas (,)
                Scanner rowScanner = new Scanner(line);
                rowScanner.useDelimiter(",");

                // These indicies track which column we are up to
                int indexCategory = 0;
                
                // Prepare a new SQL Query & Set a timeout
                Statement statement = connection.createStatement();

                int id = rowScanner.nextInt();
                String outcomes_title = rowScanner.next();
                

                // Create Insert Statement
                String query = "INSERT into SeventeenOutcomes VALUES ("
                    + id + "," + "'" + outcomes_title + "'" + ")";

                // Execute the INSERT
                System.out.println("Executing: " + query);
                statement.execute(query);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

    

