import java.util.*;

public class OlimpíadasdeNatal  {

    static class QuadroMedalha implements Comparable<QuadroMedalha> {
        String nome_pais;
        int ouro;
        int prata;
        int bronze;


        public QuadroMedalha(String nome_pais, int ouro, int prata, int bronze) {
            this.nome_pais = nome_pais;
            this.ouro = ouro;
            this.prata = prata;
            this.bronze = bronze;
        }

        /*
        *  O critério de desempate é, na ordem,
        * o número de medalhas de ouro seguido pelo
        * número de medalhas de prata e de bronze.
        * Se países empatarem nestes três critérios,
        * a listagem será por ordem ascendente do nome do país participante.*/
        @Override
        public int compareTo(QuadroMedalha pais) {
            if( pais.ouro > this.ouro) return pais.ouro - this.ouro;
            else if( pais.prata > this.prata ) return pais.prata - this.prata;
            else if( pais.bronze > this.bronze) return pais.bronze- this.bronze;
            return this.nome_pais.compareTo(pais.nome_pais);
        }

    }

    public static void entrada(Map<String, Integer> medalha, String line , List<String> s, int i ){
        System.out.println(i);
        if( medalha.containsKey(line))
            medalha.put(line, medalha.get(line) + 1 );
        else medalha.put(line, 1 );
        if( !s.contains(line) ) {
            s.add(line);
            System.out.println(i);
        }
    }

    public static void printMap(Map<String, Integer> medalha){
        for( String s : medalha.keySet()) System.out.print( s + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        String line;
        int contador =  0;
        Map<String, Integer> medalhaBronze =   new HashMap<>();
        Map<String, Integer> medalhaPrata  =   new HashMap<>();
        Map<String, Integer> medalhaOuro   =   new HashMap<>();
        List<String> paises_participantes   =   new ArrayList<>();
        while( sc.hasNext()){
            line = sc.nextLine().trim();
            if( contador == 1 ) entrada( medalhaOuro , line, paises_participantes , contador);
            else if( contador == 2 ) entrada(medalhaPrata, line, paises_participantes, contador);
            else if( contador == 3 )  entrada(medalhaBronze, line, paises_participantes, contador);
            contador++;
            if( contador == 4) contador = 0;
        }
        for( String s : paises_participantes)
            System.out.print( s + "  ");

        List<QuadroMedalha> paises_medalhas = new ArrayList<>();
        for( String nome: paises_participantes){
            int ouro = 0, prada = 0 , bronze = 0;
            if( medalhaOuro.containsKey(nome)) ouro =  medalhaOuro.get(nome);
            if( medalhaPrata.containsKey(nome)) prada = medalhaPrata.get(nome);
            if( medalhaBronze.containsKey(nome)) bronze = medalhaBronze.get(nome);
            QuadroMedalha paises = new QuadroMedalha(nome,ouro,prada,bronze);
            paises_medalhas.add( paises);
        }
        Collections.sort(paises_medalhas);
        for( QuadroMedalha q : paises_medalhas)
            System.out.println( q.nome_pais);
        System.out.println( "Quadro de Medalhas");



    }
}
