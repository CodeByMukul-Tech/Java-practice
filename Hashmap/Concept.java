import java.nio.channels.Pipe.SourceChannel;
import java.util.*;

public class Concept {
    public static void main(String[] args) {
        Map<String, String> writters = new HashMap<>();
        // add item using a .put method ;
        writters.put("molchand ji", "Dog");
        writters.put("mayank", "Daala");
        writters.put("Bmw", "M8 competeion");
        writters.put("Audi", "R8 sports");
        writters.put("swift", "otp");
        writters.put("mercedes", "GLs");
        //  can't use arranage 
        
        System.out.println(writters);


        // access item 
        System.out.println(writters.get("Audi"));
        System.out.println(writters.get("swift"));

        // remove
        writters.remove("Bmw");
        System.out.println(writters);


        // size 
        System.out.println(writters.size());

        // for keys using for each or 
        System.out.println("key set");

        for (String string : writters.keySet()) {
            System.out.println(string);

            
        }

        System.out.println();
        System.out.println("values");
        //  for values using 
        for(String i : writters.values()){
            System.out.println(i);
        }
        System.out.println();
        System.out.println("both");

        for(String i : writters.keySet()){
            System.out.println(i +" - > " + writters.get(i));
        }
    }

}
