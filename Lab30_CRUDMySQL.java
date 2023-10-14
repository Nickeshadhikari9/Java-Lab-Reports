import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Lab30_CRUDMySQL {
    private static final String JDBC_URL = "jdbc:mysql://localhost/test";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "";

    public static void main(String[] args) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
            System.out.println("Connected to the database");

            // Create a table
            createTable(connection);

            // Insert data
            insertData(connection, 1, "Nikesh");
            insertData(connection, 2, "Chandra");

            // Read data
            System.out.println("Reading data:");
            readData(connection);

            // Update data
            updateData(connection, 1, "Rojan");

            // Read data after update
            System.out.println("Reading data after update:");
            readData(connection);

            // Delete data
            deleteData(connection, 2);

            // Read data after delete
            System.out.println("Reading data after delete:");
            readData(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void createTable(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        String createTableSQL = "CREATE TABLE IF NOT EXISTS users (id INT PRIMARY KEY, name VARCHAR(255))";
        statement.executeUpdate(createTableSQL);
        statement.close();
    }

    private static void insertData(Connection connection, int id, String name) throws SQLException {
        String insertSQL = "INSERT INTO users (id, name) VALUES (?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);
        preparedStatement.setInt(1, id);
        preparedStatement.setString(2, name);
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    private static void readData(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM users");
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            System.out.println("ID: " + id + ", Name: " + name);
        }
        resultSet.close();
        statement.close();
    }

    private static void updateData(Connection connection, int id, String name) throws SQLException {
        String updateSQL = "UPDATE users SET name = ? WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(updateSQL);
        preparedStatement.setString(1, name);
        preparedStatement.setInt(2, id);
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    private static void deleteData(Connection connection, int id) throws SQLException {
        String deleteSQL = "DELETE FROM users WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(deleteSQL);
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }
}
