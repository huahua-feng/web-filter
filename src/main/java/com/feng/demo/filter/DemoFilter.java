package com.feng.demo.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//@Component
@WebFilter(urlPatterns = "/*", filterName = "firstFilter")
@Order(123)
public class DemoFilter implements Filter{//,Ordered{

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {
        LOGGER.info("=============11111111============");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }

//    public int getOrder() {
//        return 125;
//    }
}
