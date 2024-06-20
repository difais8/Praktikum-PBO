public class Main {
  public static void main(String[] args) {
    Ulat K = new Ulat();
    Data<Kupu> anu = new Data<>();

    anu.setIsi(K);
    String gerak = anu.getIsi().gerak();

    System.out.println(gerak);
  }
}
