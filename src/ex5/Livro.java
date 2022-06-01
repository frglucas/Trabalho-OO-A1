package ex5;

public class Livro {

    private String titulo;
    private String autor;
    private int idEditora;
    private int ano;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Titulo -> " + titulo + "\n" +
                "Autor -> " + autor + "\n" +
                "idEditora -> " + idEditora + "\n" +
                "Ano -> " + ano + "\n";
    }
}
