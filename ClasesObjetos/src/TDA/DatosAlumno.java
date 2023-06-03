package TDA;

import TDA.FechaActual;

public class DatosAlumno {

    //Parametros
    private String nombre;
    private long nControl;
    private String semestre;
    private String Periodo;
    private String carrera;

    public DatosAlumno(String nombre, long nControl, String semestre, String periodo, String carrera) {
        this.nombre = nombre;
        this.nControl = nControl;
        this.semestre = semestre;
        this.Periodo = periodo;
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getnControl() {
        return nControl;
    }

    public void setnControl(long nControl) {
        this.nControl = nControl;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getPeriodo() {
        return Periodo;
    }

    public void setPeriodo(String periodo) {
        this.Periodo = periodo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Orizaba Ver. " + FechaActual.obtenerFechaActual() + " Semestre: " + semestre + "\n" + " Nombre: " + nombre + " Numero de control: " + nControl + "\n"
                + " Carrera: " + carrera + " Periodo: " + Periodo;
    }
}
