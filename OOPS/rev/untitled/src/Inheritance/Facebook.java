package Inheritance;


import Encapsulated.USER_DETAILS;

public class Facebook extends USER_DETAILS {

    int post;

    public Facebook(String name, int brith_year, String ad){
        setName(name);
        setBrith_year(brith_year);
        setAger(ad);
    }

    public  void show_details(){
        System.out.println(this.name);
        System.out.println(Math.abs(this.Brith_year - 2025 ));
        System.out.println(this.address);
    }

}
