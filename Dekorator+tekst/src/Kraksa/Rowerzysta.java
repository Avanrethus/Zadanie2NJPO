package Kraksa;

public class Rowerzysta extends UzytkownikDrogi {
    UzytkownikDrogi R;
    
    Rowerzysta(){
        this.R = R;
        this.ustawO();
        this.setPredkoscO(2);
        this.setObiekt('R');
    }
    
    Rowerzysta(UzytkownikDrogi R){
        this.R = R;
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
