import java.util.Objects;

public class PreguntasRespuestas {
    private String pregunta;
    private Boolean respuesta;

    public PreguntasRespuestas(String pregunta, Boolean respuesta) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public Boolean getRespuesta() {
        return respuesta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PreguntasRespuestas that = (PreguntasRespuestas) o;

        if (!Objects.equals(pregunta, that.pregunta)) return false;
        return Objects.equals(respuesta, that.respuesta);
    }

    @Override
    public String toString() {
        return "PreguntasRespuestas " +
                "pregunta=' " + pregunta + '\'' +
                ", respuesta= " + respuesta + "\n"
                ;
    }
//    @Override
//    public int hashCode() {
//        int result = pregunta != null ? pregunta.hashCode() : 0;
//        result = 31 * result + (respuesta != null ? respuesta.hashCode() : 0);
//        return result;
//    }
}
