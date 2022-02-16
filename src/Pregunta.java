import java.util.Objects;

public class Pregunta {

    private String pregunta;
    private boolean respuestaCorrecta;
    private boolean respuestaUsuario;
    private int puntuacion;

    public Pregunta(String pregunta, boolean respuestaCorrecta, int puntuacion) {
        this.pregunta = pregunta;
        this.respuestaCorrecta = respuestaCorrecta;
        this.respuestaUsuario = false;
        this.puntuacion = puntuacion;

    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public void setRespuestaCorrecta(boolean respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public void setRespuestaUsuario(boolean respuestaUsuario) {
        this.respuestaUsuario = respuestaUsuario;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getPregunta() {
        return pregunta;
    }

    public boolean isRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public boolean isRespuestaUsuario() {
        return respuestaUsuario;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pregunta pregunta1 = (Pregunta) o;
        return respuestaCorrecta == pregunta1.respuestaCorrecta && respuestaUsuario == pregunta1.respuestaUsuario && puntuacion == pregunta1.puntuacion && Objects.equals(pregunta, pregunta1.pregunta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pregunta, respuestaCorrecta, respuestaUsuario, puntuacion);
    }
}