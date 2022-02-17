import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bienvenido al Trivial, escoge temática: (1-geografía), (2-historia), (3-matemática)");
        Scanner sc = new Scanner(System.in);
        String topics = sc.nextLine();







        buildTopicMap();

        int contadorPuntuacion = showPreguntasyPuntuacion(questions);
        System.out.println(contadorPuntuacion);


        return ;


    }

    private static Map<String, List<Question>> buildTopicMap() {

        Map<String, List<Question>> topicMap = new HashMap<>();
        LinkedList<Question> geography = new LinkedList<>();
        List<Question> history = new ArrayList<>();
        List<Question> math = new ArrayList<>();


        geography.add(new Question("La capital de España es Madrid (T/F)", true, 5));
        geography.add(new Question("La tierra es cuadrada (T/F)", false, 5));
        geography.add(new Question("España tiene 17 comunidades (T/F)", true, 5));

        history.add(new Question("Colón descubrió América (T/F)", true, 5));
        history.add(new Question("Franco fue un dictador (T/F)", true, 5));
        history.add(new Question(" España es una república (T/F)", false, 5));

        math.add(new Question(" Uno más uno es 2 (T/F)", true, 5));
        math.add(new Question(" Dos más dos es 2 (T/F)", false, 5));
        math.add(new Question(" Uno más dos es 3 (T/F)", true, 5));

        geography.pollFirst()


        topicMap.put("Geografía", geography);
        topicMap.put("Historia", history);
        topicMap.put("Matemática", math);

        return topicMap;
    }


    private static List<Question> buildPreguntasList() {
        List<Question> questions = new ArrayList<>();

        questions.add(new Question("¿Java es un lenguaje tipado? T/F ", true, 5));
        questions.add(new Question("¿Se pueden hacer aplicaciones móviles con Java? T/F ", true, 5));
        questions.add(new Question(" ¿No se puede crear vídeo juegos con Java? T/F ", false, 5));
        questions.add(new Question(" ¿Java es un lenguaje POO? T/F ", true, 5));
        questions.add(new Question(" ¿El lenguaje Java fue comercializado en 1998? T/F ", false, 5));

        return questions;

    }

    private static int showPreguntasyPuntuacion(List<Question> preguntas) {

        int contadorPuntuacion = 0;

        for (int i = 0; i < preguntas.size(); i++) {
            Question currentPregunta = preguntas.get(i);

            System.out.println(currentPregunta.getQuestion());

            System.out.println("T/F?");
            Scanner sc = new Scanner(System.in);
            String option = sc.nextLine();

            boolean respuestaUsuario = option.equalsIgnoreCase("T");

            currentPregunta.setReaderAnswer(respuestaUsuario);

            if (respuestaUsuario == currentPregunta.isCorrectAnswer()) {
                System.out.println("Felicidades! Has acertado");
            } else {
                System.out.println("Nice try ;-)");
            }


            if (respuestaUsuario == currentPregunta.isCorrectAnswer()) {
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
            Question currentQuestion = preguntas.get(i);
            if (currentQuestion.isReaderAnswer()
                    == currentQuestion.isCorrectAnswer()) {
                System.out.println(currentQuestion.getQuestion());
                System.out.println("has acertado: ");
                puntuacionTotal = puntuacionTotal + currentQuestion.getScore();
                contadorPreguntasAcertadas++;
            }
        }

        System.out.println("has acertado: " + contadorPreguntasAcertadas);

        return puntuacionTotal;

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
