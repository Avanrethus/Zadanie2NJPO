package Kraksa;
import java.util.Random;
import java.util.Scanner;

public class Symulator {
        UzytkownikDrogi p = new Pieszy();
        UzytkownikDrogi r = new Rowerzysta();
        UzytkownikDrogi s = new Samochod();
        Random rand = new Random();
        static char [][] plansza = new char [10][20];
        
    public void ustawUzytkownika(UzytkownikDrogi ud) {
        int pozX, pozY;
        do{
            pozX = (this.rand.nextInt(plansza.length));
            pozY = (this.rand.nextInt(plansza.length));
        }
        while(plansza[pozX][pozY] != '-');
        ud.pozX = pozX;
        ud.pozY = pozY;
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
    
    public void ruch(UzytkownikDrogi ud){
        int ruch ;
        boolean sciana;
        Random random = new Random();
        do{
            sciana = false;
            ruch = random.nextInt(4)+1;
            switch (ruch) {
                case 1:
                    if(plansza[ud.getPozX() +1][ud.getPozY()] != '#' && ud.getPozX()+1 < plansza.length){
                        ud.setPozX(ud.getPozX() + 1);
                    }
                    else {
                        sciana = true;
                    }   break;
                case 2:
                    if(plansza[ud.getPozX()-1][ud.getPozY()] != '#' && ud.getPozX()-1 > 0){
                        ud.setPozX(p.getPozX()-1);
                    }
                    else{
                        sciana = true;
                    }   break;
                case 3:
                    if(plansza[ud.getPozX()][ud.getPozY()+1] != '#' && ud.getPozY()+1 < plansza[0].length){
                        ud.setPozY(ud.getPozY()+1);
                    }
                    else{
                        sciana = true;
                    }   break;
                case 4:
                    if(plansza[ud.getPozX()][ud.getPozY()-1] != '#' && ud.getPozY()-1 > 0){
                        ud.setPozY(ud.getPozY()-1);
                    }
                    else{
                        sciana = true;
                    }   break;
                default:
                    break;
            }
        }
        while(sciana == true);
    }
    public void Kolizja(){
        if(r.getPozX()==p.getPozX() && r.getPozY()==p.getPozY()){
            System.out.println("Kraksa! Rowerzysta zderzył się z pieszym. Koniec symulacji");
            System.exit(0);
        }
        if(r.getPozX()==s.getPozX() && r.getPozY()==s.getPozY()){
            System.out.println("Kraksa! Samochód wjechał w rowerzystę. Koniec symulacji");
            System.exit(0);
        }
        else if(s.getPozX()==p.getPozX()&& s.getPozY()==p.getPozY()){
            System.out.println("Kraksa! Pieszy wpadł pod samochód. Koniec symulacji");
            System.exit(0);
        }
    }
    
    public void Symulacja(){
        for (int i = 0; i<s.predkoscO; i++){
            ruch(s);
            Kolizja();
        }
        for (int i = 0; i <r.predkoscO; i++){
            ruch(r);
            Kolizja();
        }
        for (int i = 0; i<p.predkoscO; i++){
            ruch(p);
            Kolizja();
        }
    }
    
    public static void main(String [] args){
        String opt="";
        Symulator s = new Symulator();
        Scanner scan = new Scanner(System.in);
        System.out.println("Witamy w symulatorze zachowań na drodze!");
        s.rysujPlansze();
        do{
            System.out.println("Wciśnij R aby rozpocząć symulacje lub X żeby wyjść.");
            opt = scan.nextLine();
            if (opt.equalsIgnoreCase("R")){
                s.rysujUzytkownikow();
                s.Symulacja();
            }
        }
        while(opt.toLowerCase().compareTo("x")!= 0);
    }
}
