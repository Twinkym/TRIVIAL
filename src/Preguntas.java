import java.util.Objects;

public class Preguntas {
    private String pregunta;

    public Preguntas(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getPregunta() {
        return pregunta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Preguntas preguntas = (Preguntas) o;

        return Objects.equals(pregunta, preguntas.pregunta);
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
