public class Pryamoug extends GeomObj {
    double a, b;
    double getPloshad() {
        return (double) a*b;
    }
    public Pryamoug(double a, double b) {
        this.a = (double) a;
        this.b = (double) b;
        this.cuteness = getPloshad();
    }
}
