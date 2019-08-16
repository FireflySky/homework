package com.hxzy.servlet.init;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

/**
 * @author wy
 * @date 2019-08-13 15:38
 * @comment tomcat一启就要启动
 */
public class InitServlet extends HttpServlet {

    private Logger log = LogManager.getLogger(this.getClass());

    @Override
    public void init(ServletConfig config) throws ServletException {
        ServletContext application = config.getServletContext();
        //取得项目名称
        String applicationName = application.getContextPath();
        log.info("项目名称：" + applicationName);
        System.out.println("applicationName:"+applicationName);
        application.setAttribute("ctx", applicationName);
    }
}
