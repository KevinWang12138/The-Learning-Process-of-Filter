package ServletPackage;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse rsp)throws ServletException, IOException {
        System.out.println("BServlet()...");
        req.getRequestDispatcher("/AServlet").forward(req,rsp);
    }
}
