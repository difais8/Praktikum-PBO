public class Main {
  public static void main(String[] args) {
    Ulat K = new Ulat();
    Data<Kupu> anu = new Data<>();

    anu.setIsi(K);
    System.out.println(anu.getIsi().gerak());
    // ulat merayap

    anu.setIsi(new Kepompong());
    System.out.println(anu.getIsi().gerak());
    // kepomong diam

    anu.setIsi(new KupuDewasa());
    System.out.println(anu.getIsi().gerak());
    // kupu terbang

  }
}
