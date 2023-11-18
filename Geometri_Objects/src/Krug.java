public class Krug extends GeomObj{

    float rad;
    double getPloshad() {
        return (double) Math.PI*rad*rad;
    }
    public Krug(double rad) {
        this.rad = (float) rad;
        this.cuteness = getPloshad();
    }
}
