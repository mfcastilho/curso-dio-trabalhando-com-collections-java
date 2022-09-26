package list.como_se_declara_o_list;

import java.util.*;

public class ExemploList {
    public static void main(String[] args) {

//        List numeros = new ArrayList(); //antes do java 5
//        List<Integer> numeros = new ArrayList<Integer>();//a partir do java 5(jdk5) surge o conceito de generics(Wrappers)
        List<Double> notas = new ArrayList<>();//Diamont Operator(jdk 7) não precisa repetir o tipo do lado direito

//        List<Integer> numeros = new ArrayList<>(Arrays.asList(2,34,5,7,4,4,2,2));
//        List<Integer> numeros = Arrays.asList(2,4,5,7,78,98,8);//Implementação imutável
//        List<Integer> numeros = List.of(2,3,54,6,7,4,3,2);//Implementação imutável

        notas.add(5d);
        notas.add(6d);
        notas.add(88d);
        notas.add(1d);
        notas.add(99d);
        notas.add(45d);
        System.out.println(notas.toString());
        System.out.println();

        notas.set(3, 102d);
        System.out.println(notas.toString());
        System.out.println(notas.indexOf(455));
        System.out.println(notas.contains(88d));
        for (Double nota: notas){
            System.out.println(nota);
        }
        System.out.println(notas.get(2));
        System.out.println("Menor nota:"+Collections.min(notas));
        System.out.println("Maior nota:"+Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma das notas:"+soma);


        System.out.println("Média notas"+ soma/notas.size());

        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator.next();
            if(next < 7){
                iterator1.remove();
            }
        }
        System.out.println("Removendo notas menos que 7"+ notas);

        notas.clear();









    }
}
