public class lec17{
    public static void main(String[] args){
  Car c = new Car();
  c.start();
  c.brake();
    }
}
  class Car{
    void start(){
        System.err.println("car is started");

    }
    void brake(){
        System.err.println("Car  is braking ");
    }
}