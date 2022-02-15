import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hola amigos :) esto se convertirá " +
                "en un Trivial Game en un Juego del Trivial");


        List<Pregunta> preguntas = buildPreguntasList();

        System.out.println("las preguntas son: " + preguntas);
        int contador = showPreguntas(preguntas);

        System.out.println(contador);

    }



    private static List<Pregunta> buildPreguntasList() {
        List<Pregunta> preguntas = new ArrayList<>();

        preguntas.add(new Pregunta("¿Java es un lenguaje tipado? T/F ", true));
        preguntas.add(new Pregunta("¿Se pueden hacer aplicaciones móviles con Java? T/F ", true));
        preguntas.add(new Pregunta(" ¿No se puede crear vídeo juegos con Java? T/F ", false));
        preguntas.add(new Pregunta(" ¿Java es un lenguaje POO? T/F ", true));
        preguntas.add(new Pregunta(" ¿El lenguaje Java fue comercializado en 1998? T/F ", false));

        return preguntas;
    }

    private static int showPreguntas(List<Pregunta> preguntas) {

        int contador = 0;

        for (int i = 0; i < preguntas.size() ; i++) {
            Pregunta currentPregunta = preguntas.get(i);

            System.out.println(currentPregunta.getPregunta());

            System.out.println("T/F?");
            Scanner sc = new Scanner(System.in);
            String option = sc.nextLine();

            boolean respuestaUsuario = option.equalsIgnoreCase("T");

            if (respuestaUsuario == currentPregunta.isRespuesta()){
                System.out.println("respuesta correcta");
                contador++;

            }
            else {
                System.out.println("Nice try ;-)");
            }

        }

        return  contador;

    }
}


