/* In a super market each product is having minimum details like prodId, price, quantity
that is used during the billing process. Keeping this in mind prepare a class named as
Product having the member variables
i) prodId, price, quantity
ii) a static variable totalPrice
Initialize the value of product through parameterized constructor. It consists of a
display() method to display the value of instance variables. A person went to market
and purchase 5 different products. Using the above mentioned class, display the details
of products that the person has purchased. Also, determine how much total amount
the person will pay for the purchase of 5 products. */
import java.util.*;
class Product{
    int prodId;
    double price ;
    int quantity;
    static double totalPrice = 0.0;
    Product(int pr , double p , int q){
        prodId = pr;
        price = p;
        quantity = q ;
        totalPrice+=(price*quantity);
        // Here this is the total price to be paid . Summation of all total prices of each product.
    }
    void display(){
        System.out.println("The product ID is : "+ prodId);
        System.out.println("The price is :"+ price);
        System.out.println("The quantity is : "+ quantity);
        System.out.println("The total price for this product is : "+ (price*quantity));
        // Individual Product's total price is displayed here.
    }
}
public class A2Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] obj = new Product[5];
        for (int i = 0; i <5 ; i++) {
            System.out.println("Enter the Product ID :");
            int pr = sc.nextInt();
            System.out.println("Enter the price : ");
            double p = sc.nextDouble();
            System.out.println("Enter the quantity : ");
            int q = sc.nextInt();
            obj[i] = new Product(pr,p,q);
            obj[i].display();
        }
        System.out.println("The total price to be paid is : "+ Product.totalPrice);
        // The total price is getting displayed which is to be paid after summation of all
        // totalPrice = summation of  (price*quantity) of each product
    }
}