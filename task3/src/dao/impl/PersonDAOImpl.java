package dao.impl;

import dao.Connector;
import dao.PersonDAO;
import entity.Person;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonDAOImpl implements PersonDAO{
    private Connector connector;

    public PersonDAOImpl() {
        try {
            this.connector = new Connector();
        } catch (SQLException e) {
            System.out.println("Error");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }

    public PersonDAOImpl(Connector connector){
        this.connector = connector;
    }

    public void close() throws SQLException {
        connector.closeConnection();
    }

    @Override
    public Person find(String ... args) throws SQLException {
        PreparedStatement preparedStatement = null;
        Person person = null;
        try {
            preparedStatement = connector.getPreparedStatement();
            preparedStatement.setString(1, args[0]);
            preparedStatement.setString(2, args[1]);
            ResultSet resultSet = preparedStatement.executeQuery();

            person = new Person();

            resultSet.next();
            person.setId(resultSet.getInt(1));
            person.setName(resultSet.getString(2));
            person.setSurname(resultSet.getString(3));
            person.setPhone(resultSet.getString(4));
            person.setEmail(resultSet.getString(5));
        }catch (SQLException e){
            System.out.println("Error");
            e.printStackTrace();
        }finally{
            this.closePreparedStatement(preparedStatement);
        }
        return person;
    }

    private void closePreparedStatement(PreparedStatement preparedStatement) {
        connector.closePreparedStatement(preparedStatement);
    }
}
