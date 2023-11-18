import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        GeomObj[] capibaras = new GeomObj[]{new Krug(10.0), new Pryamoug(2.0, 15.0), new Treug(4.0, 3.0, 6.3)};
        System.out.println(Arrays.toString(capibaras));
        Arrays.sort(capibaras);
        capibaras[0].setSkale(6);//увеличить сторону
        Arrays.sort(capibaras);
        System.out.println(Arrays.toString(capibaras));
    }
}