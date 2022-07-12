import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class amigos {
    public static void main(String[] args) {
        List<String> listaAmigos = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        String listaAmigosAtual =  sc.nextLine();
        String ListaNova = sc.nextLine();
        String amigo =  sc.nextLine();

        /*
        System.out.println( listaAmigosAtual);
        System.out.println( ListaNova);
        System.out.println( amigo);
         */

        String [] listaAmigosAtualArray = listaAmigosAtual.split(" ");
        String [] listaNovaArray = ListaNova.split(" ");
        if(amigo.equals("nao")){
            for(String i: listaAmigosAtualArray) listaAmigos.add(i);
            for(String i: listaNovaArray) listaAmigos.add(i);
        }
        else{
            for(String i: listaAmigosAtualArray) {
                if(!i.equals(amigo))listaAmigos.add(i);
                else{
                    for(String j: listaNovaArray)listaAmigos.add(j);
                    listaAmigos.add(i);
                }
            }
        }
        for(int i = 0; i < listaAmigos.size()-1; i++ ) System.out.print( listaAmigos.get(i) + ' ');
        System.out.println(listaAmigos.get( listaAmigos.size() - 1));
    }
}
