import java.util.Scanner;

public class Registrasi {
  RegistrasiMethodImpl Registrasi = new RegistrasiMethodImpl();

  public Registrasi(String jenisregistrasi) {
    if (jenisregistrasi == "registrasi akun baru") {

      System.out.println("Masukkan username:");
      Scanner scan1 = new Scanner(System.in);
      String username = scan1.nextLine();
      Registrasi.setUsername(username);

      System.out.println("Masukkan nama:");
      Scanner scan2 = new Scanner(System.in);
      String name = scan2.nextLine();
      Registrasi.setName(name);

      System.out.println("Masukkan no telpon:");
      Scanner scan3 = new Scanner(System.in);
      String phonenumber = scan3.nextLine();
      Registrasi.setPhoneNumber(phonenumber);
      
      System.out.println("Masukkan email:");
      Scanner scan4 = new Scanner(System.in);
      String email = scan4.nextLine();
      Registrasi.setEmail(email);
      
      System.out.println("Masukkan password:");
      Scanner scan5 = new Scanner(System.in);
      String password = scan5.nextLine();
      Registrasi.setPassword(password);
      
      System.out.println("Registrasi berhasil!");
    } else if (jenisregistrasi == "facebook" || jenisregistrasi == "apple" || jenisregistrasi == "google") {
      System.out.println("Masukkan email:");
      Scanner scan = new Scanner(System.in);
      String akun = scan.nextLine();

      if (akun == "pbo01@gmail.com") {
        System.out.println("Registrasi berhasil!");
      } else {
        System.out.println("email tidak sesuai!");
      }
    } else {
      System.out.println("Masukan tidak sesuai!");
    }
  }


}
