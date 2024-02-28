public class Garis {
    private Titik titikAwal;
    private Titik titikAkhir;

    public Garis(Titik titikAwal, Titik titikAkhir){
    this.titikAwal = titikAwal;
    this.titikAkhir = titikAkhir;
    }

    public Garis() {
        this(new Titik(), new Titik());
    }

    public void setTitikAwal(Titik titikAwal){
        this.titikAwal = titikAwal;
    }

  public void setTitikAkhir(Titik titikAkhir){
    this.titikAkhir = titikAkhir;
  }
    
  public Titik getTitikAwal(){
    return this.titikAwal;
  }

  public Titik getTitikAkhir() {
    return this.titikAkhir;
  }

  public double getPanjang() {

    double absis = this.titikAkhir.getAbsis() - this.titikAwal.getAbsis();
    double ordinat = this.titikAkhir.getOrdinat() - this.titikAkhir.getOrdinat();

    double jarak = Math.pow(absis, 2) + Math.pow(ordinat, 2);

    return Math.sqrt(jarak); 
  }

  public double getGradien() {

    double absis = this.titikAkhir.getAbsis() - this.titikAwal.getAbsis();
    double ordinat = this.titikAkhir.getOrdinat() - this.titikAkhir.getOrdinat();

    double gradien = absis/ordinat;

    return gradien; 
  }

  public Garis getRefleksi() {
    Garis g1 = new Garis(this.titikAwal, this.titikAkhir);

    g1.titikAkhir.refleksiX();
    g1.titikAwal.refleksiX();

    return g1;
  }

  public boolean isTegakLurus(Garis Garis) {
    Garis g1 = new Garis(this.titikAwal, this.titikAkhir);

    double tegaklurus = Garis.getGradien() * g1.getGradien();

    if (tegaklurus == -1) {
      return true;
    } else {
      return false;
    }
  }


}