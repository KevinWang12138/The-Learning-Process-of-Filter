package FilterPackage;

import javax.servlet.*;
import java.io.IOException;

public class AFilter implements Filter {
    /**
     * 在Filter创建后立即调用，用来初始化
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器出生");
    }

    /**
     * 每次过滤时都会执行
     */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("AFilter Start");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("AFilter End");
    }

    /**
     * 在Filter销毁前调用，用来对非内存资源进行释放
     */
    @Override
    public void destroy() {
        System.out.println("要死了");
    }
}
