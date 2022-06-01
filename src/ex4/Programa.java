package ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

    List<Artistas> listArtistas = new ArrayList<>();
    Scanner entrada = new Scanner(System.in);

    private void adicionarArtista(String nome, int idade){
        listArtistas.add(new Artistas(nome, idade));
    }

    private void adicionarArtistaComAlbum(String nome, int idade, List<String> albuns){
        listArtistas.add(new Artistas(nome, idade, albuns));
    }

    private void menuAdicionarArtista(){
        System.out.println("Qual o primeiro nome do artista?");
        String nome = entrada.next();
        System.out.println("Qual a idade do artista?");
        int idade = entrada.nextInt();


        System.out.println("Deseja adicionar algum album do artista?\n1 -> SIM");
        int escolha = entrada.nextInt();
        List<String> listaAlbum = new ArrayList<>();
        if(escolha == 1){
            boolean cont = true;
            do{
                String nomeAlbum = menuAdicionarAlbum();
                listaAlbum.add(nomeAlbum);
                System.out.println("Deseja cadastrar outro album?\n1 -> SIM");
                int outraEscolha = entrada.nextInt();
                if(outraEscolha != 1){
                    cont = false;
                }
            }while(cont);
        }

        if(listaAlbum.size() == 0){
            adicionarArtista(nome, idade);
        } else adicionarArtistaComAlbum(nome, idade, listaAlbum);
    }

    private String menuAdicionarAlbum(){
        System.out.println("Qual o nome do album que deseja adicionar?");
        String nome = entrada.next();
        return nome;
    }

    private List<Artistas> buscarPorNome(String nome){
        List<Artistas> artistasBuscados = new ArrayList<>();
        for(Artistas artista: listArtistas){
            if(artista.getNome().equalsIgnoreCase(nome)){
                artistasBuscados.add(new Artistas(artista.getNome(), artista.getIdade()));
            }
        }
        return artistasBuscados;
    }

    private void menuBuscarPorNome(){
        System.out.println("Qual o nome do artista buscado?");
        String nomeBuscado = entrada.next();
        System.out.println(buscarPorNome(nomeBuscado));
    }

    private void mostrarArtistasCadastrados(){
        int contador = 0;
        for(Artistas artista: listArtistas){
            contador++;
            System.out.println(contador + " -> " + artista.getNome());
        }
    }

    private void vizualizarArtistaDetalhado(int index){
        int i = index - 1;
        System.out.println(listArtistas.get(i));
    }

    private void menuMostrarArtistas(){
        mostrarArtistasCadastrados();
        System.out.println("Deseja ver algum artista em detalhes?\n1 -> SIM");
        int escolha = entrada.nextInt();
        if(escolha == 1){
            System.out.println("Qual o numero do artista?");
            int numArtista = entrada.nextInt();
            vizualizarArtistaDetalhado(numArtista);
        }
    }

    private void apagarTodosArtistas(){
        listArtistas.clear();
    }

    private void quantidadeDeArtistas(){
        System.out.println(listArtistas.size());
    }

    public void menuInicial(){
        boolean contador = true;
        do{
            System.out.println("---- MENU ----\n" +
                    "1 -> Cadastrar artista\n" +
                    "2 -> Vizualizar todos artistas\n" +
                    "3 -> Buscar artista por nome\n" +
                    "4 -> Quantidade de artistas cadastrados\n" +
                    "5 -> Apagar todos artistas\n" +
                    "6 -> Sair do programa");
            int escolha = entrada.nextInt();

            switch(escolha){
                case 1:
                    menuAdicionarArtista();
                    break;
                case 2:
                    menuMostrarArtistas();
                    break;
                case 3:
                    menuBuscarPorNome();
                    break;
                case 4:
                    quantidadeDeArtistas();
                    break;
                case 5:
                    apagarTodosArtistas();
                    break;
                case 6:
                    entrada.close();
                    contador = false;
            }

        } while(contador);
    }

}
