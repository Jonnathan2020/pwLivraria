//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        //criar um objeto -> instanciar um objeto

        //CRIAÇÃO DO NOVO OBJETO EDITORA
        Editora editoraLivro = new Editora();
        editoraLivro.nome = "Sextante";
        editoraLivro.site = "www.sextante.com.br";
        editoraLivro.email = "atendimento@sextante.com.br";

        System.out.println("Editora e suas caracteristicas como objeto: ");
        System.out.println("Nome: " + editoraLivro.nome);
        System.out.println("Site: " + editoraLivro.site);
        System.out.println("Email: " + editoraLivro.email);

        //CRIAÇÃO DO OBJETO LIVRO
        Livro meuLivro = new Livro();
        meuLivro.titulo =  "Harry Potter";
        meuLivro.autor = "J.k.Hawking";
        meuLivro.valor = 20;
        meuLivro.editora = editoraLivro;
        meuLivro.paginas = 354;
        meuLivro.resumo = "Aqui vai um resumo bem resumido sobre o livro listado";
        meuLivro.tipoCapa = "Capa comum";

        //EXIBIÇÃO DO TITULO DO OBJETO
        System.out.println(meuLivro.titulo+"\n");

        //CRIAÇÃO DE OBJETO
        Livro livroFavorito = new Livro();
        livroFavorito.titulo = "A arte da  guerra nos negócios";
        livroFavorito.autor = "David Brown";
        livroFavorito.valor = 60.27;
        livroFavorito.editora = editoraLivro;
        livroFavorito.paginas = 320;
        livroFavorito.resumo = "O mundo dos negócios é uma arena onde se travam batalhas extraordinárias,\n         como a da Blockbuster contra a Net ix e da BlackBerry contra a Apple.";
        livroFavorito.tipoCapa = "Capa comum";

        //EXIBIÇÃO DOS ATRIBUTOS DO OBJETO ORGANIZADAMENTE
        System.out.println(livroFavorito.titulo + " criado por "+ livroFavorito.autor + " e com a ajuda da " + livroFavorito.editora + "!!!");
        System.out.println("\n=========================================================================\n");
        System.out.println("Características do Livro: \n");
        System.out.println(" Titulo: " + livroFavorito.titulo);
        System.out.println(" Autor: " + livroFavorito.autor);
        System.out.println(" Editora: " + livroFavorito.editora.nome);
        System.out.println(" Paginas: " + livroFavorito.paginas + "pags");
        System.out.println(" Resumo: " + livroFavorito.resumo);
        System.out.println(" Tipo de capa: " + livroFavorito.tipoCapa);
        System.out.println(" Valor: R$" + livroFavorito.valor);
        System.out.println("\n=========================================================================");
        System.out.println("=========================================================================\n");

    }
}