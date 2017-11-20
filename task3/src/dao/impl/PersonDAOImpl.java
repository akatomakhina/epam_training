package dao.impl;

import dao.Connector;
import dao.PersonDAO;
import entity.Person;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonDAOImpl implements PersonDAO{
    private final String ID = "id";
    private final String USER_NAME = "name";
    private final String USER_SURNAME = "surname";
    private final String PHONE_NUMBER = "number";
    private final String EMAIL = "email";

    private Connector connector;

    public PersonDAOImpl() {
        try {
            this.connector = new Connector();
        } catch (SQLException e) {
            System.out.println("Error sql");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Error with connection");
            e.printStackTrace();
        }
    }

    @Override
    public Person findPerson(String [] args) throws SQLException {
        PreparedStatement preparedStatement;
        Person person = null;
        try {
            preparedStatement = connector.getPreparedStatement();

            preparedStatement.setString(1, args[0]);
            preparedStatement.setString(2, args[1]);

            ResultSet result = preparedStatement.executeQuery();

            person = new Person();

            result.next();
            person.setId(result.getInt(ID));
            person.setName(result.getString(USER_NAME));
            person.setSurname(result.getString(USER_SURNAME));
            person.setPhone(result.getString(PHONE_NUMBER));
            person.setEmail(result.getString(EMAIL));
        }catch (SQLException e){
            System.out.println("Error in person");
            e.printStackTrace();
        }
        return person;
    }
}
