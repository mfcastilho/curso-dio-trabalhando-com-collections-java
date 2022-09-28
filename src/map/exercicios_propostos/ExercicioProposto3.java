package map.exercicios_propostos;

import java.util.HashMap;
import java.util.Map;

public class ExercicioProposto3 {
    public static void main(String[] args) {

        Map<Integer, Contato> agenda = new HashMap<>(){{
            put(1, new Contato("Simba", 5555));
            put(4, new Contato("Cami", 1111));
            put(3, new Contato("Jon", 2222));
        }};

        for (Map.Entry<Integer, Contato> entry: agenda.entrySet()){
            System.out.println("id = "+entry.getKey()+ " - Contato = "+entry.getValue().getNome()+", número: "+entry.getValue().getNumero()+".");
        }
        

    }
}
