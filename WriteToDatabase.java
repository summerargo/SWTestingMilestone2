import java.io.File;
import java.sql.Connection;

public class WriteToDatabase {
    //Constructor
    public WriteToDatabase(File DataBase) {
    }

    //Method that adds a project to the database
    public Connection AddProjectToDB(String projectName, int projectID, String[] requiredSkills) {
        return null;
    }

    //Method that adds a course to the database
    public Connection AddCourseToDB(String courseName, int courseID, String[] prerequisites) {
        return null;
    }

    //Method that adds a student to the database
    public Connection AddStudentToDB(String studentName, int studentID, String[] skills, String classification, double GPA) {
        return null;
    }

    //Method that adds a faculty to the database
    public Connection AddEmployeeToDB(String employeeName, int employeeID, String position, Double salary) {
        return null;
    }

    //Method that removes a project from database
    public Connection RemoveProjectFromDB(int projectID) {
        return null;
    }

    //Method that removes a course from database
    public Connection RemoveCourseFromDB(int courseID) {
        return null;
    }

    //Method that removes a student from database
    public Connection RemoveStudentFromDB(int studentID) {
        return null;
    }

    //Method that removes an employee from database
    public Connection RemoveEmployeeFromDB(int employeeID) {
        return null;
    }
}
