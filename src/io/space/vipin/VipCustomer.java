package io.space.vipin;

public class VipCustomer {
    private String name;
    private int credit_Limit;
    private String email;


    public VipCustomer() {
        this("Vipin",10001,"vk@gmail.com");
    }

    public VipCustomer(String name, int credit_Limit) {
        this(name,credit_Limit, "vipin@gmail.com");

    }

    public VipCustomer(String name, int credit_Limit, String email) {
        this.name = name;
        this.credit_Limit = credit_Limit;
        this.email = email;
    }


    //Getters
    public String getName() {
        return name;
    }
    public int getCredit_Limit() {
        return credit_Limit;
    }
    public String getEmail() {
        return email;
    }
}
