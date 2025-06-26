public class Processor {
    int gen;
    int speed;

    Processor (int gen, int speed) {
        this.gen = gen;
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }

    public int getGen() {
        return gen;
    }

    /*public void setGen(int gen) {
        this.gen = gen;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }*/

    @Override
    public String toString() {
        return "Processor{" +
                "gen=" + gen +
                ", speed=" + speed +
                '}';
    }
}
