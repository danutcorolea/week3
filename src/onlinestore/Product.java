package onlinestore;

public class Product {
    int idProduct;
    String name;
    String type;
    int price;
    String color;
    Discount discount;

    public Product(int idProduct, String name, String type, int price, String color, Discount discount)
    {
        this.idProduct =idProduct;
        this.name=name;
        this.type=type;
        this.price =price;
        this.color=color;
        this.discount=discount;
    }

    public int getFinalPrice()
    {
        return discount.getFinalPriceByDiscount(this.price);

    }

    public String toString(){
        return name;
    }

}
