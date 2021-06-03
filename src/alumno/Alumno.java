package alumno;

public class Alumno {
  private String nombre;
  private double notaMedia = 0.0;
  private int escala = 10;              // variable no se usa se debe eliminar
  
  public void AsignarNota(String nombreAlumno, double notaAsignada, int escala) {
      this.nombre = nombreAlumno;
      this.notaMedia = notaAsignada;
      this.escala = escala;
      
  }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }
  
}
