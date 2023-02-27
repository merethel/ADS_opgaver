package Exercise1;

public class Main {
    public static void main(String[] args) {
        Camera camera1 = new Camera("1", "black");
        Camera camera2 = new Camera("1", "black");
        System.out.println(camera1.equals(camera2));
        System.out.println(camera1.hashCode()==camera2.hashCode());
    }
}
