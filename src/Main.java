import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hola amigos :) esto se convertirá " +
                "en un Trivial Game en un Juego del Trivial");
        Scanner sc = new Scanner(System.in);

        List<Preguntas> preguntas = buildPreguntasList();

    }

    private static List<Preguntas> buildPreguntasList() {
        List<Preguntas> preguntas = new ArrayList<>();

        preguntas.add(new Preguntas("¿? S/N "));
        preguntas.add(new Preguntas("¿Java es difícil? S/N "));
        preguntas.add(new Preguntas(" ¿Java es un lenguaje de programación? S/N "));
        preguntas.add(new Preguntas(" ¿Programar es dificil? S/N "));
        preguntas.add(new Preguntas(" ¿Java es un lenguaje POO? S/N "));
    }
}
