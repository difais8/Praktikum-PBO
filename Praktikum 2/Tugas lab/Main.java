public class Main {
  // static double counter;

  public static void main(String[] args) {
    Titik t1 = new Titik(0,0);
    Titik t2 = new Titik(3,4);

    System.out.println("Absis dengan enkapsulapsi " + t1.getAbsis());
    System.out.println("ordinat dengan enkapsulapsi " + t1.getOrdinat());
    System.out.println("Jarak ke titik usat " + t1.getJarakPusat());

    System.out.println(t1.getRefleksiX().getAbsis());

    System.out.println("---");
  
    Garis g1 = new Garis(t1, t2);

    g1.setTitikAwal(t1);
    g1.setTitikAkhir(t2);

    System.out.println("Absis Titik awal = " + g1.getTitikAwal().getAbsis());
    System.out.println("Ordinat Titik awal = " + g1.getTitikAwal().getOrdinat());
    System.out.println("Absis Titik Akhir = " + g1.getTitikAkhir().getAbsis());
    System.out.println("Ordinat Titik Akhir = " + g1.getTitikAkhir().getOrdinat());

    System.out.println("---");
  
    System.out.println("Absis Titik awal setelah refleksi = " + g1.getRefleksi().getTitikAwal().getAbsis());
    System.out.println("Absis Titik Akhir setelah refleksi = " + g1.getTitikAkhir().getAbsis());

    g1.getRefleksi();
    System.out.println("panjangnya adalah = " + g1.getPanjang());

    System.out.println("---");

    Titik t3 = new Titik(2,4);
    Titik t4 = new Titik(4,2);

    Garis g2 = new Garis(t3, t4);

    g2.setTitikAwal(t3);
    g2.setTitikAkhir(t4);
    
    System.out.println("apakah gradien = " + g1.isTegakLurus(g1));
    
  }
  
}