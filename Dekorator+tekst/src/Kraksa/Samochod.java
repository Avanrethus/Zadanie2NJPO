package Kraksa;

public class Samochod extends UzytkownikDrogi {
    UzytkownikDrogi S;
    
    Samochod(){
        this.S = S;
        this.ustawO();
        this.setPredkoscO(3);
        this.setObiekt('S');
    }
    
    Samochod(UzytkownikDrogi S){
        this.S = S;
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
