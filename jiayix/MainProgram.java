public class MainProgram {
     public static void main(String[] args) {
        Triangle T1 = new Triangle(3, 4, 5);
        Triangle T2 = new Triangle(39, 3, 40);

        System.out.println(T2.color);

        T1.color = "blue";

        System.out.println(T1.color);

        int perimeter;

        perimeter = T1.CalculatePerimeter();

        System.out.println("Perimeter of T1 is: " + perimeter);
     }   
}