package Teksty;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


public class IloscWierszy {
    
    public long policzIloscWiersz (String nazwaPliku) throws IOException {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(nazwaPliku),1024)){
            byte [] bit = new byte [1024];
            boolean pusty = true;
            boolean ostatniPusty = false;
            long iloscWierszy = 0;
            int czytajWiersze;
            
            while ((czytajWiersze = bis.read(bit)) != -1){
                for(int i = 0; i< czytajWiersze; i++){
                    if(bit[i]=='\n'){
                        iloscWierszy++;
                        ostatniPusty = true;
                    }
                    else if(ostatniPusty){
                        ostatniPusty = false;
                    }
                }
                pusty = false;
            }
            if(!pusty){
                if (iloscWierszy ==0){
                    iloscWierszy =  1;
                }
                else if(!ostatniPusty){
                    iloscWierszy++;
                }
            }
            System.out.println("Ilość wierszy w pliku: " + iloscWierszy);
            return iloscWierszy;
        }
    }
    public static void main (String [] args) throws IOException{
        String nazwaPliku;
        System.out.println("Witam!");
        do{
            System.out.println("Prosze podać ścieżkę do pliku: ");
            Scanner s = new Scanner(System.in);
            nazwaPliku = s.nextLine();
            if( nazwaPliku.contains(".txt")){
                IloscWierszy iw = new IloscWierszy();
                iw.policzIloscWiersz(nazwaPliku);
            }
            else{
            System.out.println("Błędna ścieżka pliku!\n");
            }
        }
        while(nazwaPliku.contains(".txt")!=true);
    }
}