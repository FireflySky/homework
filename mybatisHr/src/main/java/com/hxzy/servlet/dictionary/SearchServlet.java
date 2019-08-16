package com.hxzy.servlet.dictionary;

import com.alibaba.fastjson.JSONObject;
import com.hxzy.common.vo.ResultVO;
import com.hxzy.entity.DataDictionary;
import com.hxzy.service.DataDictionaryService;
import com.hxzy.service.impl.DataDictionaryServiceImpl;
import com.hxzy.vo.DataDirectorySearchVO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * @author wy
 * @date 2019-08-13 16:51
 * @comment 数据字典查询
 */
@WebServlet(urlPatterns = "/disc/search")
public class SearchServlet extends HttpServlet {

    //显示页面
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/template/dict/list.ftl").forward(req, resp);
    }

    //ajax请求数据
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //得到id
        int typeId = Integer.parseInt(req.getParameter("typeId"));
        int offset = Integer.parseInt(req.getParameter("offset"));
        int limit = Integer.parseInt(req.getParameter("limit"));

/*        //实例化这个类，调用service方法
        List<DataDictionary> arr = new ArrayList<DataDictionary>();
        for (int i = 1; i <= 10; i++) {
            DataDictionary dt = new DataDictionary();
            dt.setId(i);
            dt.setName(UUID.randomUUID().toString());
            dt.setTypeId(typeId);
            dt.setStatus(1);
            arr.add(dt);
        }*/
        DataDictionaryService service=new DataDictionaryServiceImpl();
        ResultVO result = service.dataDictionaryPage(typeId,offset,limit);

        //生成前端需要的结果,boostrap-table必须要返回这种格式 {"total":多少笔,  rows:[]}
        JSONObject json = new JSONObject();

        //输出给前端，不允许重定向，不允许转发
        PrintWriter out = resp.getWriter();
        out.println(json.toJSONString(result));
        out.flush();
        out.close();

    }
}
