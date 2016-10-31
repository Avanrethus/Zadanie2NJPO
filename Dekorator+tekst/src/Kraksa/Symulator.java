package Kraksa;
import java.util.Random;
import java.util.Scanner;
public class Symulator {
    public static void main(String [] args){
        String opt;
        char [][] plansza = new char [10][20];
        Scanner s = new Scanner(System.in);
        System.out.println("Witamy w symulatorze zachowań na drodze!");
        do{
            System.out.println("Wciśnij R aby rozpocząć symulacje lub X żeby wyjść.");
            opt = s.nextLine();
            if (opt.equalsIgnoreCase("R")){
                for(int i = 0; i<plansza.length; i++){
                    for (int j = 0; j<plansza[i].length; j++){
                        plansza[i][0] = '#';
                        plansza[0][j] = '#';
                        plansza[9][j] = '#';
                        plansza[i][19] = '#';
                        for(int x = 1; x<9; x++){
                            for (int y = 1; y<19; y++){
                                plansza[x][y] = ' ';
                            }
                        }
                        System.out.print(plansza[i][j]);
                    }
                    System.out.println();
                }
            }
        }
        while(opt.toLowerCase().equals("X"));
        
        
    }
}
