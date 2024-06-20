import java.util.Scanner;
import java.util.regex.*;

public class RegistrasiMethodImpl extends RegistrasiMethod {
  public String username;
  public String name;
  public String phonenumber;
  public String email;
  public String password;

  public String getUsername() {
    return username;
  }

  public String getName() {
    return name;
  }

  public String getPhoneNumber() {
    return phonenumber;
  }

  public String getEmail() {
    return email;
  }

  public String getPassword() {
    return password;
  }

  public void setUsername(String username) {
    // Scanner scan = new Scanner(System.in);
    // String username = scan.nextLine();

    if (username.isEmpty()) {
      System.out.println("Username tidak boleh kosong!");
      Scanner scanner = new Scanner(System.in);
      System.out.println("Masukkan username:");
      username = scanner.nextLine();
      setUsername(username);
      // scanner.close();
    } else {
      this.username = username;
    }
  }

  public void setName(String name) {
    // Scanner scan = new Scanner(System.in);
    // String name = scan.nextLine();

    String regex = "^[a-zA-Z ]*$";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(name);

    if (name.isEmpty() || !matcher.matches()) {
      System.out.println("Nama tidak boleh kosong atau hanya berisi huruf!");
      Scanner scanner = new Scanner(System.in);
      System.out.println("Masukkan nama:");
      name = scanner.nextLine();
      setName(name);
      // scanner.close();
    } else {
      this.name = name;
    }
  }

  public void setPhoneNumber(String phonenumber) {
    // Scanner scan = new Scanner(System.in);
    // int phonenumber = scan.nextInt();

    String input = String.valueOf(phonenumber);

    String regex = "[0-9]*$";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(input);

    if (input.isEmpty() || !matcher.matches()) {
      System.out.println("No telpon tidak boleh kosong atau hanya harus berisi angka!");
      Scanner scanner = new Scanner(System.in);
      System.out.println("Masukkan no telpon:");
      phonenumber = scanner.nextLine();
      setPhoneNumber(phonenumber);
      // scanner.close();
    } else {
      this.phonenumber = phonenumber;
    }
  }

  public void setEmail(String email) {
    // Scanner scan = new Scanner(System.in);
    // String email = scan.nextLine();

    String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(email);

    if (email.isEmpty() || !matcher.matches()) {
      System.out.println("Masukkan email dengan benar!");
      Scanner scanner = new Scanner(System.in);
      System.out.println("Masukkan email:");
      email = scanner.nextLine();
      setEmail(email);
      scanner.close();
    } else {
      this.email = email;
    }     
  }

  public void setPassword(String password) {
    // Scanner scan = new Scanner(System.in);
    // String password = scan.nextLine();

    String regex = ".{8,}";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(password);

    if (password.isEmpty() || !matcher.matches()) {
      System.out.println("Password minimal 8 karakter!");
      Scanner scanner = new Scanner(System.in);
      System.out.println("Masukkan password:");
      password = scanner.nextLine();
      setEmail(email);
      scanner.close();
    } else {
      this.password = password;
    }     
  }

}
