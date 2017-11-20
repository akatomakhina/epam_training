package controller;

import entity.Person;
import service.PersonService;
import service.ServiceFactory;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontController extends HttpServlet {
    private final String USER_NAME = "name";
    private final String USER_SURNAME = "surname";
    private final String PERSON = "person";
    private final String PAGE = "/result.jsp";


    private String[] args = new String[2];

    ServiceFactory serviceFactory = ServiceFactory.getInstance();

    PersonService service = serviceFactory.getPersonService();

    Person person;


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter(USER_NAME);
        String surname = request.getParameter(USER_SURNAME);

        args[0] = name;
        args[1] = surname;

        try {
            person = service.findPerson(args);
            request.setAttribute(PERSON, person);
            request.getRequestDispatcher(PAGE).forward(request, response);
        } catch (SQLException e) {
            System.out.println("Error in forward");
            e.printStackTrace();
        }
    }
}
