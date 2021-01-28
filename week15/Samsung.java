package a_review.week15;

public class Samsung extends Phone implements AndroidApp{

    /*
        6. create a class named Samsung that inherits Phone and AndroidApp
            - actions: texting(), calling(), SamsungPay() [ All have long phoneNumber argument ]
            - create a constructor to initialize the fields (brand, model, size, price)
                if the price is more than 1500 don't set the price and print: Invalid Price, Samsung's price cannot more than 1500
     */

    public Samsung(String model, double size, double price) {
        super("Samsung", model, price, size);

        if(price > 1500) {
            System.out.println("Samsung cannot be more than 1500");
            this.price = 0;
        }

    }

    public void samsungPay() {
        System.out.println("Using Samsung pay");
    }

    @Override
    public void download() {
        System.out.println("Downloading from " + AppName);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Texting " + phoneNumber);
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }
}
