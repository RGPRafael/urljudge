/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problemasbee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author rafaelgps
 */
public class Listatelefonica {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linha ;
        ArrayList<String> strings =  new ArrayList<String>();
        while ((linha = br.readLine()) != null){
            int testes = Integer.parseInt(linha);
            for(int numerotelefone = 0; numerotelefone< testes; numerotelefone++){
               String numero = br.readLine();
               strings.add(numero);
            }
            Collections.sort(strings);
            Integer comum = 0;
            for(int index = 0; index < strings.size()-1;index++){
                String number =  strings.get(index);
                String othernumber = strings.get(index + 1);
                char[] numberchar = number.toCharArray();
                char[] othernumberchar = othernumber.toCharArray();
                int comumprovisorio = 0;
                for(int i = 0; i < numberchar.length; i++){
                    if(numberchar[i] == othernumberchar[i]) comumprovisorio++;
                    else break;  
                }
                if( comum == 0) comum = comumprovisorio;
                else comum = comum +  comumprovisorio;
            }
            System.out.println(comum);
            strings.clear();
        }  
    }
         
}
