package com.lzf;

import java.io.IOException;

/**
 * @Auther:luanzhaofei@outlook.com
 * @Date:2020/3/10
 * @Description:${PACKAGE_NAME}
 * @version:1.0
 */
public class HelloServlet extends javax.servlet.http.HttpServlet {

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().print("我们从古以来，就有埋头苦干的人，有拼命硬干的人，" +
                "有为民请命的人，有舍身求法的人，……虽是等于为帝王将相作家谱的所谓“正史”" +
                "，也往往掩不住他们的光耀，这就是中国的脊梁。");
    }

}
