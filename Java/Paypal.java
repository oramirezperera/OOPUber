public class Paypal extends Payment{
    String email;

    public Paypal(Integer id, Float amount, String email){
        super(id, amount);
        this.email = email;
    }
}