package by.katomakhina.task3dot3.controller;

import by.katomakhina.task3dot3.controller.util.ListOutputHelper;
import by.katomakhina.task3dot3.controller.util.Paginator;
import by.katomakhina.task3dot3.controller.validator.PageParamValidator;
import by.katomakhina.task3dot3.dao.parse.CommandName;
import by.katomakhina.task3dot3.entity.Candy;
import by.katomakhina.task3dot3.service.CandyService;
import by.katomakhina.task3dot3.service.ServiceFactory;
import by.katomakhina.task3dot3.service.exception.ServiceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class FrontController extends HttpServlet {

    private static final Logger Logger = LogManager.getLogger(FrontController.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServiceFactory instance = ServiceFactory.getInstance();
        CandyService candyService = instance.getCandyService();

        String commandParam = req.getParameter("command");

        if (commandParam != null && CommandName.isContainsCommand(commandParam)) {
            try {
                List<Candy> allCandies = candyService.parse(commandParam);
                String pageParam = req.getParameter("page");
                if (PageParamValidator.isValidPageParam(pageParam, ListOutputHelper.getNumberPages(allCandies.size()))) {
                    int currentPage = Integer.parseInt(pageParam);

                    Paginator paginator = new Paginator(allCandies.size(), currentPage);

                    List<Candy> outPutCandies = allCandies.subList(ListOutputHelper.indexFirstElementOnPage(currentPage),
                            ListOutputHelper.getIndexLastElementOnPage(paginator.getContentSize(), currentPage));

                    req.setAttribute("currentPage", currentPage);
                    req.setAttribute("nextPage", paginator.getNextPage());
                    req.setAttribute("prevPage", paginator.getPreviousPage());
                    req.setAttribute("lastPage", paginator.getLastPage());
                    req.setAttribute("firstPage", paginator.getFirstPage());
                    req.setAttribute("candyList", outPutCandies);
                    req.setAttribute("command", commandParam);
                    req.getRequestDispatcher("WEB-INF/candyInfo.jsp").forward(req, resp);
                } else {
                    req.getRequestDispatcher("WEB-INF/error.jsp").forward(req, resp);
                }
            } catch (ServiceException e) {
                Logger.error(e);
            }
        } else {
            req.getRequestDispatcher("WEB-INF/error.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}