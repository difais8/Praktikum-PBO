public class Titik{
    private double absis;
    private double ordinat;

    public Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
    }
    public Titik(){
        this(0,0);
    }
    public double getOrdinat(){
        return this.ordinat;
    }
    public double getAbsis(){
        return this.absis;
    }
    public void setAbsis(double absis){
        this.absis = absis;
    }
    public void setOrdinat(double ordinat){
        this.ordinat = ordinat;
    }

    public double getJarakPusat() {

        double jumlah = Math.pow(this.absis, 2) + Math.pow(this.ordinat, 2);
    
        return Math.sqrt(jumlah);
    }
    public void refleksiX() {
    this.absis = -this.absis;
    }

    public void refleksiY() {
        this.ordinat = -this.ordinat;
    }

    public Titik getRefleksiX() {
        Titik baru = new Titik(this.absis, this.ordinat);
        baru.refleksiX();
        return baru;
    }

    public Titik getRefleksiY() {
        Titik baru = new Titik(this.absis, this.ordinat);
        baru.refleksiY();
        return baru;
    }
}