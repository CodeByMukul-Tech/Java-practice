package Encapsulated;

import Interfacess.Cake;

public class Restuartent implements Cake {

  public Restuartent(String name){
        System.out.println("Welcome the"+name);
    }

    private String order_name;
    private String order_review;
    @Override
    public void cream() {
        System.out.println("Cream white cake");
    }

    @Override
    public void butter() {
        System.out.println("Cream butter cake");

    }

    @Override
    public void base() {
        System.out.println("only base cake");
    }

    @Override
    public void design() {
        System.out.println("Cake cream well designs");

    }

    public void setOrder_name(String order_name) {
        this.order_name = order_name;
    }

    public void setOrder_review(String order_review) {
        this.order_review = order_review;
    }

    public String getOrder_review() {
        return order_review;
    }

    public String getOrder_name() {
        return order_name;
    }
}
