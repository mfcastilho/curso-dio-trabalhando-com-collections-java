package map.exercicios_propostos;

import java.util.*;

public class Ex1 {
    public static void main(String[] args) {

        Map<String, Double> estadosBrasileiros = new HashMap<>(){{
            put("PE", 9616621d);
            put("AL", 3351543d);
            put("CE", 9187103d);
            put("RN", 3534265d);
        }};

        System.out.println("--\tChaves e Valores iniciais do dicionário de estados brasileiros\t--");
        System.out.println(estadosBrasileiros);

        //Substitua a população do estado do RN por 3534165
        System.out.println("\n--\tSubstitua a população do estado do RN por 3534165\t--");
        estadosBrasileiros.put("RN", 3534165d);
        System.out.println(estadosBrasileiros);

        //Confira se  estado da PB está no dicionário, caso não, adicione: PB - 4036277
        System.out.println("\n--\tConfira se  estado da PB está no dicionário, caso não, adicione: PB - 4036277\t--");
        estadosBrasileiros.put("PB", 4036277d);
        System.out.println(estadosBrasileiros);

        //Exiba a população de PE
        System.out.println("\n--\tExiba a população de PE\t--");
        System.out.println(estadosBrasileiros.get("PE"));

        //Exiba todos os estados e suas populações em ordem que foi informado
        System.out.println("\n--\tExiba todos os estados e suas populações em ordem que foi informado\t--");
        Map<String, Double> estadosBrasileiros1 = new LinkedHashMap<>(){{
            put("PE", 9616621d);
            put("AL", 3351543d);
            put("CE", 9187103d);
            put("RN", 3534265d);
        }};
        System.out.println(estadosBrasileiros1);

        //Exiba os estado e suas populações em ordem alfabética
        System.out.println("\n--\tExiba os estado e suas populações em ordem alfabética\t--");
        Set<Map.Entry<String, Double>> estadosBrasileiros2 = new TreeSet<>(new ComparatorEstadosPorOrdemAlfabetica());
        estadosBrasileiros2.addAll(estadosBrasileiros.entrySet());
        System.out.println(estadosBrasileiros2);




        //Exiba o estado com a menor população e sua quantidade
        System.out.println("\n--\tExiba o estado com a menor população e sua quantidade\t--");
        System.out.println(Collections.min(estadosBrasileiros.values()));

        //Exiba o estado com a maior população e sua quantidade
        System.out.println("\n--\tExiba o estado com a maior população e sua quantidade\t--");
        System.out.println(Collections.max(estadosBrasileiros.values()));

        //Exiba a soma da população desses estados
        System.out.println("\n--\tExiba a soma da população desses estados\t--");
        Iterator<Double> iterator = estadosBrasileiros.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma);

        //Exiba a média da população deste dicionário de estados
        System.out.println("\n--\tExiba a média da população deste dicionário de estados\t--");
        System.out.println(soma/estadosBrasileiros.size());

        //Remova os estados com a população menor que 4000000
        Iterator<Double> iterator1 = estadosBrasileiros.values().iterator();
        System.out.println("\n--\tRemova os estados com a população menor que 4000000\t--");
        while (iterator1.hasNext()){
            if (iterator1.next() <= 4000000){
                iterator1.remove();
            }
        }
        System.out.println(estadosBrasileiros);


        //Apague o dicionário de estados
        System.out.println("\n--\tApague o dicionário de estados\t--");
        estadosBrasileiros.clear();

        //Confira se o dicionário está vazio
        System.out.println("\n--\tConfira se o dicionário está vazio\t--");
        System.out.println(estadosBrasileiros.isEmpty());
    }
}

class ComparatorEstadosPorOrdemAlfabetica implements Comparator<Map.Entry<String, Double>> {

    @Override
    public int compare(Map.Entry<String, Double> estado1, Map.Entry<String, Double> estado2) {
        return estado1.getKey().compareToIgnoreCase(estado2.getKey());
    }
}
