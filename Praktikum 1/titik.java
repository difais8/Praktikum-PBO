class titik {
    // Atribut
    double absis;
    double ordinat;
    static int counter;

    // Method
    titik (){
        counter++;
        absis = 0;
        ordinat = 0;
    }

    titik (double a, double b){
        counter++;
        absis = a;
        ordinat = b;
    }

    public void setAbsis(double absis){
        this.absis = absis;
    }
    public void setOrdinat(double ordinat){
        this.ordinat = ordinat;
    }
    public double getAbsis(){
        return absis;
    }
    public double getOrdinat(){
        return ordinat;
    }
    public int getCounter(){
        return counter;
    }
}