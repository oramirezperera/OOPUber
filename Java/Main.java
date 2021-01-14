class Main{
    public static void main(String[] args) {
        System.out.println("Hello world");
        UberX uberX = new UberX("AMQ123", new Account("Andres Herrera", "AND123"), "Chevrolet", "Sonic");
        UberX.setPassenger(4);
        UberX.printDataCar();

        UberSuburban uberSuburban = new UberSuburban("FGH456", new Account("Andres Herrera", "AND123"));
        uberSuburban.setPassenger(6);
        uberSuburban.printDataCar();
        /*Car car2 = new Car("QWE567", new Account("Andrea Herrera", "ANDA123"));
        car2.passenger = 3;
        car2.printDataCar();*/
    }
}