public class Child extends Parent {
    String name;
    int countryCode;

    public Child(String name, int countryCode) {
        this();
        System.out.println("child constr name = " + name + ", countryCode = " + countryCode);
        this.name = name;
        this.countryCode = countryCode;
        printGpSurname();
        getGpAge();
    }

    Child() {
        super();
        System.out.println("child default constr");

    }

    void printChild() {
        System.out.println("Im the child " + name);
        super.printParent();
    }

    int getChildCountry() {
        System.out.println("child country code " +countryCode);
        return countryCode;
    }
}
