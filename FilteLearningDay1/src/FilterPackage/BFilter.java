package FilterPackage;

import javax.servlet.*;
import java.io.IOException;

public class BFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("BFilter Start");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("BFilter End");
    }

    @Override
    public void destroy() {

    }
}
