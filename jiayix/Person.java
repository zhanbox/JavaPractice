public class Person {
    public String Name;
    public int YOB;

    public Person(String Name, int YOB) {
        this.Name = Name;
        this.YOB = YOB;
    }

    public int CalculateAge() {
        int Age = 2023 - this.YOB;
        
        return Age;
    }
}