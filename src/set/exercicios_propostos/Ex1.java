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

        //Exiba todas as cores que começam com "v"
        System.out.println("\nExibindo todas as cores que começam com a letra 'v'");
        for(String cor: arcoiris){
            if(cor.startsWith("v".toUpperCase(Locale.ROOT))){
                System.out.println(cor);
            }
        }

       //Remova todas as cores que NÃO começam com a letra 'v'
        Iterator<String> iterator = arcoiris.iterator();
        System.out.println("Removendo todas as cores que NÃO começam com a letra 'v'");
        while (iterator.hasNext()){
            if (!iterator.next().startsWith("V")){
                iterator.remove();
            }
        }
        System.out.println();
        for(String cor: arcoiris){
            System.out.println(cor);
        }
//      arcoiris.removeIf(cor -> !cor.startsWith("V"));//Versao simplificada

        //Limpe o Conjunto
        System.out.println("\n--Limpando o conjunto--");
        arcoiris.clear();
        System.out.println("\n--Conferindo se o conjunto está vazio--");
        System.out.println(arcoiris);














    }

    static class ComparatorOrdemAlfabetica implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            return o1.compareToIgnoreCase(o2);
        }
    }


}
