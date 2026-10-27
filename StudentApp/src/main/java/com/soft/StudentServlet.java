package com.soft;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class StudentServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        String name = request.getParameter("studentName");

        try (PrintWriter out = response.getWriter()) {
            out.println("<html><body>");
            out.println("<h2>Student Registered Successfully!</h2>");
            out.println("<p>Student Name: "
                    + escapeHtml(name) + "</p>");
            out.println("</body></html>");
        }
    }

    private String escapeHtml(String value) {
        if (value == null) {
            return "";
        }
        
        return value.replace("&", "&amp");
	}
	

}
