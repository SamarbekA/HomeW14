package HW14;

public class Person {
    private String name;
    private String designation;

    public Person (String name, String designation) {
        this.name=name;
        this.designation=designation;
    }
    public Person() {

    }
    public void eat(){
        System.out.println("He/she eats.");
    }
    public void walk(){
        System.out.println("He/she walks.");
    }
    public void learn(){
        System.out.println("He/she learns.");
    }

    @Override
    public String toString() {
        return
                "name - " + name +
                " / designation - " + designation;
    }
}
