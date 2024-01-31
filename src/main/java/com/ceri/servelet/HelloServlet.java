package com.ceri.servelet;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

public class HelloServlet extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        PrintWriter ou = response.getWriter();
        ou.println("hello world from servlet");
    }

}