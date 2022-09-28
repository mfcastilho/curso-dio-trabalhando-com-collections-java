package map.exercicios_propostos;

import java.util.*;

public class DesafioMap {
    public static void main(String[] args){
        Random random = new Random();
        List<Integer> dados = new ArrayList<>();

        for(int i = 0; i < 100; i++){
//            int numeroGerado = 1 + random.nextInt(1000);
            int numero = random.nextInt(6) + 1;
            dados.add(numero);
        }

        System.out.println("--\tColeção dos dados armazenados\t--");
        System.out.println(dados.toString());

        Map<Integer, Integer> lancamentos = new HashMap<>();

        for (Integer resultado:dados){
            if (lancamentos.containsKey(resultado)){
                lancamentos.put(resultado, (lancamentos.get(resultado) + 1));
            }else{
                lancamentos.put(resultado, 1);
            }
        }

        System.out.println("\nValor " + " Quant. de vezes");
        for (Map.Entry<Integer, Integer> entry : lancamentos.entrySet()) {
            System.out.printf("%3d %10d\n", entry.getKey(), entry.getValue());
        }




    }
}
