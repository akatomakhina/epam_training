package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Connector {
    private Connection connector;
    private String user = "root";
    private String password = "root";
    private String connectionUrl = "jdbc:mysql://localhost:3306/data";

    public Connector() throws SQLException, ClassNotFoundException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connector = DriverManager.getConnection(connectionUrl, user, password);
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

}
