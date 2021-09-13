package com.vohoaian.hellojetty;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
 
import org.eclipse.jetty.http.HttpStatus;
 
public class HelloServlet extends HttpServlet {
 
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
 
        resp.setStatus(HttpStatus.OK_200);
        resp.getWriter().println("Hello world");
    }
}
 
