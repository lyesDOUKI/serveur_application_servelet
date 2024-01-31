package com.ceri.servelet;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

public class HelloServlet extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        PrintWriter ou = response.getWriter();
        String parameter = request.getParameter("name");
        if(parameter == null)
            ou.println("hello world from servlet, no parameter yet");
        else
            ou.println("hello world from servlet, your name is : " + parameter);
    }

}