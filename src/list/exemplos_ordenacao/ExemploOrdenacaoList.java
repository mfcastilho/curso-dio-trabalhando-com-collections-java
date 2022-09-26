package list.exemplos_ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {
        List<Gato> meusGatos  = new ArrayList<>(){{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
        }};

        //Ordem de inserção
        System.out.println("---\tOrdem de inserção\t---");
        System.out.println(meusGatos);

        //Ordem aleatória
        System.out.println("---\tOrdem aleatória\t---");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        //Ordem Natural
        System.out.println("---\tOrdem Natural (nome)\t---");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);



        //Ordem Idade
        System.out.println("---\tOrdem Idade\t---");
//        Collections.sort(meusGatos, new Gato.ComparatorIdade());
        meusGatos.sort(new Gato.ComparatorIdade());
        System.out.println(meusGatos);

        //Ordem cor
        System.out.println("---\tOrdem cor\t---");
        Collections.sort(meusGatos, new Gato.ComparatorCor());
//        meusGatos.sort(new Gato.ComparatorCor());
        System.out.println(meusGatos);

        //Ordem nome/cor/idade
        System.out.println("---\tOrdem nome/cor/idade\t---");
//        Collections.sort(meusGatos, new Gato.ComparatorNomeCorIdade());
        meusGatos.sort(new Gato.ComparatorNomeCorIdade());
        System.out.println(meusGatos);


    }
}

class Gato implements Comparable<Gato>{
    private String nome;
    private int idade;
    private String cor;

    public Gato(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }

    static class ComparatorIdade implements Comparator<Gato>{

        @Override
        public int compare(Gato gato1, Gato gato2) {
            return Integer.compare(gato1.getIdade(), gato2.getIdade());
        }
    }

    static class ComparatorCor implements Comparator<Gato>{

        @Override
        public int compare(Gato gato1, Gato gato2) {
            return gato1.getCor().compareToIgnoreCase(gato2.getCor());
        }
    }

    static class ComparatorNomeCorIdade implements Comparator<Gato>{

        @Override
        public int compare(Gato gato1, Gato gato2) {
            int nome  = gato1.getNome().compareToIgnoreCase(gato2.getNome());
            int cor = gato1.getCor().compareToIgnoreCase(gato2.getCor());
            if(nome != 0){
                return nome;
            }else if (cor != 0){
                return cor;
            }else{
                return Integer.compare(gato1.getIdade(), gato2.getIdade());
            }
        }
    }
}
