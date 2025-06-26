public class Disk {
    int size;
    String company;

    Disk(int size, String company) {
        this.size=size;
        this.company =company;
    }
    public String getCompany() {
        return company;
    }

    public int getSize() {
        return size;
    }

   /* public void setSize(int size) {
        this.size = size;
    }

    public void setCompany(String company) {
        this.company = company;
    }*/
    @Override
    public String toString() {
        return "Disk{" +
                "size=" + size +
                ", company='" + company + '\'' +
                '}';
    }
}
