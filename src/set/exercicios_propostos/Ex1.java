package set.exercicios_propostos;

import java.util.*;

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
        Set<String> arcoiris2 = new TreeSet<>(new ComparatorOrdemAlfabetica());
        arcoiris2.addAll(arcoiris);
        for(String cor: arcoiris2){
            System.out.println(cor);
        }

        //Exiba as cores em ordem alfabética




    }

    static class ComparatorOrdemAlfabetica implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            return o1.compareToIgnoreCase(o2);
        }
    }

}
