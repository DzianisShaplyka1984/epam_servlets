package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import servlet.domain.User;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        User user = new User();
        user.setName("Ivan");

        HttpSession session = req.getSession();
        session.setAttribute("user", user);

        PrintWriter writer = resp.getWriter();
        writer.print("<html><body>You sucefully log in</body></html>");
    }
}
