package br.com.alura.comex;

public class teste{
    public static void main(String[] args) {
    //Card 3 e 7
        Produtos primeiroProduto = new Produtos("Celular");

        Produtos outroProduto = new Produtos("Celular");

        if(primeiroProduto == outroProduto){
            System.out.println("Os produtos são iguais!");
        }else{
            System.out.println("Os produtos são diferentes!");
        }
    //Card 4
        Produtos livros = new Produtos("As Crônicas de Gelo e Fogo");
        livros.setDescricao("A Song of Ice and Fire é uma série de livros de alta "+
                "fantasia escrita pelo romancista e roteirista norte-americano " +
                "George R. R. Martin, e publicada pela editora Bantam Spectra. " +
                "Martin começou a desenvolvê-la em 1991 e o primeiro volume " +
                "foi lançado em 1996");

        System.out.println(">> Dados do produto");
        System.out.println("::Nome: " + livros.getNome());
        System.out.println("::Descrição: " + livros.getDescricao());

    }
}
