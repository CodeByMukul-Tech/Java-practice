class Person {
    String Name;
    int Age;
    String Planet;
    static int i = 1;

    Person() {
        System.out.println();
        System.out.println("New person : " + i++);

    }

    public void setAge(int age) {
        this.Age = age;
    }

    public void setPlanet(String planet) {
        this.Planet = planet;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void getAge() {
        System.out.println(this.Age);
    }

    public void getName() {
        System.out.println(this.Name);

    }

    public void getPlanet() {
        System.out.println(this.Planet);
    }
}
