package onlinestore;

import java.util.ArrayList;

public class Cart {


    public static void main(String[] args){
        double total=0;
        Address adresaIasi = new Address("Piscului", "Iasi", 1);
        Customer customer1=new Customer("Corolea", "Danut",189,adresaIasi);
        PercentageDiscount discount1 = new PercentageDiscount(10);
        FixedAmmountDiscount discount2 = new FixedAmmountDiscount(5);


        ArrayList<Product> productList =new ArrayList<Product>();

        productList.add(new Product(1,"televizor","electrocasnic",100,"red",discount1));

        productList.add(new Product(2,"televizor2","electrocasnic",200,"blue",discount2));

        productList.add(new Product(3,"televizor3","electrocasnic",300,"black",discount1));

        for (Product product:productList) {
            total+=product.getFinalPrice();

        }



        System.out.println("ceva este" +total);



    }
}
