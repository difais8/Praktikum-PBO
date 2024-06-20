public class SeaPlane extends Vehicle {
  public double maxLoad;
  
  public SeaPlane() {
    System.out.println("Seaplane dapat take-off dan mendarat di perairan laut");
  }
  
  public SeaPlane(double maxLoad) {
    this.maxLoad = maxLoad;
  }

  // public double calcFuelEfficiency() {}
  // public double calcTripDistance() {}
}
