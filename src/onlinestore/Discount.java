package onlinestore;

public abstract class  Discount {


    protected int valueDiscount;
    public Discount(){

        valueDiscount=0;
        }
    public Discount( int valueDiscount)
    {
        this.valueDiscount=valueDiscount;
    }

    public abstract int getFinalPriceByDiscount(int price);


}

  class PercentageDiscount extends Discount{
    String discountType="Percentage";
    public PercentageDiscount(int value){
        super(value);
    }
    public String toString(){
        return discountType;
    }



    public int getFinalPriceByDiscount(int price)
    {
       return  price-(price*valueDiscount/100);
    }
 }
    class FixedAmmountDiscount extends Discount {
        String discountType = "FixedAmmount";
        public FixedAmmountDiscount(int value){
    super(value);
}
        public int getFinalPriceByDiscount(int price) {
            return price - valueDiscount;
        }

        public String toString(){
            return discountType;
        }
    }