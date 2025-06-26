public class Parent extends  Gp{
    String parentName;
    int zipcode;

    Parent() {
        this("ravi",34);
        System.out.println("parent default constr");
        printParent();
    }

    public Parent(String parentName, int zipcode) {
        this.parentName = parentName;
        this.zipcode = zipcode;
        System.out.println("parent constr " + parentName +  " " + zipcode);
    }

    public void printParent() {
        System.out.println("Im the parent " + parentName);
        this.getParentZipcode();
    }

    public int getParentZipcode() {
        System.out.println("parent zipcode " + zipcode);
        return zipcode;
    }
}
