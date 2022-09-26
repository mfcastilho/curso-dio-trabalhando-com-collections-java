package set.exercicios_propostos.exercicio2;

import java.util.*;

public class Principal {
    public static void main(String[] args) {
        //Ordem de Inserção
        System.out.println("--\tOrdem de Inserção\t--");
        Set<LinguagemFavorita> listaLinguagensFavoritas = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("java", 1991, "intellij"));
            add(new LinguagemFavorita("javascript", 1995, "vscode"));
            add(new LinguagemFavorita("python", 1989, "pycharme"));
            add(new LinguagemFavorita("C", 1972, "falcon ide"));
            add(new LinguagemFavorita("html", 1990, "vscode"));
        }};
        for(LinguagemFavorita linguagem: listaLinguagensFavoritas){
            System.out.println(linguagem);
        }

        //Ordem Natural(nome)
        System.out.println("\n--\tOrdem Natural(nome)\t--");
        Set<LinguagemFavorita> listalinguagemFavoritas1 = new TreeSet<>(new ComparatorOrdemNatural());
        listalinguagemFavoritas1.addAll(listaLinguagensFavoritas);
        for (LinguagemFavorita linguagem: listalinguagemFavoritas1){
            System.out.println(linguagem);
        }

        //Ordem por IDE
        System.out.println("\n--\tOrdem por IDE\t--");
        Set<LinguagemFavorita> listalinguagemFavoritas2 = new TreeSet<>(new ComparatorIDE());
        listalinguagemFavoritas2.addAll(listaLinguagensFavoritas);
        for (LinguagemFavorita linguagem: listalinguagemFavoritas2){
            System.out.println(linguagem);
        }

        //Ordem por ano de criação e nome
        System.out.println("\n--\tOrdem por ano de criação e nome\t--");
        Set<LinguagemFavorita> listalinguagemFavoritas3 = new TreeSet<>(new ComparatorAnoDeCriacaoNome());
        listalinguagemFavoritas3.addAll(listaLinguagensFavoritas);
        for (LinguagemFavorita linguagem: listalinguagemFavoritas3){
            System.out.println(linguagem);
        }

        //Ordem por nome, ano de criacao e IDE
        System.out.println("\n--\tOrdem por nome, ano de criacao e IDE\t--");
        Set<LinguagemFavorita> listalinguagemFavoritas4 = new TreeSet<>(new ComparatorNomeAnoDeCriacaoIde());
        listalinguagemFavoritas4.addAll(listaLinguagensFavoritas);
        for (LinguagemFavorita linguagem: listalinguagemFavoritas4){
            System.out.println(linguagem);
        }

    }

    static class ComparatorOrdemNatural implements Comparator<LinguagemFavorita> {

        @Override
        public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
            return l1.getNome().compareToIgnoreCase(l2.getNome());
        }
    }

    static class ComparatorIDE implements Comparator<LinguagemFavorita>{

        @Override
        public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
            int ide = l1.getIde().compareToIgnoreCase(l2.getIde());
            int nome = l1.getNome().compareToIgnoreCase(l2.getNome());

            if(ide != 0){
                return ide;
            }
            return nome;
        }
    }
    static class ComparatorAnoDeCriacaoNome implements Comparator<LinguagemFavorita>{

        @Override
        public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
            int ano = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
            int nome = l1.getNome().compareToIgnoreCase(l2.getNome());

            if(ano != 0){
                return ano;
            }
            return nome;
        }
    }

    static  class ComparatorNomeAnoDeCriacaoIde implements Comparator<LinguagemFavorita>{

        @Override
        public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
            int nome = l1.getNome().compareToIgnoreCase(l2.getNome());
            int ano = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
            int ide = l1.getIde().compareToIgnoreCase(l2.getIde());

            if(nome != 0){
                return nome;
            }
            if(ano != 0){
                return ano;
            }
            return ide;
        }
    }
}
