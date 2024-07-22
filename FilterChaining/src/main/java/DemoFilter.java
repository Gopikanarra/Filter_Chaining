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
public class DemoFilter extends HttpFilter implements Filter {
    public DemoFilter() {
        super();
       
    }
    public void init(FilterConfig fConfig) throws ServletException {
    	System.out.println("filter initialisation");
    }
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		// place your code here
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.print("Demo filter before target servlet");
		
		chain.doFilter(request, response);
		pw.print("demo filter after target servlet as response!!");
		}
	public void destroy() {
		System.out.println("filter deinstantiation");
	}

}
