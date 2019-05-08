package test;

import entidade.Avaliacao;
import entidade.Pessoa;

public class Relatorio {

    public static void mostrar(Pessoa pessoa) {

        System.out.println("\n*****");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Altura: " + pessoa.getAltura());
        System.out.println("Peso: " + pessoa.getPeso());
        System.out.println("~~~~~");

        for (Avaliacao a : pessoa.getAvaliacoes()) {

            System.out.println("Indice IMC: " + a.getIndice());
            System.out.println("Situa��o IMC: " + a.getSituacao());

            System.out.println("\n");
        }

    }

}
