import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Lab30_CRUDMySQL {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/java_report";
    private static final String USER = "root";
    private static final String PASSWORD = "0000";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD)) {
            createTable(connection);
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("""
                    \nCRUD Operations Menu:
                    1. Create
                    2. Read
                    3. Update
                    4. Delete
                    5. Exit """);
                    System.out.print("Enter your chooice:");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        createRecord(connection, scanner);
                        break;
                    case 2:
                        readRecords(connection);
                        break;
                    case 3:
                        updateRecord(connection, scanner);
                        break;
                    case 4:
                        deleteRecord(connection, scanner);
                        break;
                    case 5:
                        System.out.println("Exiting program...");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createTable(Connection connection) throws SQLException {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS student (" +
                "Reg_no INT AUTO_INCREMENT PRIMARY KEY," +
                "name VARCHAR(55)," +
                "age INT," +
                "salary DOUBLE)";
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(createTableSQL);
            System.out.println("Table created or already exists.");
        }
    }

    private static void createRecord(Connection connection, Scanner scanner) throws SQLException {
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter name(use _ for space): ");
        String name = scanner.next();

        String insertSQL = "INSERT INTO student (name, age, salary) VALUES (?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, age);
            preparedStatement.setDouble(3, salary);

            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println(rowsAffected + " record(s) inserted.");
        }
    }

    private static void readRecords(Connection connection) throws SQLException {
        String selectSQL = "SELECT * FROM student";

        try (Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(selectSQL)) {

            while (resultSet.next()) {
                int id = resultSet.getInt("Reg_no");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                double salary = resultSet.getDouble("salary");

                System.out.println("Reg_no: " + id + ", Name: " + name + ", Age: " + age + ", Salary: " + salary);
            }
        }
    }

    private static void updateRecord(Connection connection, Scanner scanner) throws SQLException {
        System.out.print("Enter the Reg_no of the record to update: ");
        int id = scanner.nextInt();
        System.out.print("Enter 1 for age, 2 for salary, 3 for name:");
        int choice = scanner.nextInt();
    
        String updateSQL = null; 
    
        switch (choice) {
            case 1:
                System.out.print("Enter new age: ");
                int newAge = scanner.nextInt();
                updateSQL = "UPDATE student SET age = ? WHERE Reg_no = ?";
                try (PreparedStatement preparedStatement = connection.prepareStatement(updateSQL)) {
                    preparedStatement.setDouble(1, newAge);
                    preparedStatement.setInt(2, id);
                    executeUpdate(preparedStatement, id);
                }
                break;
    
            case 2:
                System.out.print("Enter new salary: ");
                double newSalary = scanner.nextDouble();
                updateSQL = "UPDATE student SET salary = ? WHERE Reg_no = ?";
                try (PreparedStatement preparedStatement = connection.prepareStatement(updateSQL)) {
                    preparedStatement.setDouble(1, newSalary);
                    preparedStatement.setInt(2, id);
                    executeUpdate(preparedStatement, id);
                }
                break;
    
            case 3:
                System.out.print("Enter new name (use _ for space): ");
                String newName = scanner.next();
                updateSQL = "UPDATE student SET name = ? WHERE Reg_no = ?";
                try (PreparedStatement preparedStatement = connection.prepareStatement(updateSQL)) {
                    preparedStatement.setString(1, newName);
                    preparedStatement.setInt(2, id);
                    executeUpdate(preparedStatement, id);
                }
                break;
    
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
    
    private static void executeUpdate(PreparedStatement preparedStatement, int id) throws SQLException {
        int rowsAffected = preparedStatement.executeUpdate();
        if (rowsAffected > 0) {
            System.out.println(rowsAffected + " record(s) updated.");
        } else {
            System.out.println("Record with Reg_no " + id + " not found.");
        }
    }
    

    private static void deleteRecord(Connection connection, Scanner scanner) throws SQLException {
        System.out.print("Enter the Reg_no of the record to delete: ");
        int id = scanner.nextInt();
        String deleteSQL = "DELETE FROM student WHERE Reg_no = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(deleteSQL)) {
            preparedStatement.setInt(1, id);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println(rowsAffected + " record(s) deleted.");
            } else {
                System.out.println("Record with Reg_no " + id + " not found.");
            }
        }
    }
}
