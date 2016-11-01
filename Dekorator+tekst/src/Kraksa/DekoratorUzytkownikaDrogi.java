
package Kraksa;

import java.util.Random;

public class DekoratorUzytkownikaDrogi extends UzytkownikDrogi{
    UzytkownikDrogi pozycja;
    int i;
    
    DekoratorUzytkownikaDrogi(UzytkownikDrogi p){
        Random random = new Random();
        i= random.nextInt(10)+1;
        if (p.getObiekt()=='P')
        {   
            if(i == 5){
                this.setPredkoscO(3);
                this.setObiekt('S');
            }
            else if(i==10){
                this.setPredkoscO(2);
                this.setObiekt('R');
            }
        }
        if(p.getObiekt()=='S'){
            if(i == 5){
                this.setPredkoscO(1);
                this.setObiekt('P');
            }
        }
        if (p.getObiekt()=='R'){
            if(i==5){
                this.setPredkoscO(1);
                this.setObiekt('P');
            }
        }
    }
    
    @Override
    public void ustawO() {
        this.getObiekt();
        this.getPredkoscO();
    }
}
