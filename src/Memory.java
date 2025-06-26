public class Memory {
    int size;
    String type;

    public int getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    /*public void setType(String type) {
        this.type = type;
    }

    public void setSize(int size) {
        this.size = size;
    }*/

    Memory(int size , String type) {
        this.size = size;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "size=" + size +
                ", type='" + type + '\'' +
                '}';
    }
}
