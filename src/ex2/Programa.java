package ex2;

import java.util.Scanner;

public class Programa {

    Scanner entrada = new Scanner(System.in);
    Elevador elevador;
    boolean contador = true;

    public void menuInicial(){
        System.out.println("Qual o andar máximo do elevador?");
        int andarMax = entrada.nextInt();
        System.out.println("Qual a capacidade total do elevador?");
        int capacidadeMax = entrada.nextInt();
        elevador = new Elevador(andarMax, capacidadeMax);


        do{
            System.out.println("--- Elevador ---\n" +
                                "Quantidade de pessoas: " + elevador.getQtdAtual() + "/"
                                + elevador.getCapacidade() + "\n" +
                                "Andar atual: " + elevador.getAndarAtual() + "/"
                                + elevador.getAndarMax() + "\n");
            System.out.println("Digite a OPÇÃO desejada:\n" +
                                "1 -> Entra\n" +
                                "2 -> Sai\n" +
                                "3 -> Sobe\n" +
                                "4 -> Desce\n" +
                                "5 -> Sair do programa");
            int escolha = entrada.nextInt();
            switch (escolha){
                case 1:
                    elevador.entra();
                    break;
                case 2:
                    elevador.sai();
                    break;
                case 3:
                    elevador.sobe();
                    break;
                case 4:
                    elevador.desce();
                    break;
                case 5:
                    contador = false;
                    break;
                default:
                    System.out.println("Digite uma OPÇÃO VÁLIDA!");
            }

        } while(contador);
    }
}
