package simulado.sala.ex1;

import java.util.Comparator;

public class DivulgaVideos {

    public static void main(String[] args) {

        Video video1 = new Video("Jogando bola", 12, Genero.ENTRETENIMENTO);
        Video video2 = new Video("Jogando bola 2", 12, Genero.ENTRETENIMENTO);
        Video video3 = new Video("Caso amoroso", 18, Genero.ENTRETENIMENTO);
        Video video4 = new Video("Lambda em Java", 15, Genero.EDUCACAO);
        Video video5 = new Video("Caso do chefe com a esposa", 25, Genero.EDUCACAO);

        Catalogo c = new Catalogo();

        try {
            c.adicionar(video1);
            c.adicionar(video2);
            c.adicionar(video3);
            c.adicionar(video4);
            c.adicionar(video5);
//            c.adicionar(video4);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        System.out.println("\n--1--");

        c.getStream()
                .sorted(Comparator.comparing((e) -> e.getTitulo()))
                .forEach((e) -> System.out.println(e));
        
        System.out.println("\n--2--");
        
        c.getStream()
                .sorted()
                .filter((v) -> v.getClassificacao() < 18)
                .forEach((v) -> System.out.println(v));
        
        System.out.println("\n--3--");
        
        c.getStream()
                .sorted()
                .filter((v) -> v.getTitulo().contains("Jogando"))
                .forEach((v) -> System.out.println(v));
        
        System.out.println("\n--4--");
        
        c.getStream()
                .sorted()
                .forEach((v) -> System.out.println(v));

    }
}
