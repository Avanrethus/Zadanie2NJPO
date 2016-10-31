package Kraksa;

public class Rowerzysta extends UzytkownikDrogi {
    PozycjaXY pozycjaR;
    
    Rowerzysta(){
        this.pozycjaR = pozycjaR;
        this.ustawO();
        this.setPredkoscO(2);
        this.setObiekt('R');
    }
    
    Rowerzysta(PozycjaXY pozycjaR){
        this.pozycjaR = pozycjaR;
        this.ustawO();
        this.setPredkoscO(2);
        this.setObiekt('R');
    }

    @Override
    public void ustawO() {
        this.setPredkoscO(2);
        this.setObiekt('R');
    }
}
