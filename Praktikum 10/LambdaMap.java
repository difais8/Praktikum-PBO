import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        Map<Integer, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put(1, "Rizky");
        mahasiswaMap.put(2, "Ojan");
        mahasiswaMap.put(3, "Ucup");
        mahasiswaMap.put(4, "John Doe");

        mahasiswaMap.forEach((nim, nama) -> {
            System.out.println("NIM: " + nim + ", Nama: " + nama);
        });
    }
}
