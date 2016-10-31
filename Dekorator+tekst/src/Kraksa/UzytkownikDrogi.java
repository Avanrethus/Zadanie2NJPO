package Kraksa;

public abstract class UzytkownikDrogi extends PozycjaXY{
    public void ustawO(int pozX, int pozY, char obiekt){
        this.pozX = pozX;
        this.pozY = pozY;
        this.obiekt = obiekt;
    }
    
}
