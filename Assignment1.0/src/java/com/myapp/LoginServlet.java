package com.myapp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Implement login logic here
        // Redirect to a dashboard or show error message
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Forward to login.jsp
        request.getRequestDispatcher("/login.jsp").forward(request, response);
    }
}