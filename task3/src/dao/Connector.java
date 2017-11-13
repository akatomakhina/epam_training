package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Connector {
    private Connection connector;

    public Connector() throws SQLException, ClassNotFoundException {
        try {
            //DriverManager.getDriver("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.jdbc.Driver");
            connector = DriverManager.getConnection("jdbc:mysql://hostname:3306/task3", "root", "root");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver wasn't found");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Is not connected");
            e.printStackTrace();
        }
    }

    public PreparedStatement getPreparedStatement() throws SQLException {
        if (connector != null) {
            PreparedStatement preparedStatement = connector.prepareStatement("SELECT * FROM users WHERE name = ? and surname = ?;");
            if (preparedStatement != null) {
                return preparedStatement;
            }
        }
        throw new SQLException("Connection or PreparedStatement is null");
    }

    public void closePreparedStatement(PreparedStatement preparedStatement) {
        if (preparedStatement != null) {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                System.out.println("Prepared statement is null ");
                e.printStackTrace();
            }
        }
    }

    public void closeConnection() throws SQLException {
        connector.close();
    }
}
