public class Card extends Payment{
    Integer cardNumber;
    String cardDate;
    Integer cardCvv;

    public Card(Integer id, Float amount, Integer cardNumber, String cardDate, Integer cardCvv){
        super(id, amount);
        this.cardNumber = cardNumber;
        this.cardDate = cardDate;
        this.cardCvv = cardCvv;
    }
}