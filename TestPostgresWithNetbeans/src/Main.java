/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Panagiotis
 */
import java.sql.*;
import java.util.Arrays;
import java.util.Properties;

public class Main {
    public static void main(String arg[]) {
        System.out.println("Hello.\nSome connection to PostgreSQL database tests with NetBeans.");
        // ΠΡΟΣΟΧΗ! ΓΙΑ ΣΥΝΔΕΣΗ ΣΤΗ ΒΔ POSTGRESQL ΤΗΣ ΣΧΟΛΗΣ ΠΡΕΠΕΙ ΝΑ ΣΥΝΔΕΘΟΥΜΕ ΣΤΟ VPN
        // Η ΔΗΜΙΟΥΡΓΙΑ ΤΩΝ ΠΙΝΑΚΩΝ ΚΑΙ Η ΕΙΣΑΓΩΓΗ ΛΙΓΩΝ ΔΕΔΟΜΕΝΩΝ ΓΙΝΕΤΑΙ ΜΕ ΕΚΤΕΛΕΣΗ ΤΟΥ ΑΡΧΕΙΟΥ: CreateTables.sql ΣΤΗΝ PostgreSQL ΒΑΣΗ ΚΑΙ ΟΧΙ ΑΠΟ ΕΔΩ.
        final String myDB = "**********"; // ΤΟ ΟΝΟΜΑ ΤΗΣ ΒΑΣΗΣ ΜΑΣ ΕΔΩ (ΕΙΝΑΙ ΙΔΙΟ ΜΕ ΤΟ USERNAME ΤΟΥ APPS)";
        final String url = "jdbc:postgresql://dblabs.iee.ihu.gr:5432/" + myDB ;
        final Properties props = new Properties();
        props.setProperty("user", "**********"); // ΤΟ USERNAME ΜΑΣ ΣΤΟ APPS ΕΔΩ
        props.setProperty("password", "**********"); // ΤΟΝ ΚΩΔΙΚΟ ΠΡΟΣΒΑΣΗΣ ΣΤΗΝ ΒΔ ΜΑΣ ΕΔΩ(ΟΧΙ ΤΟΝ ΚΩΔΙΚΟ ΤΟΥ APPS). ΠΡΟΣΟΧΗ! Ο ΚΩΔΙΚΟΣ ΔΕΝ ΕΙΝΑΙ ΜΥΣΤΙΚΟΣ. ΑΝ ΚΑΠΟΙΟΣ ΑΝΟΙΞΕΙ ΤΟΝ ΚΩΔΙΚΑ ΜΠΟΡΕΙ ΝΑ ΤΟΝ ΔΙΑΒΑΣΕΙ
        props.setProperty("ssl", "prefer");
        props.setProperty("sslcert", "<STORAGE_DIR>/.postgresql/postgresql.crt");
        props.setProperty("sslkey", "<STORAGE_DIR>/.postgresql/postgresql.key");
        try (Connection conn = DriverManager.getConnection(url, props)) {
            System.out.print("Connected succefully to: ");  //This is getting printed
            System.out.println(conn.getMetaData().getDatabaseProductVersion());
            System.out.println();
            // Οδηγίες εδώ: https://tembo.io/docs/getting-started/postgres_guides/connecting-to-postgres-with-java
            System.out.print("Give a country: ");
            String givenCountry = UserInput.getString();           
            Statement statement4Countries = conn.createStatement();
            System.out.print("Give a city: ");
            String givenCity = UserInput.getString();           
            Statement statement4Cities = conn.createStatement();
            System.out.println("Query results for given entries are: ");
            ResultSet countryResultSet = statement4Countries.executeQuery("SELECT * FROM tCountries WHERE fCountryName = '" + givenCountry + "'");
//            ResultSet countryResultSet = statement4Countries.executeQuery("SELECT * FROM tCountries");
            ResultSet cityResultSet = statement4Cities.executeQuery("SELECT tCities.fCityID, tCities.fCityName, tCountries.fCountryName AS fCountryName "
                    + "FROM tCities JOIN tCountries ON tCities.fCountryID = tCountries.fCountryID WHERE tCities.fCityName = '" + givenCity + "'");
            while (countryResultSet.next()) {
                Integer fCountryID = countryResultSet.getInt("fCountryID");
                String  fCountryName = countryResultSet.getString("fCountryName");
                System.out.println("Country ID: " + fCountryID + ", Country name: " + fCountryName);
            }
            System.out.println();
            while (cityResultSet.next()) {
                Integer fCityID = cityResultSet.getInt("fCityID");
                String fCountryName = cityResultSet.getString("fCountryName");
                String fCityName = cityResultSet.getString("fCityName");
                System.out.println("City ID: " + fCityID + ", City name: " + fCityName + ", Country name: " + fCountryName);
            }
            countryResultSet.close();
            cityResultSet.close();
            statement4Countries.close();
            statement4Cities.close();
        } catch(SQLException e) {
            System.out.println("Error connecting to database " + Arrays.toString(e.getStackTrace()));
        }
         
    }
    
}
