package Kraksa;

public abstract class UzytkownikDrogi{
    public abstract void ustawO();
    public int pozX;
    public int pozY;
    public int predkoscO;
    public char obiekt;
    public char getObiekt() {
        return obiekt;
    }

    public void setObiekt(char obiekt) {
        this.obiekt = obiekt;
    }
    
    public int getPozX() {
        return pozX;
    }

    public void setPozX(int pozX) {
        this.pozX = pozX;
    }

    public int getPozY() {
        return pozY;
    }

    public void setPozY(int pozY) {
        this.pozY = pozY;
    }

    public int getPredkoscO() {
        return predkoscO;
    }

    public void setPredkoscO(int predkoscO) {
        this.predkoscO = predkoscO;
    }
}
