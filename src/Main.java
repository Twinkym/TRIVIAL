import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;

public class Main {

    List<Boolean> respuestas = new ArrayList<>();
    HashMap<String,List<Pregunta> > tematicas = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("Hola amigos :) let's play a Trivia game !!!!! " );

        List<Pregunta> preguntas = buildPreguntasList();

        System.out.println("las preguntas son: " + preguntas);
        int contador = showPreguntas(preguntas);

        showStatistics(preguntas);

        System.out.println(contador);

    }



    private static List<Pregunta> buildPreguntasList() {
        List<Pregunta> preguntas = new ArrayList<>();

        preguntas.add(new Pregunta("¿Java es un lenguaje tipado?  ", true, 5));
        preguntas.add(new Pregunta("¿Se pueden hacer aplicaciones móviles con Java? ", true, 5));
        preguntas.add(new Pregunta(" ¿No se puede crear vídeo juegos con Java?  ", false, 2));
        preguntas.add(new Pregunta(" ¿Java es un lenguaje POO?  ", true, 5));
        preguntas.add(new Pregunta(" ¿El lenguaje Java fue comercializado en 1998?  ", false, 2));

        return preguntas;
    }

    private static int showPreguntas(List<Pregunta> preguntas) {

        int aciertos = 0;

        for (int i = 0; i < preguntas.size() ; i++) {
            Pregunta currentPregunta = preguntas.get(i);

            System.out.println(currentPregunta.getPregunta());

            System.out.println("T/F?");
            Scanner sc = new Scanner(System.in);
            String option = sc.nextLine();

            boolean respuestaUsuario = option.equalsIgnoreCase("T");

            currentPregunta.setRespuestaUsuario(respuestaUsuario);

           /* if (respuestaUsuario == currentPregunta.isRespuesta()){
                System.out.println("respuesta correcta");
                contador++;

            }
            else {
                System.out.println("Nice try ;-)");
            }*/

        }

        return  aciertos;

    }

    private static void showStatistics(List<Pregunta> preguntasconRespuestas) {

        int puntuacionTotal = 0;
        
        for (Pregunta currentPregunta : preguntasconRespuestas) {

            System.out.println(currentPregunta.getPregunta());

            puntuacionTotal = procesarPregunta(puntuacionTotal, currentPregunta);
        }

        System.out.println("The final score is: " + puntuacionTotal);

    }

    private static int procesarPregunta(int puntuacionTotal, Pregunta currentPregunta) {
        if (currentPregunta.isRespuestaUsuario() == currentPregunta.isRespuestaValida()) {
            System.out.println("Respuesta correcta!!");
            puntuacionTotal = puntuacionTotal + currentPregunta.getPuntuacion();
        }
        else {
            System.out.println("Respuesta erronea. ");
        }

        System.out.println("Puntuación Actual " + puntuacionTotal);
        return puntuacionTotal;
    }

}


