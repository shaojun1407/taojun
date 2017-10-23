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
import javax.servlet.http.HttpServletRequest;

import com.sun.scenario.effect.impl.state.LinearConvolveRenderState.PassType;

/**
 * Servlet Filter implementation class Filterdemo
 */
@WebFilter(dispatcherTypes = { 
		DispatcherType.REQUEST, 
		DispatcherType.FORWARD, 
		DispatcherType.INCLUDE,
		DispatcherType.ERROR 
		}
, urlPatterns = { "/sevlet/MyLoginServlet2" })
public class Filterdemo implements Filter {

	/**
	 * Default constructor.
	 */
	public Filterdemo() {
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("FilterDemo destroy...");

	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("FilterDmeo destroy...");
		HttpServletRequest req = (HttpServletRequest) request;
		 //pass the request along the filter chain
		chain.doFilter(request, response);
		//System.out.println("拦截了请求： " + req.getRequestURL().toString());
		System.out.println("FilterDmeo doFIlter 执行结束...");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("FilterDemo init...");
	}

}
