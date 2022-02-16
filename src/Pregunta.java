import java.util.Objects;

public class Pregunta {

    private String pregunta;
    private boolean respuestaValida;
    private boolean respuestaUsuario;
    private int puntuacion;
    private String tecnologia;


    public Pregunta(String pregunta, boolean respuestaValida, int puntuacion) {
        this.pregunta = pregunta;
        this.respuestaValida = respuestaValida;
        this.respuestaUsuario = false;
        this.puntuacion = puntuacion;
    }

    public String getPregunta() {
        return pregunta;
    }

    public boolean isRespuestaValida() {
        return respuestaValida;
    }

    public boolean isRespuestaUsuario() {
        return respuestaUsuario;
    }

    public void setRespuestaUsuario(boolean respuestaUsuario) {
        this.respuestaUsuario = respuestaUsuario;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pregunta pregunta = (Pregunta) o;

        return Objects.equals(this.pregunta, pregunta.pregunta);
    }

    @Override
    public String toString() {
        return "Preguntas " +
                "pregunta=' " + pregunta + '\'' + "\n"
                ;
    }

    @Override
    public int hashCode() {
        return tecnologia != null ? tecnologia.hashCode() : 0;
    }

//    @Override
//    public int hashCode() {
//        return pregunta != null ? pregunta.hashCode() : 0;
//    }

    //    @Override
//    public int hashCode() {
//        int result = pregunta != null ? pregunta.hashCode() : 0;
//        result = 31 * result + (respuesta != null ? respuesta.hashCode() : 0);
//        return result;
//    }
}
