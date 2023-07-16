public class PetStore {
    
    public static void main(String[] args) {
        Cat Lolly;
        Lolly = new Cat();

        Cat Alice;
        Alice = new Cat("Alice", 14.0, "Orange");

        Dog Olive;
        Olive = new Dog();

        Dog Olive2;
        Olive2 = new Dog("Olive", 16.0, "Corgi");

        int lollySleep;
        lollySleep = Lolly.Sleep(9);
        System.out.println("Lolly slept " + lollySleep);

        Lolly.Eat(5);
        System.out.println("Lolly weighs " + Lolly.weight);
        Lolly.ShowStatus();
        
        Lolly.Play(15);
        Lolly.Meow();
        Lolly.ShowStatus();


        int aliceSleep;
        aliceSleep = Alice.Sleep(111);
        System.out.println("Alice slept " + aliceSleep);

        Alice.Eat(87);
        System.out.println("Alice weighs " + Alice.weight);

        Alice.Play(3);
        System.out.println("Alice now weighs " + Alice.weight);

        boolean aliceMeow;
        aliceMeow = Alice.Meow();
        System.out.println("Alice meowed: " + aliceMeow);

        Alice.ShowStatus();

        int oliveSleep;
        oliveSleep = Olive.Sleep(12);
        System.out.println("Olive slept " + oliveSleep);

        Olive.Eat(10);
        System.out.println("Olive weighs " + Olive.GetWeight());

        Olive.Play(28);
        double oliveWeight;
        oliveWeight = Olive.GetWeight();
        System.out.println("Olive now weighs " + oliveWeight);

        boolean oliveBark;
        oliveBark = Olive.Bark();
        System.out.println("Olive barked: " + oliveBark);

        Olive.ShowStatus();

        int olive2Sleep;
        olive2Sleep = Olive2.Sleep(5);
        System.out.println("Olive 2 slept " + olive2Sleep);

        Olive2.Eat(5);
        System.out.println("Olive 2 weighs " + Olive2.GetWeight());

        Olive2.Play(10);
        double olive2Weight;
        olive2Weight = Olive2.GetWeight();
        System.out.println("Olive 2 now weighs " + olive2Weight);

        boolean olive2Bark;
        olive2Bark = Olive2.Bark();
        System.out.println("Olive 2 barked: " + olive2Bark);

        Olive2.ShowStatus();
        
    }
}
