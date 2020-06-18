package io.space.vipin;

public class Main {

    public static void main(String[] args) {
        VipCustomer vcust1 = new VipCustomer();
        VipCustomer vcust2 = new VipCustomer("Vipin", 444);
        VipCustomer vcust3 = new VipCustomer("sonnu", 555, "Name@gmail.com");

        System.out.println(vcust1.getName());
        System.out.println(vcust2.getName());
        System.out.println(vcust3.getName());






    }
}
