package com.myapp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Extract user data from request
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");

        // Here, implement your logic to store user information.
        // For example, you might connect to a database and store the user details.

        // After registration logic, you can redirect the user to the login page or a success page.
        response.sendRedirect("login.jsp"); // Redirect to login on successful registration
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Simply forward the request to the registration page (register.jsp)
        request.getRequestDispatcher("/register.jsp").forward(request, response);
    }
}
