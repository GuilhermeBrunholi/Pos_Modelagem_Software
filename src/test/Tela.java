package test;

import entidade.Avaliacao;
import entidade.Pessoa;
import rule.IMC;

public class Tela {

    public void executar() {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Piedade Lima");
        pessoa.setAltura(1.60);
        pessoa.setPeso(70);

        //double novoIndice = IMC.calcular(p.peso, p.altura);
        double novoIndice = IMC.calcular(pessoa);
        String novaSituacao = IMC.situacao(novoIndice);
        Avaliacao aval = new Avaliacao(novoIndice, novaSituacao);
        pessoa.adicionaAvaliacao(aval);

        //avaliacao 2
        pessoa.setPeso(60);
        novoIndice = IMC.calcular(pessoa);
        novaSituacao = IMC.situacao(novoIndice);
        Avaliacao aval2 = new Avaliacao(novoIndice, novaSituacao);
        pessoa.adicionaAvaliacao(aval2);

        //avaliacao 2
        pessoa.setPeso(50);
        novoIndice = IMC.calcular(pessoa);
        novaSituacao = IMC.situacao(novoIndice);
        Avaliacao aval3 = new Avaliacao(novoIndice, novaSituacao);
        pessoa.adicionaAvaliacao(aval3);

        Relatorio.mostrar(pessoa);

        System.out.println("Fim");
    }

}
