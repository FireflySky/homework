package com.hxzy.servlet.role;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author wy
 * @date 2019-08-13 14:23
 * @comment 查询servlet
 */
@WebServlet(urlPatterns = "/role/search")
public class SearchServlet extends HttpServlet {

    // 显示页面
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    // 页面前端框架来使用ajax来请求数据.响应结果
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
