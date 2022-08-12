package HW14;

public class Programmer extends Person{
    private String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName=companyName;
    }
    public void coding() {
        System.out.println("The programmer is coding.");
    }

    @Override
    public String toString() {
        return "Programmer's " + super.toString() +
                "/ companyName - " + companyName+".";
    }
}