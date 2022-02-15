import java.util.Objects;

public class Pregunta {

    private String pregunta;
    private boolean respuesta;

    public boolean isRespuesta() {
        return respuesta;
    }

    public Pregunta(String pregunta, boolean respuesta) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }

    public String getPregunta() {
        return pregunta;
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
