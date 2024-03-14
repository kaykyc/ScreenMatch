import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.Classificavel;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {




        /*meuFilme.setIncluidoNoPlano(true);
        System.out.println("Incluído no plano");

        meuFilme.setIncluidoNoPlano(false);
        System.out.println("não incluido no plano");*/

        Serie lost =new Serie("Lost", 2003);
        lost.setMinutosPorEpisodio(50);
        lost.setAtiva(true);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.exibeFichaTecnica();
        System.out.println("Tempo em minutos para maratonar: " + lost.getDuracaoEmMinutos());

        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme. setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme. setDuracaoEmMinutos(200);


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio= new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalDeVisualizacoes(90);
        filtro.filtra(episodio);

        var filmeDoPaulo = new Filme("Dogville",2023);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avalia(10);

        ArrayList<Titulo> ListaDeTitulo = new ArrayList<>();
        ListaDeTitulo.add(filmeDoPaulo);
        ListaDeTitulo.add(outroFilme);
        ListaDeTitulo.add(meuFilme);
        ListaDeTitulo.add(lost);

        System.out.println("o numero de filmes é " + ListaDeTitulo.size());
        System.out.println("O primeiro é: " + ListaDeTitulo.get(1).getNome());
        System.out.println(ListaDeTitulo);



    }
}
