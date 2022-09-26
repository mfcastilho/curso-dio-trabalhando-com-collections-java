package set.exercicios_propostos.exercicio2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Principal {
    public static void main(String[] args) {
        //Ordem de Inserção
        System.out.println("--\tOrdem de Inserção\t--");
        Set<LinguagemFavorita> listaLinguagensFavoritas = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("java", 1991, "intellij"));
            add(new LinguagemFavorita("javascript", 1995, "vscode"));
            add(new LinguagemFavorita("python", 1989, "pycharme"));
        }};
        for(LinguagemFavorita linguagem: listaLinguagensFavoritas){
            System.out.println(linguagem);
        }

        //Ordem Natural(nome)
        System.out.println("--\tOrdem Natural(nome)\t--");
        
    }
}
