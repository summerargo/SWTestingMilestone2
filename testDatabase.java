//This is the functionality test suite

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import java.io.File;
import java.sql.Connection;


public class testDatabase {
    //Tests the connection to our database
    @Test
    public void DatabaseConnection() {
        DatabaseConnection testDB= new DatabaseConnection(new File("~/DatabaseConnection.java"));
        DatabaseConnection validConnect = new DatabaseConnection(new File("~/Database.java"));
        assertEquals(validConnect,testDB.connect());
    }

    //Tests the ReadFile Method
    @Test
    public void readDatabase(){
        ReadFromDatabase readDB = new ReadFromDatabase(new File("~/ReadFromDatabase.java"));
        DatabaseConnection validRead = new DatabaseConnection(new File("~/Database.java"));
        assertEquals(validRead,readDB.ReadFile());
    }

    //Tests the SearchThroughFile Method
    @Test
    public void searchDatabase() {
        SearchDatabase searchDB= new SearchDatabase(new File("~/SearchDatabase.java"));
        DatabaseConnection validSearch = new DatabaseConnection(new File("~/Database.java"));
        assertEquals(validSearch,searchDB.SearchThroughFile("Java"));
    }

    //Tests the AddProjectToDB Method
    @Test
    public void WriteToDatabase() {
        WriteToDatabase writeDB= new WriteToDatabase(new File("~/WriteToDatabase.java"));
        DatabaseConnection validWrite = new DatabaseConnection(new File("~/Database.java"));
        String[] validSkills = {"Java"};
        assertEquals(validWrite,writeDB.AddProjectToDB("Data Analysis", 5555, validSkills));
    }
}
