public class Treug extends  GeomObj{
    double a, b, c;
    double getPloshad() {
        double pp = (a+b+c)/2;
        return (double) Math.sqrt((pp - a)*(pp - b)*(pp - c)*pp);
    }
    public Treug(double a, double b, double c) {
        this.a = (double) a;
        this.b = (double) b;
        this.c = (double) c;
        this.cuteness = getPloshad();
    }
}
