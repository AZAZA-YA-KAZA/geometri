public abstract class GeomObj implements Comparable<GeomObj>{
    double cuteness;
    abstract double getPloshad();
    @Override
    public int compareTo(GeomObj o) {
        if (this.cuteness > o.cuteness){
            return 1;
        }
        else if (this.cuteness < o.cuteness){
            return -1;
        }
        return 0;
    }
    public void setSkale(double a){
        this.cuteness = cuteness * a;
    }

    @Override
    public String toString() {
        return "Capibara{" +
                "cuteness=" + cuteness +
                '}';
    }
}
