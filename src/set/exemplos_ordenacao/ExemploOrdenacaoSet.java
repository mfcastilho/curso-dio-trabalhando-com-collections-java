package set.exemplos_ordenacao;

import java.util.*;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {

        //Ordem aleatória
        System.out.println("---\tOrdem aleatória\t---");
        Set<Serie> minhasSeries = new HashSet<>(){{
           add(new Serie("got", "fantasia",60));
            add(new Serie("dark", "drama",60));
            add(new Serie("that '70s show", "comédia",25));
        }};
        for (Serie serie: minhasSeries){
            System.out.println(serie.getNome()+" - "+serie.getGenero()+" - "+serie.tempoEpisodio);
        }


        //Ordem de inserção
        System.out.println("\n---\tOrdem de inserção\t---");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("got", "fantasia",60));
            add(new Serie("dark", "drama",60));
            add(new Serie("that '70s show", "comédia",25));
        }};
        for (Serie serie: minhasSeries1){
            System.out.println(serie.getNome()+" - "+serie.getGenero()+" - "+serie.tempoEpisodio);
        }


        //Ordem Natural
        System.out.println("\n---\tOrdem Natural (TempoEpisodio)\t---");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie: minhasSeries2){
            System.out.println(serie.getNome()+" - "+serie.getGenero()+" - "+serie.tempoEpisodio);
        }


        //Ordem nome/cor/idade
        System.out.println("\n---\tOrdem nome/gênero/tempoEpisodio\t---");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries);
        for (Serie serie: minhasSeries3){
            System.out.println(serie.getNome()+" - "+serie.getGenero()+" - "+serie.tempoEpisodio);
        }



    }

    public static class Serie implements Comparable<Serie>{

        private String nome;
        private String genero;
        private Integer tempoEpisodio;

        public Serie(String nome, String genero, Integer tempoEpisodio) {
            this.nome = nome;
            this.genero = genero;
            this.tempoEpisodio = tempoEpisodio;
        }

        public String getNome() {
            return nome;
        }

        public String getGenero() {
            return genero;
        }

        public Integer getTempoEpisodio() {
            return tempoEpisodio;
        }

        @Override
        public String toString() {
            return "{" +
                    "nome='" + nome + '\'' +
                    ", genero='" + genero + '\'' +
                    ", tempoEpisodio=" + tempoEpisodio +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Serie serie = (Serie) o;
            return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nome, genero, tempoEpisodio);
        }


        @Override
        public int compareTo(Serie serie) {
            int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
            int genero = this.getGenero().compareTo(serie.getGenero());
            if(tempoEpisodio != 0){
                return tempoEpisodio;
            }
            return genero;
        }
    }
    static class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie>{

        @Override
        public int compare(Serie serie1, Serie serie2) {
            int nome = serie1.getNome().compareToIgnoreCase(serie2.getNome());
            int genero = serie1.getGenero().compareToIgnoreCase(serie2.getNome());
            int tempoEpisodio = Integer.compare(serie1.getTempoEpisodio(), serie2.getTempoEpisodio());

            if(nome !=0 ){
                return nome;
            }else  if(genero != 0){
                return genero;
            }
            return tempoEpisodio;
        }
    }
}
