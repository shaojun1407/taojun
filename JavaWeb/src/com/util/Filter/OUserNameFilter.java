package com.util.Filter;

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class OUserNameFilter
 */
@WebFilter(filterName = "1", dispatcherTypes = { DispatcherType.REQUEST, DispatcherType.FORWARD, DispatcherType.INCLUDE,
		DispatcherType.ERROR }, urlPatterns = { "/EnterDemo" })
public class OUserNameFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public OUserNameFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("UsernameFiler 过滤器销毁......");

	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		// pass the request along the filter chain
		System.out.println("UserNameFilter 过滤器执行中......");
		String uname = request.getParameter("username");
		if (uname != null && !"".equals(uname)) {
			System.out.println("UserNameFilter放行，即将进入下一个过滤器...");
			chain.doFilter(request, response);
			System.out.println("UserNameFilter 过滤器执行结束！");
		} else {
			HttpServletResponse hr = (HttpServletResponse) response;
			hr.sendRedirect("/JavaWeb/filter/loginUserNameLost.html");
		}

	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("UserNameFilter 过滤器初始化......");
	}

}
