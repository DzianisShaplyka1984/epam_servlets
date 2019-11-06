package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResourseServlet extends HttpServlet {
    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");

        String message = "";

        message = "You could use this resource ";

        PrintWriter writer = resp.getWriter();
        writer.print("<html><body>" + message + "</body></html>");
    }
}
