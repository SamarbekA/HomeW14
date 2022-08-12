package HW14;

public class Singer extends Person {
    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName=bandName;
    }
    public void singing() {
        System.out.println("The singer is singing");
    }
    @Override
    public String toString() {
        return "Singer's " + super.toString() +"/ bandName - " + bandName+".";
    }
}
