package set.exercicios_propostos;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex1 {
    public static void main(String[] args) {

        Set<String> arcoiris = new HashSet<>(Arrays.asList("Vermelho", "Laranja", "Amarelo", "Verde", "Azul", "Azul-Escuro", "Violeta"));
        for(String cor: arcoiris){
            System.out.println(cor);
        }


    }

}
