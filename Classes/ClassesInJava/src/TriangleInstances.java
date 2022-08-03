public class TriangleInstances {
    public static void main(String[] args) {
        Triangle triangleA = new Triangle(15,8,15,8,17);
        Triangle triangleB = new Triangle(3,2.958,3,3,5);

        double triangleAArea = triangleA.findArea();
        System.out.println(triangleAArea);

        double triangleBArea = triangleB.findArea();
        System.out.println(triangleBArea);
    }
}
