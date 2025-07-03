package simulado.sala.s2.ex2;

public class AtendimentoBanco {
    public static void main(String[] args) {
        
        FilaDeEspera fila = new FilaDeEspera();
        
        Thread pp1 = new Thread( () -> {
            try {
                
                fila.adicionar( new Pessoa("João", "111.111.111-11") );
                Thread.sleep(500);
                
                fila.adicionar( new Pessoa("Maria", "222.222.222-22") );
                Thread.sleep(500);
                
                fila.adicionar( new Pessoa("José", "333.333.333-33") );
                Thread.sleep(500);
                
                fila.adicionar( new Pessoa("Pedro", "444.444.444-44") );
                Thread.sleep(500);
                
                fila.adicionar( new Pessoa("Mateus", "555.555.555-55") );
                Thread.sleep(500);
                                                

            } catch(Exception ex) {
                ex.printStackTrace();
            }            
        } );
        
        Thread pp2 = new Thread( () -> {
            try {
                while(true) {
                    Thread.sleep(1500);
                    fila.remover();
                    System.out.println("CX2: " + fila);                    
                }
            } catch(Exception ex) {
                ex.printStackTrace();
            }            
        } );
        
        Thread pp3 = new Thread( () -> {
            try {
                while(true) {
                    Thread.sleep(1500);
                    fila.remover();
                    System.out.println("CX3: " + fila);                    
                }
            } catch(Exception ex) {
                ex.printStackTrace();
            }            
        } );
        
        Thread pp4 = new Thread( () -> {
            try {
                while(true) {
                    Thread.sleep(1500);
                    fila.remover();
                    System.out.println("CX5: " + fila);                    
                }
            } catch(Exception ex) {
                ex.printStackTrace();
            }            
        } );
        
        pp1.start();
        pp2.start();
        pp3.start();
        pp4.start();
        
    }
}
