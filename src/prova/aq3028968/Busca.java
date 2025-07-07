package prova.aq3028968;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Busca {

    public static void main(String[] args) {

        List<NumeroInteiroPositivo> resultado = Collections.synchronizedList(new ArrayList<>());

        Thread t1;
        Thread t2;
        Thread t3;
        Thread t4;
        Thread t5;

        t1 = new Thread(() -> {
            try {
                for (int i = 1; i <= 100; i++) {
                    NumeroInteiroPositivo t = new NumeroInteiroPositivo(i);
                    if (t.isAbundante()) {
                        resultado.add(t);
                        System.out.println("P1: " + resultado);
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        
        t2 = new Thread(() -> {
            try {
                for (int i = 101; i <= 200; i++) {
                    NumeroInteiroPositivo t = new NumeroInteiroPositivo(i);
                    if (t.isAbundante()) {
                        resultado.add(t);
                        System.out.println("P2: " + resultado);
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        
        t3 = new Thread(() -> {
            try {
                for (int i = 201; i <= 300; i++) {
                    NumeroInteiroPositivo t = new NumeroInteiroPositivo(i);
                    if (t.isAbundante()) {
                        resultado.add(t);
                        System.out.println("P3: " + resultado);
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        
        t4 = new Thread(() -> {
            try {
                for (int i = 301; i <= 400; i++) {
                    NumeroInteiroPositivo t = new NumeroInteiroPositivo(i);
                    if(t.isAbundante()) {
                        resultado.add(t);
                        System.out.println("P4: " + resultado);
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        
        t5 = new Thread(() -> {
            try {
                for (int i = 401; i <= 500; i++) {
                    NumeroInteiroPositivo t = new NumeroInteiroPositivo(i);
                    if(t.isAbundante()) {
                        resultado.add(t);
                        System.out.println("P5: " + resultado);
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        System.out.println("-----");
        
        try {
            Thread.sleep(1500);
            resultado
                    .stream()
                    .filter(e -> e.getTipo() ==  Tipo.PAR)
                    .sorted()
                    .forEach(e -> System.out.println(e));
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
