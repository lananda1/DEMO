public class Laptop {
    public final String LaptopName = "MAC";
    private String userName;
    private Memory memory;
    private Processor processor;
    private Disk disk;

    Laptop(String userName, Memory m, Processor p,Disk d) {
        this.userName = userName;
        this.memory = m;
        this.processor = p;
        this.disk = d;
    }

    @Override
    public String toString() {
        System.out.println("Laptop details of user: " + userName);
        return "Laptop{" +
                "LaptopName='" + LaptopName + '\'' +
                ", memory=" + memory +
                ", processor=" + processor +
                ", disk=" + disk +
                '}';
    }
}
