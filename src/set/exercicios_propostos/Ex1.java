package set.exercicios_propostos;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex1 {
    public static void main(String[] args) {

        Set<String> arcoiris = new HashSet<>(Arrays.asList("Vermelho", "Laranja", "Amarelo", "Verde", "Azul", "Azul-Escuro", "Violeta"));

        //Exiba todas as cores uma abaixo da outra
        System.out.println("--Todas as cores do Arco-Íris--");
        for(String cor: arcoiris){
            System.out.println(cor);
        }

        //Exiba a quantidade de cores que o arco-íris tem
        System.out.println("Total de "+arcoiris.size()+" cores");

        //Exiba as cores em ordem alfabética


    }

}
