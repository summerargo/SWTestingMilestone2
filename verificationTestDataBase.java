// This is the verification test suite

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import java.io.File;
import java.sql.Connection;


public class verifyDataBase()
{
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

        //throws an exception for searching for courses no existant
@Test(expected = NullPointerException.class)
public void noSearchedClasses()
        {
        DatabaseConnection validWrite = new DatabaseConnection(new File("~/Database.java"));
        SearchDatabase searchDB= new SearchDatabase(new File("~/SearchDatabase.java"));
        }

        //throws an exception for adding a class with the same name or i as something existing
        @Test(expected = NullPointerException.class)
        public void noMatchingClasses()
        {
        WriteToDatabase writeDB= new WriteToDatabase(new File("~/WriteToDatabase.java"));
        DatabaseConnection validWrite = new DatabaseConnection(new File("~/Database.java"));
        String[] validSkills = {"Java"};
        writeDB.AddProjectToDB("Data Analysis", 5555, validSkills);
        writeDB.AddProjectToDB("Data Analysis", 5556, validSkills);
        writeDB.AddProjectToDB("Intro to Java", 5555, validSkills);
        }

@Test(expected = NullPointerException.class)
public void noRemovableProject()
        {
        DatabaseConnection validWrite = new DatabaseConnection(new File("~/Database.java"));
        writeDB.RemoveProjectFromDB(1234);
        }

@Test(expected = NullPointerException.class)
public void noRemovableCourse()
        {
        DatabaseConnection validWrite = new DatabaseConnection(new File("~/Database.java"));
        writeDB.RemoveCourseFromDB(1234);
        }

@Test(expected = NullPointerException.class)
public void noRemovableStudent()
        {
        DatabaseConnection validWrite = new DatabaseConnection(new File("~/Database.java"));
        writeDB.RemoveStudentFromDB(1234);
        }

@Test(expected = NullPointerException.class)
public void noRemovableEmployee()
        {
        DatabaseConnection validWrite = new DatabaseConnection(new File("~/Database.java"));
        writeDB.RemoveEmployeeFromDB(1234);
        }

}