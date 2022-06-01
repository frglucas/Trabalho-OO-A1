package ex5;

public class Main {

    public static void main(String[] args) {
        Editora editora = new Editora(1, "SUPER EDITORA", "supereditora.sac.com");
        Livro livro = new Livro("Super Livro", "Lucas", 1, 2022);

        System.out.println("Nome editora -> " + editora.getNome() + ", id -> " + editora.getId());
        System.out.println(livro.getTitulo());

        Livro livroNovo = new Livro("Mega Livro", "Lucas", 1, 2023);
        System.out.println(editora);
        System.out.println(livroNovo);
    }
}
