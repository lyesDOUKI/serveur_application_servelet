package com.ceri.servelet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ConfigServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        //question 8 2 eme servelet
        String paramNom = request.getParameter("nom");
        String paramPrenom = request.getParameter("prenom");
        getServletContext().setAttribute("nom", paramNom);
        getServletContext().setAttribute("prenom", paramPrenom);
        PrintWriter out = response.getWriter();
        out.println("config OK");
    }
}
