import java.io.File;
import java.sql.Connection;
package org.junit.jupiter.api;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;



public class testDatabase{


@Test
public void DatabaseConnection(){

DatabaseConnection testDB= new DatabaseConnection(new File("~/DatabaseConnection.java"));
Connection validConnect = new Connection();

assertEquals(validConnect,testDB.connect());

}


@Test

public void readDatabase(){


ReadFromDatabase readDB = new ReadFromDatabase(new File("~/ReadFromDatabase.java));
Connection validRead = new Connection();
assertEquals(validRead,readDB.ReadFile());

}
 
@Test
public void searchDatabase(){

SearchDatabase searchDB= new SearchDatabase(new File("~/SearchDatabase.java));
Connection validSearch = new Connection();
assertEquals(validSearch,searchDb.SearchThroughFile());


}

@Test
public void WriteToDatabase(){

WriteToDatabase writeDB= new WriteToDatabase(new File("~/WriteToDatabase.java));
Connection validWrite = new Connection();
assertEquals(validWrite,writeDB.AddToDB());

}





}


