package list.Pesquisa;

public class Livraria {
    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.adicionarLivro("O Meu Pé De Laranja Lima", "Manoel", 1930);
        catalogo.adicionarLivro("O Meu Pé De Laranja Lima", "Manoel", 1930);
        catalogo.adicionarLivro("Como Eu Era Antes De Você", "Alexia", 2010);
        catalogo.adicionarLivro("Os Homens Que Não Amavam As Mulheres", "Manoel", 1970);
        catalogo.adicionarLivro("Um Gay De Família", "Moisés", 2015);


        System.out.println(catalogo.pesquisarPorAutor("Manoel"));
        System.out.println(catalogo.pesquisarPorTitulo("O Meu Pé De Laranja Lima"));
        System.out.println(catalogo.pesquisarPorIntervaloAnos(1950, 2010));
    }
}
