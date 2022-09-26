package set.exercicios_propostos.exercicio2;

import java.util.HashSet;
import java.util.Set;

public class Principal {
    public static void main(String[] args) {
        Set<LinguagemFavorita> listaLinguagensFavoritas = new HashSet<>(){{
            add(new LinguagemFavorita("java", 1991, "intellij"));
            add(new LinguagemFavorita("javascript", 1995, "vscode"));
            add(new LinguagemFavorita("python", 1989, "pycharme"));
        }};
        
    }
}
