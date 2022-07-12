import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.LinkedList;
import java.util.Scanner;

public class voleibol {

    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in);
        int num_casos = Integer.valueOf(scan.nextLine());
        LinkedList<String> nomes  =  new LinkedList<>();
        LinkedList <String> saques = new LinkedList<>();
        LinkedList<String> bloqueios = new LinkedList<>();
        LinkedList<String> ataques = new LinkedList<>();
        LinkedList<String> saque_sucesso = new LinkedList<>();
        LinkedList<String> bloqueios_sucesso = new LinkedList<>();
        LinkedList<String> ataques_sucesso = new LinkedList<>();
        double result_1 , result_2, result_3 ;
        double total_1 = 0 , total_2 = 0, total_3 = 0;
        double acertos_1 = 0, acertos_2 = 0, acertos_3 = 0;

        for( int i = 0; i < num_casos; i++){
            String name = scan.nextLine();
            nomes.add(name);
            String line = scan.nextLine();

            String [] tentativas =  line.split(" ");

            saques.add( tentativas[0]);
            bloqueios.add( tentativas[1]);
            ataques.add( tentativas[2]);
            line = scan.nextLine();

            String [] sucesso =  line.split(" ");
            saque_sucesso.add( sucesso[0]);
            bloqueios_sucesso.add( sucesso[1]);
            ataques_sucesso.add( sucesso[2]);


        }
        for( int i = 0;  i < saques.size(); i++ ){
            total_1 = total_1 + Double.parseDouble(saques.get(i));
            acertos_1 = acertos_1 + Double.parseDouble(saque_sucesso.get(i) );
            total_2 = total_2 + Double.parseDouble(bloqueios.get(i));
            acertos_2 = acertos_2 + Double.parseDouble(bloqueios_sucesso.get(i) );
            total_3 = total_3 + Double.parseDouble(ataques.get(i));
            acertos_3 = acertos_3 + Double.parseDouble(ataques_sucesso.get(i) );
        }
        NumberFormat d= new DecimalFormat("0.00");
        result_1 = (acertos_1 / total_1 )  * 100;
        result_2 = (acertos_2 / total_2 )  * 100;
        result_3 = (acertos_3 / total_3 )  * 100;
        System.out.println( "Pontos de Saque: " + d.format(result_1) + " %" );
        System.out.println( "Pontos de Bloqueio: " + d.format(result_2) + " %" );
        System.out.println( "Pontos de Ataque: " + d.format(result_3) + " %" );

    }
}
