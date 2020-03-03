import java.io.File;
import java.sql.Connection;
package org.junit.jupiter.api;



import org.junit.jupiter.api.Test;



public class testDatabase{


@Test
public void DatabaseConnection(){

DatabaseConnection testDB= new DatabaseConnection(DatabaseConnection.java);
Connection validConnect = new Connection();

assertEquals(validConnect,testDB.connect);

}


@Test

public void readDatabase(){


ReadFromDatabase readDB = new ReadFromDatabase(ReadFromDatabase.java);
Connection validRead = new Connection();
assertEquals(validRead,readDB.ReadFile);

}
 
@Test
public void searchDatabase(){

SearchDatabase searchDB= new SearchDatabase(SearchDatabase.java);
Connection validSearch = new Connection();
assertEquals(validSearch,searchDb.SearchThroughFile);


}

@Test
public void WriteToDatabase(){

WriteToDatabase writeDB= new WriteToDatabase(WriteToDatabase.java);
Connection validWrite = new Connection();
assertEquals(validWrite,writeDB.AddToDB);

}





}


