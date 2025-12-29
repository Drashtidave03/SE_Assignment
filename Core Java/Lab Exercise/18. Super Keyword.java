class Vehicle {
    String type;
  
    Vehicle(String type) {
        this.type = type;
        System.out.println("Vehicle Constructor: " + type);
    }

    void displayInfo() {
        System.out.println("This is a generic vehicle.");
    }
}

class Car extends Vehicle {
    String model;

    Car(String type, String model) {
     
        super(type); 
        this.model = model;
        System.out.println("Car Constructor: " + model);
    }

    @Override
    void displayInfo() {
       
        super.displayInfo(); 
        System.out.println("Specifically, this is a Car model: " + model);
    }

    public static void main(String[] args) {
        Car myCar = new Car("Sedan", "Toyota Camry");
        myCar.displayInfo();
    }
}
