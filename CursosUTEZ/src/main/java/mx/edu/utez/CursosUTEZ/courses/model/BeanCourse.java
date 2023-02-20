package mx.edu.utez.CursosUTEZ.courses.model;

public class BeanCourse {
    private int id;
    private String nombreCurso;
    private String descripcion;
    private double precio;
    private String nombreProfesor;
    private boolean estado;

    public BeanCourse() {
    }

    public BeanCourse(int id, String nombreCurso, String descripcion, double precio, String nombreProfesor, boolean estado) {
        this.id = id;
        this.nombreCurso = nombreCurso;
        this.descripcion = descripcion;
        this.precio = precio;
        this.nombreProfesor = nombreProfesor;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
