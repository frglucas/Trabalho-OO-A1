package ex5;

public class Main {

    public static void main(String[] args) {
        Editora editora = new Editora();
        editora.setId(1);
        editora.setNome("SUPER EDITORA");
        editora.setEmail("supereditora@sac.com");
        Livro livro = new Livro();
        livro.setTitulo("Super Livro");
        livro.setAutor("Lucas");
        livro.setAno(2022);

        System.out.println("Nome editora -> " + editora.getNome());
        System.out.println(livro.getTitulo());

        Livro livroNovo = new Livro();
        livroNovo.setTitulo("Mega Livro");
        livroNovo.setAutor("Lucas");
        livroNovo.setAno(2023);
        System.out.println(editora);
        System.out.println(livroNovo);
    }
}
