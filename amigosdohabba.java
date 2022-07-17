import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 2136 */
public class amigosdohabba {
    public static void main(String[] args) {
        String line;
        List <String > escolha_sim = new ArrayList<>();
        List <String> escolha_nao  = new ArrayList<>();
        Scanner sc = new Scanner( System.in);
        String escolhido =  "";
        while(sc.hasNextLine()){
            line = sc.nextLine();
            //System.out.println(line);
            if( line.equalsIgnoreCase("FIM")) break;
            String[] entrada = line.split(" ");
            String nome = entrada[0];
            String escolha = entrada[1];
            if( escolha.equalsIgnoreCase("YES") && !escolha_sim.contains(nome)) {
                escolha_sim.add(nome);
                int max =  escolhido.length();
                int size_atual =  nome.length();
                if(max < size_atual) escolhido = nome;

            }
            else if ( escolha.equalsIgnoreCase("NO") ) escolha_nao.add(nome);
        }
        Collections.sort(escolha_sim);
        Collections.sort(escolha_nao);
        for( String nome : escolha_sim)System.out.println(nome);
        for( String nome : escolha_nao)System.out.println(nome);
        System.out.println();
        System.out.println( "Amigo do Habay:");
        System.out.println( escolhido);


    }
}
