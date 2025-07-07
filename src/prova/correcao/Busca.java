package prova.correcao;

/*
@2) Crie, com ponto de entrada de execução 'public static void main(String[] args) {}', a classe Busca que
busque, com cinco linhas paralelas de execução (multithreading), todos os números abundantes entre 1 e
500 de forma eficiente utilizando objetos da classe NumeroInteiroPositivo (@1). Os números abundantes
encontrados, isto é, objetos da classe NumeroInteiroPositivo (@1), deverão ser armazenados em uma
coleção Java 'resultado'.

Para cada número abundante encontrado, o objeto 'resultado' deverá ser impresso (Exemplo:
System.out.println("P1: " + resultado) ).

Após iniciar as cinco linhas de execução, aguarde 15 segundos, e utilizando fluxo e lambda para a coleção
Java 'resultado', apresente os números abundantes pares ordenados entre 1 e 500.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Busca {
    public static void main(String[] args) {
        
        List<NumeroInteiroPositivo> resultado = Collections.synchronizedList( new ArrayList<>() );
                
        Thread pp1 = new Thread( () -> {
            try {
                for( int n  = 1; n <= 100; n++ ) {
                    NumeroInteiroPositivo numero = new NumeroInteiroPositivo(n);
                    
                    if( numero.isAbundante() ) {
                        resultado.add(numero);
                        System.out.println("P1: " + resultado);
                    }
                }
            } catch(Exception ex) {
                ex.printStackTrace();
            }           
        } );
        
        Thread pp2 = new Thread( () -> {
            try {
                for( int n  = 101; n <= 200; n++ ) {
                    NumeroInteiroPositivo numero = new NumeroInteiroPositivo(n);
                    
                    if( numero.isAbundante() ) {
                        resultado.add(numero);
                        System.out.println("P2: " + resultado);
                    }
                }
            } catch(Exception ex) {
                ex.printStackTrace();
            }           
        } );
        
        Thread pp3 = new Thread( () -> {
            try {
                for( int n  = 201; n <= 300; n++ ) {
                    NumeroInteiroPositivo numero = new NumeroInteiroPositivo(n);
                    
                    if( numero.isAbundante() ) {
                        resultado.add(numero);
                        System.out.println("P3: " + resultado);
                    }
                }
            } catch(Exception ex) {
                ex.printStackTrace();
            }           
        } );
        
        Thread pp4 = new Thread( () -> {
            try {
                for( int n  = 301; n <= 400; n++ ) {
                    NumeroInteiroPositivo numero = new NumeroInteiroPositivo(n);
                    
                    if( numero.isAbundante() ) {
                        resultado.add(numero);
                        System.out.println("P4: " + resultado);
                    }
                }
            } catch(Exception ex) {
                ex.printStackTrace();
            }           
        } );
        
        Thread pp5 = new Thread( () -> {
            try {
                for( int n  = 401; n <= 500; n++ ) {
                    NumeroInteiroPositivo numero = new NumeroInteiroPositivo(n);
                    
                    if( numero.isAbundante() ) {
                        resultado.add(numero);
                        System.out.println("P5: " + resultado);
                    }
                }
            } catch(Exception ex) {
                ex.printStackTrace();
            }           
        } );
        
        pp1.start();
        pp2.start();
        pp3.start();
        pp4.start();
        pp5.start();
        
        System.out.println("########");
        
        try {
            
            Thread.sleep(15000);
            
            resultado.stream()
//                    .filter( (n) -> n.getValor() % 2 == 0 )
                    .filter( (n) -> n.getTipo() == Tipo.PAR )
                    .sorted()
                    .forEach( (n) -> System.out.println(n) );
            
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        
    }
}