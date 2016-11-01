
package Kraksa;

import java.util.Random;

public class DekoratorUzytkownikaDrogi extends UzytkownikDrogi{
    UzytkownikDrogi pozycja;
    
        
    
    DekoratorUzytkownikaDrogi(UzytkownikDrogi p){
        Random random = new Random();
        int i = random.nextInt(10)+1;
        if (p.getObiekt()=='P')
        {   
            if(i == 5){
                this.predkoscO = predkoscO +3;
                this.obiekt = 'S';
            }
            else if(i==10){
                this.predkoscO = predkoscO+1;
                this.obiekt = 'R';
            }
        }
        if(p.getObiekt()=='S'){
            if(i == 5){
                this.predkoscO = predkoscO - 2;
                this.obiekt = 'P';
            }
        }
        if (p.getObiekt()=='R'){
            if(i == 5){
                this.predkoscO = predkoscO -1;
                this.obiekt = 'P';
            }
        }
    }
    
    @Override
    public void ustawO() {
        this.getPredkoscO();
        this.getObiekt();
    }
}
