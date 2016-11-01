package Kraksa;

public class Pieszy extends UzytkownikDrogi {
    UzytkownikDrogi P;
    
    Pieszy(){
        this.P = P;
        this.ustawO();
        this.setPredkoscO(1);
        this.setObiekt('P');
    }
    
    Pieszy(UzytkownikDrogi P){
        this.P = P;
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
