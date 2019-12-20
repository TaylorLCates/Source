package com.improving.bootcamp;

import org.springframework.context.annotation.Bean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name = "AnnotationExample",
        description = "Example Servlet Using Annotations",
        urlPatterns = {"/AnnotationExample"}
)
public class ExampleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        out.println("<p>Hello World!</p>");
        out.println("<h1>This was way harder than it should have been</h1>");
        out.println("</body>");
        out.println("</html>");
    }


}
