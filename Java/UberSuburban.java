class UberSuburban extends Car {
    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    private Integer passenger;

    public UberSuburban(String license, Account driver, Map<String, Map<String, Integer>> typeCarAccepted, ArrayList<String> seatsMaterial){
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial =seatsMaterial;
    }

    @Override
    public void setPassenger(Integer passenger){
        if(passenger == 6){
            this.passenger = passenger;
        }else{
            System.out.println("The minimum amount of passengers is 6");
        }
    }
}