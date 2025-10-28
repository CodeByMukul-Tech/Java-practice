import Encapsulated.Restuartent;
import Inheritance.Facebook;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        // Jungle dog = new Jungle();
        // System.out.println(dog.setter_name("kensss"));
        // // System.out.println(dog.getter_name());
        // System.out.println(dog.setage(78));
        // System.out.println(dog.settype("street"));
        // dog.getter_name();
        // dog.getter_age();
        // dog.getter_type();

        // BMW m8 = new BMW();
        // m8.seePrice();
        // m8.see_details();
        // jaguar fytpe = new jaguar();
        // fytpe.seePrice();
        // fytpe.see_details();

        // Person p1 = new Person();
        // p1.setName("thor");
        // p1.setAge(1800);
        // p1.setPlanet("Assguard");

        // p1.getAge();
        // p1.getName();
        // p1.getPlanet();

        // Person p2 = new Person();
        // p2.setName("Iron Man");
        // p2.setAge(45);
        // p2.setPlanet("Earth");

        // p2.getAge();
        // p2.getName();
        // p2.getPlanet();



//        Raju s = new Raju();
//        s.hello();


//        Facebook suraj = new Facebook("RAju ",2004 , "Delhi");
//
//        suraj.show_details();

        Restuartent BCA_chaiwala = new Restuartent("BCA");
        BCA_chaiwala.setOrder_name("kutta");
        BCA_chaiwala.setOrder_review("Cake is so good by dogesh badmash");
        BCA_chaiwala.base();
        BCA_chaiwala.butter();
        BCA_chaiwala.cream();
        BCA_chaiwala.design();
        System.out.println(BCA_chaiwala.getOrder_name());
        System.out.println(BCA_chaiwala.getOrder_review());

    }
}