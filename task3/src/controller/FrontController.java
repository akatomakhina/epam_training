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
    public FrontController() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Person person;

        response.setContentType("text/html");

        String name = request.getParameter("name");
        String surname = request.getParameter("surname");

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        PersonService service = serviceFactory.getPersonService();

        try {
            person = service.find(name, surname);
            request.setAttribute("person", person);
            request.getRequestDispatcher("/result.jsp").forward(request, response);
        } catch (SQLException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
