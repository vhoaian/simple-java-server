package com.vohoaian.hellojetty;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import com.vohoaian.hellojetty.HelloServlet;

public class Main {
 
    public static void main(String[] args) throws Exception {
 
        Server server = new Server(8080);
        ServletContextHandler handler = new ServletContextHandler(server, "/");
        handler.addServlet(HelloServlet.class, "/");
        server.start(); 
    }
 
}
