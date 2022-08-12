package HW14;

public class Main {
    public static void main(String[] args) {

        Person person=new Person();

        Programmer pr = new Programmer("Samarbek", "coding", "Facebook");
        System.out.println(pr);
        pr.coding();
        pr.eat();
        pr.walk();
        pr.learn();

        Dancer dn = new Dancer("Mirgul", "dancing", "Pussycatdolls");
        System.out.println(dn);
        dn.dancing();
        dn.eat();
        dn.walk();
        dn.learn();

        Singer sn = new Singer("Nurayim", "singer", "Sunrise");
        System.out.println(sn);
        sn.singing();
        sn.eat();
        sn.walk();
        sn.learn();

    }
}