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

}
 
@Test
public void searchDatabase(){

SearchDatabase searchDB= new SearchDatabase(“/testPathway”);

}

@Test
public void WriteToDatabase(){

WriteToDatabase searchDB= new WriteToDatabase(“/testPathway”);

}





}


