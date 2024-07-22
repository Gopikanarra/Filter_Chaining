import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

@WebFilter("/DemoFilter")
public class LogFilter extends HttpFilter implements Filter {
    public LogFilter() {
        super();
        System.out.println();
        
    }
    public void init(FilterConfig fConfig) throws ServletException {
    	System.out.println("filter initialization!!");
    }
	public void destroy() {
System.out.println("filter deinstantiation");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		// place your code here
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.print("<h1>log filter here before response</h1>");

		// pass the request along the filter chain
		chain.doFilter(request, response);
		pw.print("<h1>log filter here during response</h1>");
	}


}
