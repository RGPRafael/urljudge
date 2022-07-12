import java.util.Scanner;

public class Mn {
    public static void main(String[] args) {
        Scanner sc =  new Scanner( System.in);
        while( sc.hasNextLine() ){
            int soma  = 0;
            String line = sc.nextLine();
            String [] valores =  line.split(" ");
            int M =  Integer.parseInt(valores[0]);
            int N =  Integer.parseInt(valores[1]);
            if( M <= 0 || N <= 0 ) break;
            else{
                if( N > M ) {
                    int aux =  M;
                    M =  N;
                    N = aux;
                }
                for( int i = N ; i <= M; i++){
                    soma =  soma + i ;
                    System.out.print( i + " " );
                }
                System.out.println( "Sum=" + soma );
            }

        }
    }
}
