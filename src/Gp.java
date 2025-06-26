public class Gp {
    int age;
    String surname;

    Gp(int age, String name) {
        this.age = age;
        this.surname = name;
        System.out.println("Grandparent constr" + age + " " +name);

    }

    public Gp() {
        this(90,"pramit");
        System.out.println("default Grandparent constr");
        printGpSurname();
        getGpAge();
    }

    public void printGpSurname() {
        System.out.println("Gp Surname " + surname);
    }

    public int getGpAge() {
        System.out.println("grand parent age " + age);
        return age;
    }
}
