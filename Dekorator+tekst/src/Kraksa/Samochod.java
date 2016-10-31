package Kraksa;

public class Samochod extends UzytkownikDrogi {
    PozycjaXY pozycjaS;
    
    Samochod(){
        this.pozycjaS = pozycjaS;
        this.ustawO();
        this.setPredkoscO(3);
        this.setObiekt('S');
    }
    
    Samochod(PozycjaXY pozycjaS){
        this.pozycjaS = pozycjaS;
        this.ustawO();
        this.setPredkoscO(3);
        this.setObiekt('S');
    }

    @Override
    public void ustawO() {
        this.setPredkoscO(3);
        this.setObiekt('S');
    }
}
