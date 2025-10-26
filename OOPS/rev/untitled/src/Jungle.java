class Jungle {
    private String name;
    private String type;
    private int age;

    public boolean setter_name(String name){
        if(name.length() >4){
            this.name = name;
            return true;
        }
        return false;

        

    }

    public void getter_name (){
        System.out.println("name is "+ name) ;
    }

    public boolean setage(int age){
        if(age>=18){
            this.age = age;
             return true;
        }
        return false;

    }
    public void getter_age(){
        System.out.println(age);
    }

    public boolean settype(String types){
        if(types.length() >=3){
            this.type = types;
            return true;

        }
        return false;

    }

    public void getter_type (){
        System.out.println(type);
    }

}
