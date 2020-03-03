//This is the functional test suite

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import java.io.File;
import java.sql.Connection;


public class testDatabase {
    
    //Tests the connection to our database
    @Test
    public void testDatabaseConnection() {
        DatabaseConnection testDB= new DatabaseConnection(new File("~/DatabaseConnection.java"));
        DatabaseConnection validConnect = new DatabaseConnection(new File("~/Database.java"));
        assertEquals(validConnect, testDB.connect());
    }

    //Tests the ReadFile Method
    @Test
    public void testReadDatabase() {
        ReadFromDatabase readDB = new ReadFromDatabase(new File("~/ReadFromDatabase.java"));
        DatabaseConnection validRead = new DatabaseConnection(new File("~/Database.java"));
        validRead.connect();
        assertEquals(validRead, readDB.ReadFile());
    }

    //Tests the SearchThroughFile Method
    @Test
    public void testSearchDatabase() {
        SearchDatabase searchDB= new SearchDatabase(new File("~/SearchDatabase.java"));
        DatabaseConnection validSearch = new DatabaseConnection(new File("~/Database.java"));
        validSearch.connect();
        assertEquals(validSearch, searchDB.SearchThroughFile("Java"));
    }

    //Tests the AddProjectToDB Method
    @Test
    public void testAddProject() {
        WriteToDatabase writeDB= new WriteToDatabase(new File("~/WriteToDatabase.java"));
        DatabaseConnection validWrite = new DatabaseConnection(new File("~/Database.java"));
        validWrite.connect();
        String[] validSkills = {"Java"};
        assertEquals(validWrite, writeDB.AddProjectToDB("Data Analysis", 5555, validSkills));
    }

    //Tests the RemoveProjectToDB Method
    @Test
    public void testRemoveProject() {
        WriteToDatabase writeDB= new WriteToDatabase(new File("~/WriteToDatabase.java"));
        DatabaseConnection validWrite = new DatabaseConnection(new File("~/Database.java"));
        validWrite.connect();
        assertEquals(validWrite, writeDB.RemoveProjectFromDB(5555));
    }
}
