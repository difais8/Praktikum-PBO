public class Main {
  // static double counter;

    public static void main(String[] args) {
        titik t1 = new titik();
        titik t2 = new titik();
        // new
        titik t3 = new titik(5, 6);

        t1.setAbsis(1);
        t1.setOrdinat(3);
        t2.setAbsis(4);
        t2.setOrdinat(5);


        System.out.println("t1:" + t1.getAbsis() + ", " + t1.getOrdinat());
        System.out.println("t2:" + t2.getAbsis() + ", " + t2.getOrdinat());
        System.out.println("t3:" + t3.getAbsis() + ", " + t3.getOrdinat());
        System.out.println("Jumlah objek titik : " + t2.getCounter());
        
    }

}
