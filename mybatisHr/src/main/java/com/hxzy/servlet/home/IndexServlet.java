package com.hxzy.servlet.home;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author wy
 * @date 2019-08-13 15:45
 * @comment 首页报表
 */
@WebServlet(urlPatterns = "/manage/home")
public class IndexServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("tips", "这是freemarker传的值");
        req.getRequestDispatcher("/WEB-INF/template/home/index.ftl").forward(req, resp);
    }
}
