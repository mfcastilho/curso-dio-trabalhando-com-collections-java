package map.exercicios_propostos;

import java.util.*;

public class ExercicioProposto3 {
    public static void main(String[] args) {

        System.out.println("\n--\tOrdem aleatória\t--");
        Map<Integer, Contato> agenda = new HashMap<>(){{
            put(1, new Contato("Simba", 5555));
            put(4, new Contato("Cami", 1111));
            put(3, new Contato("Jon", 2222));
        }};

        for (Map.Entry<Integer, Contato> entry: agenda.entrySet()){
            System.out.println("id = "+entry.getKey()+ " - Contato = "+entry.getValue().getNome()+", número: "+entry.getValue().getNumero()+".");
        }


        System.out.println("\n--\tOrdem de insersão\t--");
        Map<Integer, Contato> agenda1 = new LinkedHashMap<>(){{
            put(1, new Contato("Simba", 5555));
            put(4, new Contato("Cami", 1111));
            put(3, new Contato("Jon", 2222));
        }};

        for (Map.Entry<Integer, Contato> entry: agenda1.entrySet()){
            System.out.println("id = "+entry.getKey()+ " - Contato = "+entry.getValue().getNome()+", número: "+entry.getValue().getNumero()+".");
        }


        System.out.println("\n--\tOrdem id\t--");
        Set<Map.Entry<Integer, Contato>> lancamentoId = new TreeSet<>(new ComparatorId());
        lancamentoId.addAll(agenda.entrySet());
        for(Map.Entry<Integer, Contato> entry: lancamentoId){
            System.out.println("id = "+entry.getKey()+ " - Contato = "+entry.getValue().getNome()+", número: "+entry.getValue().getNumero()+".");
        }




        System.out.println("\n--\tOrdem número telefone\t--");
        Set<Map.Entry<Integer, Contato>> lancamentoTel = new TreeSet<>(new ComparatorNumeroTelefone());
        lancamentoTel.addAll(agenda.entrySet());
        for(Map.Entry<Integer, Contato> entry: lancamentoTel){
            System.out.println("id = "+entry.getKey()+ " - Contato = "+entry.getValue().getNome()+", número: "+entry.getValue().getNumero()+".");
        }



        System.out.println("\n--\tOrdem nome contato\t--");
        Set<Map.Entry<Integer, Contato>> lancamentoNome = new TreeSet<>(new ComparatorNomeContato());
        lancamentoNome.addAll(agenda.entrySet());
        for(Map.Entry<Integer, Contato> entry: lancamentoNome){
            System.out.println("id = "+entry.getKey()+ " - Contato = "+entry.getValue().getNome()+", número: "+entry.getValue().getNumero()+".");
        }
    }
}

class ComparatorId implements Comparator<Map.Entry<Integer, Contato>> {

    @Override
    public int compare(Map.Entry<Integer, Contato> id1, Map.Entry<Integer, Contato> id2) {
        return Integer.compare(id1.getKey(), id2.getKey());
    }
}

class ComparatorNumeroTelefone implements Comparator<Map.Entry<Integer, Contato>>{

    @Override
    public int compare(Map.Entry<Integer, Contato> tel1, Map.Entry<Integer, Contato> tel2) {
        return Integer.compare(tel1.getValue().getNumero(), tel2.getValue().getNumero());
    }
}

class ComparatorNomeContato implements Comparator<Map.Entry<Integer, Contato>>{

    @Override
    public int compare(Map.Entry<Integer, Contato> nome1, Map.Entry<Integer, Contato> nome2) {
        return nome1.getValue().getNome().compareToIgnoreCase(nome2.getValue().getNome());
    }
}
