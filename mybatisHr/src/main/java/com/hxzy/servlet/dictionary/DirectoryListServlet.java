package com.hxzy.servlet.dictionary;

        import com.alibaba.fastjson.JSONObject;
        import com.hxzy.common.vo.ResultVO;
        import com.hxzy.util.CustomerDataUtil;

        import javax.servlet.ServletException;
        import javax.servlet.annotation.WebServlet;
        import javax.servlet.http.HttpServlet;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import java.io.IOException;
        import java.io.PrintWriter;

/**
 * @author yuanpeng
 * @date 2019-08-14 下午 4:59
 * @comment 得到所有的字典集合
 */
@WebServlet("/directory/findall")
public class DirectoryListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMessage("ok");
        //静态方法也叫类的方法，必须要什么  类名.静态方法名称();
        resultVO.setData(CustomerDataUtil.getListDirectoryType());

        //响应输出
        PrintWriter out = resp.getWriter();
        out.println(JSONObject.toJSONString(resultVO));
        out.flush();
        out.close();
    }
}
