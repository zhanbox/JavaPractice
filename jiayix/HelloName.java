/*where the program 'starts'. */
public class HelloName {
     
    public static void main(String[] args) {
        Person N1 = new Person("Jiayi", 2010);
        Person N2 = new Person("Alice", 2013);
      
        int Age1;
        Age1 = N1.CalculateAge();

        int Age2;
        Age2 = N2.CalculateAge();

        String Name1;
        Name1 = N1.Name;

        String Name2;
        Name2 = N2.Name;
     
        System.out.println("Hello " + Name1);
        System.out.println("Age: " + Age1);
        System.out.println("Hello " + Name2);
        System.out.println("Age: " + Age2);
        System.out.println("You guys are both very very old hehehehehe");
    }
}