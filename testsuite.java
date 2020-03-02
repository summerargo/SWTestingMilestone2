import java.io.File;
import java.sql.Connection




public class testDatabase(){


@Test
public void DatabaseConnection(){

DatabaseConnection testDB= new DatabaseConnection(“/testPathway”);
Connection validConnect = new Connection();

assert.equals(validConnect,testDB.connect);

}


@Test

public void readDatabase(){


ReadFromDatabase readDB = new ReadFromDatabase(“/testPathway”);
Connection validRead = new Connection();
assert.equals(validRead,readDB.ReadFile);

}
 
@Test
public void searchDatabase(){

SearchDatabase searchDB= new SearchDatabase(“/testPathway”);
Connection validSearch = new Connection();
assert.equals(validSearch,searchDb.SearchThroughFile)


}

@Test
public void WriteToDatabase(){

WriteToDatabase writeDB= new WriteToDatabase(“/testPathway”);
Connection validWrite = new Connection();
assert.equals(validWrite,writeDB.AddToDB);

}





}


