package list.exercicos_propostos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> respostas = new ArrayList<>();

        System.out.println("1-Telefonou pra vítima?");
        System.out.println("RESPONDA S PARA SIM E N PARA NÃO");
        System.out.print("Resp:");
        respostas.add(scan.nextLine());

        System.out.println("2-Esteve no local do crime?");
        System.out.println("RESPONDA S PARA SIM E N PARA NÃO");
        System.out.print("Resp:");
        respostas.add(scan.nextLine());

        System.out.println("3-Mora perto da vítima?");
        System.out.println("RESPONDA S PARA SIM E N PARA NÃO");
        System.out.print("Resp:");
        respostas.add(scan.nextLine());

        System.out.println("4-Devia dinheiro para a vítima?");
        System.out.println("RESPONDA S PARA SIM E N PARA NÃO");
        System.out.print("Resp:");
        respostas.add(scan.nextLine());

        System.out.println("5-Já trabalhou para a vítima?");
        System.out.println("RESPONDA S PARA SIM E N PARA NÃO");
        System.out.print("Resp:");
        respostas.add(scan.nextLine());

        System.out.println(respostas.toString());

        System.out.println(retornaClassificacaoDoSuspeito(respostas));

    }

    public static String retornaClassificacaoDoSuspeito(List<String> respostas){
        int totalRespostaPositivo = 0;

        for(String resposta: respostas){
            if(resposta.equalsIgnoreCase("s")){
                totalRespostaPositivo++;
            }
        }

        if(totalRespostaPositivo == 2){
            return "Suspeita";
        }else if(totalRespostaPositivo >= 3 && totalRespostaPositivo <= 4){
            return "Cúmplice";
        }else if(totalRespostaPositivo == 5){
            return "Assassina";
        }else{
            return  "Inocente";
        }
    }
}
