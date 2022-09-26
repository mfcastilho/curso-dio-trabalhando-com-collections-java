package set.como_se_declara_o_set;

import java.util.*;

public class ExemplosSet {
    public static void main(String[] args) {
//        Set numeros = new HashSet(); //antes do java 5
//
        Set<Double> notas = new HashSet<>();//Diamont Operator(jdk 7) não precisa repetir o tipo do lado direito


        notas.add(5d);
        notas.add(6d);
        notas.add(88d);
        notas.add(1d);
        notas.add(99d);
        notas.add(45d);
        notas.add(245d);
        notas.add(0d);
        notas.add(13d);

        System.out.println(notas);

        Set<Double> notas2 = new TreeSet<>(notas);
        System.out.println(notas2);
//
    }
}
