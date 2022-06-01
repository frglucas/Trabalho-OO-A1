package ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Artistas {

    private String nome;
    private int idade;
    private List<String> listNomeAlbuns = new ArrayList<>();

    public Artistas(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Artistas(String nome, int idade, List<String> listNomeAlbuns) {
        this.nome = nome;
        this.idade = idade;
        this.listNomeAlbuns = listNomeAlbuns;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade < 0){
            this.idade = 0;
        } else this.idade = idade;
    }

    public List<String> getListNomeAlbuns() {
        return listNomeAlbuns;
    }

    public void adicionarAlbum(String nomeAlbum) {
        listNomeAlbuns.add(nomeAlbum);
    }

    @Override
    public String toString() {
        if(listNomeAlbuns.size() == 0){
            return "\nNome: " + getNome() + "\n" +
                    "Idade: " + getIdade() + "\n" +
                    "Quantidade de albuns: " + listNomeAlbuns.size() + "\n";
        }else {
            String nomeAlbuns = "";
            for(String album: listNomeAlbuns) {
                nomeAlbuns = nomeAlbuns + "\n" + album;
            }
            return "\nNome: " + getNome() + "\n" +
                    "Idade: " + getIdade() + "\n" +
                    "Albuns: " + nomeAlbuns;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artistas artistas = (Artistas) o;
        return idade == artistas.idade && Objects.equals(nome, artistas.nome) && Objects.equals(listNomeAlbuns, artistas.listNomeAlbuns);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade, listNomeAlbuns);
    }
}
