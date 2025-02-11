package org.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.*;

public class MyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Получаем данные из формы
        String message = request.getParameter("message");

        // Выводим ответ
        out.println("<html><body>");
        out.println("<h1>Вы отправили: " + message + "</h1>");
        out.println("</body></html>");
    }
}
