package ex1;

import java.util.Scanner;

public class Programa {

    Scanner entrada = new Scanner(System.in);
    Agenda agenda = new Agenda();
    boolean contador = true;

    public void menuInicial(){
        do{
            System.out.println("------ AGENDA ------\n" +
                    "1 -> Criar Pessoa\n" +
                    "2 -> Remover Pessoa\n" +
                    "3 -> Buscar Pessoa\n" +
                    "4 -> Mostrar toda agenda\n" +
                    "5 -> Mostrar pessoa\n" +
                    "6 -> Sair do programa");

            int escolha = entrada.nextInt();
            switch(escolha) {
                case 1:
                    menuCriarPessoa();
                    break;
                case 2:
                    menuRemovePessoa();
                    break;
                case 3:
                    menuBuscarPessoa();
                    break;
                case 4:
                    menuImprimeAgenda();
                    break;
                case 5:
                    menuImprimePessoa();
                    break;
                case 6:
                    sairPrograma();
                    break;
                default:
                    System.out.println("Digite uma OPÇÃO VÁLIDA!");
            }
        } while(contador);

    }

    private void menuCriarPessoa(){
        System.out.println("Digite o primeiro nome:");
        String nome = entrada.next();
        System.out.println("Digite a idade da pessoa:");
        int idade = entrada.nextInt();
        System.out.println("Digite a altura da pessoa:(cm)");
        int altura = entrada.nextInt();
        agenda.armazenarPessoa(nome, idade, altura);
        System.out.println("Pessoa criada!");
    }

    private void menuRemovePessoa(){
        System.out.println("Digite o nome da pessoa que deseja excluir:");
        String nomePessoa = entrada.next();
        agenda.removePessoa(nomePessoa);
    }

    private void menuBuscarPessoa(){
        System.out.println("Digite o nome para a busca de posição:");
        String nome = entrada.next();
        int posicao = agenda.buscaPessoa(nome);
        System.out.println(nome + " está na posição " + posicao);
    }

    private void menuImprimeAgenda(){
        agenda.imprimeAgenda();
    }

    private void menuImprimePessoa(){
        System.out.println("Digite a posição da pessoa:");
        int index = entrada.nextInt();
        agenda.imprimePessoa(index);
    }

    private void sairPrograma(){
        contador = false;
        entrada.close();
    }

}
