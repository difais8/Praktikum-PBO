public class Truck extends Vehicle{
  public double maxLoad;

  public Truck(){
    System.out.println("Truck adalah angkutan darat yang sangat handal");
  }

  public Truck(double maxLoad) {
    this.maxLoad = maxLoad;
  }

  // public double calcFuelEfficiency() {}
  // public double calcTripDistance() {}
}
