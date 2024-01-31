package com.ceri.servelet;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

public class HelloServlet extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        PrintWriter ou = response.getWriter();
        //question 3
        String parameter = request.getParameter("name");
        if(parameter == null)
            ou.println("hello world from servlet, no parameter yet");
        else
            ou.println("hello world from servlet, your name is : " + parameter);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        PrintWriter ou = response.getWriter();
        ////question 4
        String parameterNom = request.getParameter("nom");
        String parameterPrenom = request.getParameter("prenom");
        if(parameterNom == null && parameterPrenom == null)
            ou.println("hello world from servlet, no parameter yet");
        else
            ou.println("hello world from servlet, POST method, ton nom : " + parameterNom + " et ton prénom : " + parameterPrenom);
    }


}