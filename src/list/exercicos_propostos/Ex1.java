package list.exercicos_propostos;

import java.text.DecimalFormat;
import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        List<Double> listaTemperatura = new ArrayList<>(Arrays.asList(32d, 27d, 38d, 21d, 18d, 34d));

        System.out.println("Lista da temperatura dos meses do semestre: "+listaTemperatura.toString());
        Iterator<Double> iterador = listaTemperatura.iterator();
        Double soma = 0d;
        while (iterador.hasNext()){
            Double next = iterador.next();
            soma += next;
        }
        Double media = soma/listaTemperatura.size();
        System.out.println("Soma das temperaturas: "+soma);
        DecimalFormat df = new DecimalFormat("##.##");
        System.out.print("Temperatura média: ");
        System.out.print(df.format(media));

        System.out.print("\n--Temperaturas acima da média--");
        List<String> mesesSemestre = new ArrayList<>(Arrays.asList("Janeiro", "Fevereiro", "Março", "Abril", "Maio","Junho"));
        System.out.println();
        for(int i = 0, j = 0; i<listaTemperatura.size();i++, j++){
            if(listaTemperatura.get(i) > media){
                System.out.println("Mês: "+ mesesSemestre.get(j)+"\nTemperatura: "+listaTemperatura.get(i));
            }
        }
//
    }
}
