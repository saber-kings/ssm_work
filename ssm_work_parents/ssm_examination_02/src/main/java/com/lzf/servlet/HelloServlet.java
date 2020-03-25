package com.lzf.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: Saber污妖王
 * TODO: 测试 Servlet
 * @UpdateUser: luanz
 * @Project: ssm_work_parents
 * @Date: 2020/3/25
 * @Package: ${PACKAGE_NAME}
 * @Version: 0.0.1
 */
public class HelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().print("崇德启智，励志博学！");
    }
}
