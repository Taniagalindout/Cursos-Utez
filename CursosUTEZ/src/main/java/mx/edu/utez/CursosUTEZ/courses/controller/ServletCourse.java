package mx.edu.utez.CursosUTEZ.courses.controller;

import mx.edu.utez.CursosUTEZ.courses.model.BeanCourse;
import mx.edu.utez.CursosUTEZ.courses.model.DaoCourse;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet (name = "ServletCourse", value="/ServletCourse")
public class ServletCourse extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DaoCourse daoCourse = new DaoCourse();
        List<BeanCourse> courseList = daoCourse.findAll();
        request.setAttribute("listaCursos", courseList);
        request.getRequestDispatcher("index.jsp").forward(request, response);
        System.out.println(courseList);
    }
}
