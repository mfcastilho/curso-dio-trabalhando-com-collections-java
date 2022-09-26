package set.exercicios_propostos;

import java.util.*;

public class Ex1 {
    public static void main(String[] args) {

        Set<String> arcoiris = new LinkedHashSet<>(Arrays.asList("Vermelho", "Laranja", "Amarelo", "Verde", "Azul", "Azul-Escuro", "Violeta"));

        //Exiba todas as cores uma abaixo da outra
        System.out.println("--Todas as cores do Arco-Íris--");
        for(String cor: arcoiris){
            System.out.println(cor);
        }

        //Exiba a quantidade de cores que o arco-íris tem
        System.out.println("\nTotal de "+arcoiris.size()+" cores");


        //Exiba as cores em ordem alfabética
        Set<String> arcoiris2 = new TreeSet<>(new ComparatorOrdemAlfabetica());
        arcoiris2.addAll(arcoiris);
        System.out.println("\n--Cores em ordem alfabética--");
        for(String cor: arcoiris2){
            System.out.println(cor);
        }

        //Exiba as cores na ordem inversa da que foi informada
        List<String> listaCores = new ArrayList<>(arcoiris);
        System.out.println("\n--Cores na ordem inversa da que foi informada--");
        Collections.reverse(listaCores);
        for(String cor: listaCores){
            System.out.println(cor);
        }









    }

    static class ComparatorOrdemAlfabetica implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            return o1.compareToIgnoreCase(o2);
        }
    }


}
