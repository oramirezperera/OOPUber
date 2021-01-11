class Card extends Payment{
    constructor(id, amount, cardNumber, cardDate, cardCvv){
        super(id, amount);
        this.cardNumber = cardNumber;
        this.cardDate = cardDate;
        this.cardCvv = cardCvv;
    }
}