public class Main {
    public static void main(String[] args) {
        Person person1= new Person("Ivan", 345667);
        Company Comp1= new Company(466575,57677 );
        Person person2= new Person (65577, 789999);
        Company Comp2= new Company(466575,57677 );
        person1.PrintInfo();
        person2.PrintInfo();
        Comp1.PrintInfo();
        System.out.println(person1.getClass());
        System.out.println(person1.toString());

        System.out.println(person1.equals(person2));
        System.out.println(Comp1.equals(Comp2));

    }




}
