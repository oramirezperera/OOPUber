class Car {
    private Integer id;
    private String license;
    private String driver;
    protected Integer passenger;
    
    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }

    void printDataCar() {
        if(passenger != null){
            System.out.println("License :" + license + " Driver name: " + driver.name + " Passengers: " + passenger);
        }
    }

    public Integer getPassenger(){
        return passenger;
    }

    public void setPassenger(Integer passenger){
        if(passenger == 4){
            this.passenger = passenger;
        }else{
            System.out.println("The minimum amount of passengers is 4");
        }
    }


}