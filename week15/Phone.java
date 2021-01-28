package a_review.week15;

public abstract class Phone {


    /*
        1. create an abstract class named Phone
            - instance variables: brand, model, price, size
            - abstract methods: texting(), calling() [ All have long phoneNumber argument ]
            - create a constructor to initialize the fields
            	if the price is negative or 0 don't set the price and print: Invalid Price, cannot be negative or 0
     */

    String brand;
    String model;
    double price;
    double size;

    public Phone(String brand, String model, double price, double size) {
        this.brand = brand;
        this.model = model;
        this.size = size;

        if(price > 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be 0 or negative");
        }
    }

    public abstract void texting(long phoneNumber);
    public abstract void calling(long phoneNumber);

}
