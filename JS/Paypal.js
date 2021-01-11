class Paypal extends Payment{
    constructor(id, amount, email){
        super(id, amount);
        this.email = email;
    }
}