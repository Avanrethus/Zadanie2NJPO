package Teksty;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IloscSlow {
      public long policzIloscSlow (String nazwaPliku) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new DataInputStream(new FileInputStream(nazwaPliku))))){
           String wiersz;
           int iloscSlow = 0;
           while((wiersz = br.readLine())!= null)
           {
               wiersz = wiersz.replaceAll("[\t\n]", " ");
               if (!wiersz.isEmpty()){
                   iloscSlow = iloscSlow+ wiersz.split(" ").length;
               }                
           }
           System.out.println("Ilość słow w pliku: " + iloscSlow);
           return iloscSlow;
        }
    }
    public static void main (String [] args) throws IOException{
        String nazwaPliku;
        System.out.println("Witam!");
        do{
            System.out.println("Prosze podać ścieżkę do pliku: ");
            Scanner s = new Scanner(System.in);
            nazwaPliku = s.nextLine();
            if( nazwaPliku.contains(".txt") || nazwaPliku.contains(".docx")||nazwaPliku.contains(".doc")){
                IloscSlow is = new IloscSlow();
                is.policzIloscSlow(nazwaPliku);
                break;
            }
            else{
            System.out.println("Błędna ścieżka pliku!\n");
            }
        }
        while(nazwaPliku.contains(".txt")!=true || nazwaPliku.contains(".docx")!=true || nazwaPliku.contains(".doc")!=true);
    }
}
