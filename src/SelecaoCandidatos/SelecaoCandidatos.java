package SelecaoCandidatos;

import java.util.Random;

public class SelecaoCandidatos {
    public static void main(String[] args) {
        String[] candidatos = {"Felipe", "Marcia", "Amanda", "Cecília", "Pedro"};
        for( String candidato: candidatos){
            entrandoContato(candidato);
        }
    }

    static void entrandoContato(String candidato) {
    int tentativasRealizadas = 1;
    boolean continuarTentando = true;
    boolean atendeu = false;
    do{
        atendeu = atender();
        continuarTentando=!atendeu;
        if(continuarTentando)
            tentativasRealizadas++;
        else
            System.out.println(" CONTATO REALIZADO COM SUCESSO!!! ");


    }while(continuarTentando && tentativasRealizadas <3);
        if (atendeu)
            System.out.println("Conseguimos contato com  " + candidato + " na " + tentativasRealizadas + " Tentativa ");
        else
            System.out.println("Não conseguimos contato com " + candidato + " , número máximo de tentativas " + tentativasRealizadas + " Realizada ");

    }
        //metodo auxiliar
    static boolean atender(){
        return new Random().nextInt(3)==1;

    }

    static void imprimirSelecionados(){
        String[] candidatos = {" Felipe " , " Marcia ", " Amanda ", " Cecília ", " Pedro "};

        System.out.println(" imprimindo a lista de candidatos informando o indice do elemento ");

        for( int indice=0; indice < candidatos.length; indice++){
            System.out.println(" O candidato de nº:  " + indice+1 + " é o " + candidatos[indice]);

        }
System.out.println(" Forma abreviada de interaçãp for each ");
        for(String candidato: candidatos){
            System.out.println(" o candidato selecionado foi " + candidato);
        }
    }
      static void selecaoCandidatos () {
           String[] candidatos = {" Felipe ", " Marcia ", " Amanda ", " Cecília ", " Pedro ", " Antonio ", " Bernardo ", " Ana ", " Julia ", " Fernanda ", " Valentina "};

           int candidatosSelecionados = 0;
           int candidatosAtual = 0;
           double salarioBase = 2000.0;

            while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
                String candidato = candidatos[candidatosAtual];
                double salarioPretendido = valorPretendido();
                System.out.println(" O candidato " + candidato + " solicitou este valos de salario " + salarioPretendido);
                if (salarioBase > salarioPretendido) {
                    System.out.println(" O candidato " + candidato + " foi selecionado para a vaga ");
                    candidatosSelecionados++;
                }
                candidatosAtual++;
            }
    }

    private static double valorPretendido() {
        return 0;
    }
        static void analisarCandidato ( double salarioPretendido){
        double salarioBase = 2000.0;

            if (salarioBase > salarioPretendido) {
                System.out.println(" LIGAR PARA O CANDIDATO ");
            } else if (salarioBase == salarioPretendido)
                System.out.println(" LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA ");
            else {
                System.out.println(" AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS ");
            }

        }
    }
