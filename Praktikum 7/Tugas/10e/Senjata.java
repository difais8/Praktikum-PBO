public class Senjata {
  protected String bunyi;
  protected boolean menusuk;
  protected int peluru;

  public Senjata(String bunyi) {
    this.bunyi = bunyi;
    menusuk = false;
    peluru = 0;
  }

  public String getBunyi() {
    return bunyi;
  }

  public int getPeluru() {
    return peluru;
  }
  public boolean isMenusuk() {
    return menusuk;
  }

  public void setBunyi(String bunyi) {
    this.bunyi = bunyi;
  }

  public void setMenusuk(boolean menusuk) {
    this.menusuk = menusuk;
  }

  public void setPeluru(int peluru) {
    this.peluru = peluru;
  }
}