public class Triangle {
    
    public int sideLength1;
    public int sideLength2;
    public int sideLength3;
    public String color;

    public Triangle(int sideLength1, int sideLength2, int sideLength3) {
        this.sideLength1 = sideLength1;
        this.sideLength2 = sideLength2;
        this.sideLength3 = sideLength3;

        this.color = "yellow";

    }

    public int CalculatePerimeter() {
        int Perimeter = this.sideLength1 + this.sideLength2 + this.sideLength3;

        return Perimeter;
    }
}

