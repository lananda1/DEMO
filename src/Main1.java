public class Main1 {
    public static void main(String[] args) {
        Memory m = new Memory(100,"amd");
        Processor p = new Processor(10, 100);
        Disk d = new Disk(100,"abc");

        Laptop l1 = new Laptop("Alok", m, p, d);
        System.out.println(l1.toString());
    }
}
