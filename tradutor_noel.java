import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class tradutor_noel {

    static String dic =  "brasil              Feliz Natal!\n" +
            "alemanha            Frohliche Weihnachten!\n" +
            "austria             Frohe Weihnacht!\n" +
            "coreia              Chuk Sung Tan!\n" +
            "espanha             Feliz Navidad!\n" +
            "grecia              Kala Christougena!\n" +
            "estados-unidos      Merry Christmas!\n" +
            "inglaterra          Merry Christmas!\n" +
            "australia           Merry Christmas!\n" +
            "portugal            Feliz Natal!\n" +
            "suecia              God Jul!\n" +
            "turquia             Mutlu Noeller\n" +
            "argentina           Feliz Navidad!\n" +
            "chile               Feliz Navidad!\n" +
            "mexico              Feliz Navidad!\n" +
            "antardida           Merry Christmas!\n" +
            "canada              Merry Christmas!\n" +
            "irlanda             Nollaig Shona Dhuit!\n" +
            "belgica             Zalig Kerstfeest!\n" +
            "italia              Buon Natale!\n" +
            "libia               Buon Natale!\n" +
            "siria               Milad Mubarak!\n" +
            "marrocos            Milad Mubarak!\n" +
            "japao               Merii Kurisumasu!";

    public static Map givedata(){
        //parse string
        Map <String , String> map  = new HashMap <String, String>();
        String [] array_chaveValor =  dic.split("\n");
        for( String string : array_chaveValor){
            //System.out.println( string );
            int n = string.indexOf(" ");
            String chave = string.substring(0, n );
            String valor =  string.substring( n , string.length()).trim();
            map.put(chave, valor);
        }
        return map;
    }


    public static void main(String[] args) {
        Map <String, String> map  =  givedata();
        Scanner scanner = new Scanner( System.in);
        while( scanner.hasNext() ){
            String string = scanner.next();
            if( map.containsKey(string )) System.out.println( map.get(string));
            else System.out.println( "--- NOT FOUND ---");
        }
    }

}
