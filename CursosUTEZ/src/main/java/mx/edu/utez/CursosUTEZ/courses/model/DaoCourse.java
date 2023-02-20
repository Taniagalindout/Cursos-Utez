package mx.edu.utez.CursosUTEZ.courses.model;

import mx.edu.utez.CursosUTEZ.courses.util.ConnectionMySQL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DaoCourse {
    public List<BeanCourse> findAll() {
        List<BeanCourse> coursesList = new ArrayList<>();
        try (
                Connection connection = ConnectionMySQL.getConnection();
                Statement stm = connection.createStatement();
                ResultSet rs = stm.executeQuery("select id, nombreCurso, descripcion, precio, nombreProfesor, estado from cursos");

                ) {
            while (rs.next()){
                BeanCourse course = new BeanCourse();
                course.setId(rs.getInt("id"));
                course.setNombreCurso(rs.getString("nombreCurso"));
                course.setDescripcion(rs.getString("descripcion"));
                course.setPrecio(rs.getDouble("precio"));
                course.setNombreProfesor(rs.getString("nombreProfesor"));
                course.setEstado(rs.getBoolean("estado"));
                coursesList.add(course);
                System.out.println(course);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return coursesList;

    }

    public static void main(String[] args) {
        DaoCourse daoCourse = new DaoCourse();
        for (BeanCourse course: daoCourse.findAll()){
            System.out.println("DATOS");
            System.out.println(course.getId());
            System.out.println(course.getNombreCurso());
            System.out.println(course.getDescripcion());
            System.out.println(course.getPrecio());
            System.out.println(course.getNombreProfesor());
            System.out.println(course.isEstado());
        }
    }
}
