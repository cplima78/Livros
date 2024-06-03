public class Main {
    public static void main(String[] args) {
        // Criando objetos Livro
        Livro livro1 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943);
        Livro livro2 = new Livro("As Crônicas de Nárnia", "C.S. Lewis", 1950);
        Livro livro3 = new Livro("O Idiota", "Fiódor Dostoiévski", 1867);

        // Criando objeto Biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Adicionando livros à biblioteca
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        // Listando todos os livros na biblioteca
        biblioteca.listarLivros();
    }
}

