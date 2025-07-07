package prova.correcao;

/*
Em um projeto Java do Netbeans vazio, de nome <SEU_PRONTUÁRIO>, crie o código abaixo. Ao final
da prova, o aluno deverá enviar o aquivo compactado (.zip) da pasta do projeto no MOODLE.

A) Para todas as classes, disponha de métodos set e get (is quando boleano) para cada atributo, onde o
nível de acesso dos métodos deve respeitar a integridade dos objetos criados a partir de tais classes.
B) Para todas as classes, disponha de um @Override do método toString de modo que se possa "imprimir"
(System.out.println) um objeto.
C) Para todas as classes, crie construtores que recebam por parâmetros os valores de seus atributos
encapsulados (quando necessário).

@1) Crie a classe NumeroInteiroPositivo, que disponha dos atributos corretamente encapsulados: 'valor'
(int), divisores (ArrayList), abundante (boolean) e tipo ( enum Tipo – PAR, IMPAR ). O atributo 'valor'
deve ser recebido como parâmetro na construção de objeto da classe NumeroInteiroPositivo.
Valide, por meio do lançamento de exceção verificada, a modificação do atributo 'valor', onde este não
pode ser negativo.

O atributo 'divisores' deverá dispor dos números inteiros positivos divisores (divisão inteira de resto 0) do
'valor' encapsulado. Toda vez que o 'valor' encapsulado for alterado, seus divisores devem ser obtidos
(novo atributo 'divisores').

O atributo 'tipo' deverá ser PAR caso o 'valor' encapsulado seja par e IMPAR do contrário. Toda vez que o
'valor' encapsulado for alterado, o atributo 'tipo' deve dispor do valor apropriado.

O atributo 'abundante' deverá ser true caso o 'valor' encapsulado seja um Número Abundante e false do
contrário. Toda vez que o 'valor' encapsulado for alterado, o atributo 'abundante' deve dispor do valor
apropriado.

Um número abundante é um número inteiro positivo no qual a soma de seus divisores próprios é maior
que o próprio número. Entende-se como divisores próprios de um valor X todos os números inteiros N que
produzem a divisão inteira de resto 0, ou seja, para X % N tem-se 0. O número X não é seu divisor
próprio.

Exemplos:

12: Seus divisores próprios são 1, 2, 3, 4, 6. A soma é 1+2+3+4+6=16. Como 16>12, 12 é um número
abundante.
18: Seus divisores próprios são 1, 2, 3, 6, 9. A soma é 1+2+3+6+9=21. Como 21>18, 18 é um número
abundante.

Dois objetos da classe NumeroInteiroPositivo devem ser comparáveis segundo o atributo 'valor'
encapsulado.
*/

import java.util.ArrayList;

public class NumeroInteiroPositivo implements Comparable<NumeroInteiroPositivo> {
    
    private int valor;
    private ArrayList<Integer> divisores;
    private boolean abundante;
    private Tipo tipo;

    public NumeroInteiroPositivo(int valor) throws Exception {
        setValor(valor);
    }
    
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) throws Exception {
        if( ( valor >= 0 ) && ( this.valor != valor ) ) {
            
            this.valor = valor;
            
            if( this.valor % 2 == 0 ) {
                setTipo(Tipo.PAR);
            } else {
                setTipo(Tipo.IMPAR);
            }
            
            divisores = new ArrayList<>();            
            int somatorio = 0;            
            
//            for(int n = 1; n < this.valor; n++ ) { 
            for( int n = 1; n < ( this.valor / 2 ) + 1; n++ ) { 
                if( this.valor % n == 0 ) {
                    divisores.add(n);
                    somatorio += n;
                }
            }
            
            if( somatorio > this.valor ) {
                setAbundante(true);
            } else {
                setAbundante(false);
            }
            
        } else {
            throw new Exception("valor deve ser positivo");
        }        
    }

    public boolean isAbundante() {
        return abundante;
    }

    private void setAbundante(boolean abundante) {
        this.abundante = abundante;
    }

    public Tipo getTipo() {
        return tipo;
    }

    private void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
//        return getValor() + " (" + divisores.toString() + ")";
        return "(" + getValor() + ")";
    }

    @Override
    public int compareTo(NumeroInteiroPositivo t) {
        if( getValor() == t.getValor() ) {
            return 0;
        } else {
            if( getValor() > t.getValor() ) {
                return 1;
            } else {
                return -1;
            }
        }
    }
    
}