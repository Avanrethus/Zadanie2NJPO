package Kraksa;

public class Pieszy extends UzytkownikDrogi {
    PozycjaXY pozycjaP;
    
    Pieszy(){
        this.pozycjaP = pozycjaP;
        this.ustawO();
        this.setPredkoscO(1);
        this.setObiekt('P');
    }
    
    Pieszy(PozycjaXY pozycjaP){
        this.pozycjaP = pozycjaP;
        this.ustawO();
        this.setPredkoscO(1);
        this.setObiekt('P');
    }

    @Override
    public void ustawO() {
        this.setPredkoscO(1);
        this.setObiekt('P');
    }
    
}
