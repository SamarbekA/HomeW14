package HW14;

public class Dancer extends Person{
    private String groupName;

    public Dancer (String name, String designation, String groupName) {
        super(name, designation);
        this.groupName=groupName;
    }

    public void dancing() {
        System.out.println("The dancer is dancing.");
    }
    @Override
    public String toString() {
        return "Dancer's "+super.toString()+" / groupName - " + groupName+".";
    }
}
