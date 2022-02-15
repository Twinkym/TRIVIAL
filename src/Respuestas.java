public class Respuestas {
    private boolean respuesta;

    public Respuestas(boolean respuesta) {
        this.respuesta = respuesta;
    }

    public boolean isRespuesta() {
        return respuesta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Respuestas that = (Respuestas) o;

        return respuesta == that.respuesta;
    }

    @Override
    public String toString() {
        return "Respuestas " +
                "respuesta= " + respuesta + "\n"
                ;
    }

    //    @Override
//    public int hashCode() {
//        return (respuesta ? 1 : 0);
//    }
}
