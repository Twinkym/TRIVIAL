import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hola amigos :) esto se convertirá " +
                "en un Trivial Game en un Juego del Trivial");


        List<Pregunta> preguntas = buildPreguntasList();

        System.out.println("las preguntas son: " + preguntas);
        int contadorPuntuacion = showPreguntasyPuntuacion(preguntas);


        System.out.println(contadorPuntuacion);

    }


    private static List<Pregunta> buildPreguntasList() {
        List<Pregunta> preguntas = new ArrayList<>();

        preguntas.add(new Pregunta("¿Java es un lenguaje tipado? T/F ", true, 5));
        preguntas.add(new Pregunta("¿Se pueden hacer aplicaciones móviles con Java? T/F ", true, 5));
        preguntas.add(new Pregunta(" ¿No se puede crear vídeo juegos con Java? T/F ", false, 5));
        preguntas.add(new Pregunta(" ¿Java es un lenguaje POO? T/F ", true, 5));
        preguntas.add(new Pregunta(" ¿El lenguaje Java fue comercializado en 1998? T/F ", false, 5));

        return preguntas;
    }

    private static int showPreguntasyPuntuacion(List<Pregunta> preguntas) {

        int contadorPuntuacion = 0;

        for (int i = 0; i < preguntas.size(); i++) {
            Pregunta currentPregunta = preguntas.get(i);

            System.out.println(currentPregunta.getPregunta());

            System.out.println("T/F?");
            Scanner sc = new Scanner(System.in);
            String option = sc.nextLine();

            boolean respuestaUsuario = option.equalsIgnoreCase("T");

            currentPregunta.setRespuestaUsuario(respuestaUsuario);

            if (respuestaUsuario == currentPregunta.isRespuestaCorrecta()) {
                System.out.println("Felicidades! Has acertado");
            }
            else {
                System.out.println("Nice try ;-)");
            }



            if (respuestaUsuario == currentPregunta.isRespuestaCorrecta()) {
                System.out.println("respuesta correcta");
                contadorPuntuacion = contadorPuntuacion++;


            } else {
                System.out.println("Nice try ;-)");
            }
            System.out.println("Su puntuación es: ");

        }

        int puntuacionTotal = 0;
        int contadorPreguntasAcertadas = 0;

        for (int i = 0; i < preguntas.size(); i++) {
            Pregunta currentPregunta = preguntas.get(i);
            if( currentPregunta.isRespuestaUsuario()
                    == currentPregunta.isRespuestaCorrecta() ) {
                System.out.println(currentPregunta.getPregunta());
                System.out.println("has acertado: ");
                puntuacionTotal = puntuacionTotal + currentPregunta.getPuntuacion();
                contadorPreguntasAcertadas++;
            }
        }

        System.out.println("has acertado: " + contadorPreguntasAcertadas );

        return puntuacionTotal ;

    }

}
//    private static int showEstadisticas(List<Pregunta> preguntas) {
//
//        int acumuladorPuntuacion = 0;
//
//        for (int i = 0; i < preguntas.size() ; i++) {
//            Pregunta currentPregunta = preguntas.get(i);
//            int acumuladorPuntuacion = currentPregunta.getPuntuacion();
//
//
//
//    }
//
//}
//
///*
//private static double getAveragePoints(List<Player> players) {
//
//        //return players.stream().mapToInt(PlayerClass::getNumPoints).average().getAsDouble();
//
//        double sumTotal = 0;
//
//        for (int i = 0; i < players.size(); i++) {
//
//            Player currentPlayer = players.get(i);
//            double currentPoints = currentPlayer.getNumPoints();
//            sumTotal = sumTotal + currentPoints;
//
// */
//*/
//
// */
//
////currentrespuesta.setRespuestaUsuario(userytrue)
//
