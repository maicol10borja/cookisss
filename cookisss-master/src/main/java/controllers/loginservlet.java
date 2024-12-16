package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

//paht
@WebServlet("/login")

public class loginservlet extends HttpServlet {

    //CONTANTES NO CAMBIAN STATIC
    final static String USERNAME = "admin";
    final static String PASSWORD = "12345";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if(username.equals(USERNAME) && password.equals(PASSWORD)){

             resp.setContentType("text/html;charset=UTF-8");

                     try (PrintWriter out = resp.getWriter()){

                     out.println("<!DOCTYPE html>");
                     out.println("<html>");
                     out.println("<head>");
                     out.println("<meta charset='UTF-8'>");
                     out.println("<title>Bienvenido a la Aplicacion</title>");
                     out.println("</head>");
                     out.println("<body>");
                     out.println("<h1>Bienvenido a mi APP</h1>");
                     out.println("</body>");
                     out.println("</html>");

                 }
        }else {
            resp.sendError(HttpServletResponse.SC_UNAUTHORIZED,"LO SENTIMOS NO TIENE ACCESO");
        }
    }
}
