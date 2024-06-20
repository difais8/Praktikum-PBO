import java.util.*;

public class ArmadaKendaraan <T extends Vehicle> {
  List<T> vehicleList = new ArrayList<>();
  
  public void tambahArmada(Collection<? extends T> tipeArmada) {
    List<T> armada = new ArrayList<>(tipeArmada);
    vehicleList.addAll(armada);
  }

  public List<T> getAllArmada() {
    return vehicleList;
  }

}
