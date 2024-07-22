import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/DemoFilter")
public class FirstDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public FirstDemo() {
        super();
       System.out.println("servlet loading...!");
    }
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		pw.print("<h2> i am firstdemo</h2>");
	}

	

}
