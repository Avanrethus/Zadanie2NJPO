package Kraksa;
import java.util.Random;
import java.util.Scanner;

public class Symulator {
        static String opt;
        PozycjaXY p = new Pieszy();
        PozycjaXY r = new Rowerzysta();
        PozycjaXY s = new Samochod();
        Random rand = new Random();
        static char [][] plansza = new char [10][20];
        
    public void ustawUzytkownika(PozycjaXY pozycjaNaPlanszy) {
        int pozX, pozY;
        do{
            pozX = (this.rand.nextInt(plansza.length));
            pozY = (this.rand.nextInt(plansza.length));
        }
        while(plansza[pozX][pozY] != '-');
        pozycjaNaPlanszy.pozX = pozX;
        pozycjaNaPlanszy.pozY = pozY;
    }
    
    public void rysujPlansze(){
        for(int i = 0; i<plansza.length; i++){
            for (int j = 0; j<plansza[i].length; j++){
                plansza[i][0] = '#';
                plansza[0][j] = '#';
                plansza[9][j] = '#';
                plansza[i][19] = '#';
                for(int x = 1; x<9; x++){
                    for (int y = 1; y<19; y++){
                        plansza[x][y] = '-';
                    }
                }
            }
        }
        ustawUzytkownika(this.p);
        ustawUzytkownika(this.r);
        ustawUzytkownika(this.s);
    }
    
    public void rysujUzytkownikow(){
        for(int i = 0; i<plansza.length; i++){
                for (int j = 0; j<plansza[i].length; j++){
                    if(this.p.getPozX()== i && this.p.getPozY()== j){
                        System.out.print(p.getObiekt());
                    }
                    else if(this.s.getPozX() == i && this.s.getPozY() == j){
                        System.out.print(s.getObiekt());
                    }
                    else if(this.r.getPozX() == i && this.r.getPozY() == j){
                        System.out.print(r.getObiekt());
                    }
                    else{
                    System.out.print(plansza[i][j]);
                    }
                }
            System.out.println();
        }
    }
    
    public void ruch(PozycjaXY pozycja){
        int ruch = 0;
        boolean sciana = false;
        Random r = new Random();
        do{
            sciana = false;
            ruch = r.nextInt(4)+1;
            if(ruch == 1){
                if(plansza[pozycja.getPozX() +1][pozycja.getPozY()] != '#' && pozycja.getPozX()+1 < plansza.length){
                    pozycja.setPozX(pozycja.getPozX() + 1);
                }
                else {
                    sciana = true;
                }
            }
            else if(ruch == 2){
                if(plansza[pozycja.getPozX()-1][pozycja.getPozY()] != '#' && pozycja.getPozX()-1 > 0){
                    pozycja.setPozX(p.getPozX()-1);
                }
                else{
                    sciana = true;
                }
                        
            }
            else if(ruch == 3){
                if(plansza[pozycja.getPozX()][pozycja.getPozY()+1] != '#' && pozycja.getPozY()+1 < plansza[0].length){
                    pozycja.setPozY(pozycja.getPozY()+1);
                }
                else{
                    sciana = true;
                }
            }
            else if (ruch == 4){
                if(plansza[pozycja.getPozX()][pozycja.getPozY()-1] != '#' && pozycja.getPozY()-1 > 0){
                    pozycja.setPozY(pozycja.getPozY()-1);
                }
                else{
                    sciana = true;
                }
            }
        }
        while(sciana == true);
    }
    public static void main(String [] args){
        Symulator s = new Symulator();
        Scanner scan = new Scanner(System.in);
        System.out.println("Witamy w symulatorze zachowań na drodze!");
        do{
            System.out.println("Wciśnij R aby rozpocząć symulacje lub X żeby wyjść.");
            opt = scan.nextLine();
            if (opt.equalsIgnoreCase("R")){
                s.rysujPlansze();
                s.rysujUzytkownikow();
                
            }
        }
        while(opt.toLowerCase().equals("X"));
        
        
    }
}
