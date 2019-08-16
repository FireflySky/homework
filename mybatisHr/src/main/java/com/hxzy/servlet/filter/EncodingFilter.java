package com.hxzy.servlet.filter;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author wy
 * @date 2019-08-13 14:44
 * @comment 编码格式过滤
 */
public class EncodingFilter implements Filter {
    private String encoding = "UTF-8";

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        if (StringUtils.isNoneBlank(filterConfig.getInitParameter("encoding"))) {
            this.encoding = filterConfig.getInitParameter("encoding").trim();
        }
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;
        req.setCharacterEncoding(this.encoding);
        resp.setCharacterEncoding(this.encoding);
        //请求地址
        String url = req.getRequestURI();

        // 提交的时候允许设定编码格式,为何只能post，不对get设定(  css, js)
        String method = req.getMethod();
        if (method.equalsIgnoreCase("POST")) {
            resp.setContentType("text/html;charset=" + this.encoding);
        } else if (url.contains(".js")) {
            //解决js文件的中文字
            resp.setContentType("text/html;charset=" + this.encoding);
        }

        //放行
        filterChain.doFilter(req, resp);

    }

    @Override
    public void destroy() {
        this.encoding = null;
    }
}
