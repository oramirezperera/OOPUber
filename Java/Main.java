class Main{
    public static void main(String[] args) {
        System.out.println("Hello world");
        Car car = new Car();
        car.license = "AMQ123";
        car.driver = "Andres Herrera";
        car.passenger = 4;
        System.out.println("Car License: "+ car.license);

        Car car2 = new Car();
        car2.license = "QWE567";
        car2.driver = "Andrea Herrera";
        car2.passenger = 3;
        System.out.println("Car License: " + car2.license);
    }
}