import java.io.File;
import java.sql.Connection;

public class WriteToDatabase {
    //Constructor
    public WriteToDatabase(File file) {
    }

    //Method that adds a project to the database
    public Connection AddProjectToDB(String project_name, int project_ID, String requirements) {
        return null;
    }

    //Method that adds a course to the database
    public Connection AddCourseToDB(String course_name, int course_ID, String prerequisite) {
        return null;
    }

    //Method that adds a student to the database
    public Connection AddStudentToDB(String student_name, int student_ID, String skills[], String classification) {
        return null;
    }

    //Method that adds a faculty to the database
    public Connection AddFacultyToDB(String faculty_name, int faculty_ID, String position, Double salary) {
        return null;
    }

    //Method that removes from database
    public Connection RemoveFromDB(int ID) {
        return null;
    }
}
