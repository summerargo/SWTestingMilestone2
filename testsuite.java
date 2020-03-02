import java.io.File;
import java.sql.Connection




public class testDatabase(){


@Test
public void DatabaseConnection(){

DatabaseConnection testDB= new DatabaseConnection(“DatabaseConnection.java”);
Connection validConnect = new Connection();

assert.equals(validConnect,testDB.connect);

}


@Test

public void readDatabase(){


ReadFromDatabase readDB = new ReadFromDatabase(“ReadFromDatabase.java”);
Connection validRead = new Connection();
assert.equals(validRead,readDB.ReadFile);

}
 
@Test
public void searchDatabase(){

SearchDatabase searchDB= new SearchDatabase(“SearchDatabase.java”);
Connection validSearch = new Connection();
assert.equals(validSearch,searchDb.SearchThroughFile)


}

@Test
public void WriteToDatabase(){

WriteToDatabase writeDB= new WriteToDatabase(“WriteToDatabase.java”);
Connection validWrite = new Connection();
assert.equals(validWrite,writeDB.AddToDB);

}





}


