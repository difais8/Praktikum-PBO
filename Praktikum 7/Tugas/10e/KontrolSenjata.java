public class KontrolSenjata  {
  protected Senjata senjata;

  public KontrolSenjata(Senjata senjata) {
    this.senjata = senjata;
  }

  public boolean isAdaPeluru() {
    if (senjata.getPeluru() == 0) {
      return false;
    } else {
      return true;
    }
  }

  public void isiPeluru(int jumPeluru) {
    int peluru = senjata.getPeluru() + jumPeluru;
    senjata.setPeluru(peluru);
    System.out.println(">> Peluru berhasil ditambah: " + senjata.getPeluru());
  }

  public void menembak(int jumlah) {
    System.out.println(">> Siap menembak " + jumlah + " peluru");
    if (!isAdaPeluru()) {
      System.out.println("Peluru Habis");
    }
    else {
      for (int i = 0; i < jumlah; i++) {
        if (isAdaPeluru()) {
          System.out.println(senjata.getBunyi());
          senjata.setPeluru(senjata.getPeluru() - 1);
        }
        else {
          System.out.println("Gagal tembak, Peluru Habis");
        }
      }
      System.out.println(">> Peluru sisa: " + senjata.getPeluru());
    }
  }

  public String menusuk() {
    if( senjata.isMenusuk() ) {
      return "Jleb!";
    }
    else {
      return "Gagal, belum pasang bayonet";
    }
  }

  public void pasangBayonet() {
    senjata.setMenusuk(true);
    System.out.println("Bayonet Terpasang");
  }

}
