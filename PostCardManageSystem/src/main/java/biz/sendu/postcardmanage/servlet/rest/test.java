package biz.sendu.postcardmanage.servlet.rest;

import sun.net.httpserver.HttpServerImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by parkjaesung on 2016. 8. 11..
 */
public class test extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet");

        PrintWriter pw = resp.getWriter();

        pw.write("test");
    }
}
