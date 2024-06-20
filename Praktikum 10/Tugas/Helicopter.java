public class Helicopter extends Vehicle {
  public double maxLoad;

  public Helicopter() {
    System.out.println("Helicopter hanya memerlukan landasan kecil");
  }
    
  public Helicopter(double maxLoad) {
    this.maxLoad = maxLoad;
  }
  
  // public double calcFuelEfficiency() {}
  // public double calcTripDistance() {}
    
}
