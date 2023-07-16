public class Dog implements HomePet {
  private String name;
  private double weight;
  private String color;

  public Dog() {
    this.name = "Olive";
    this.weight = 17.0;
    this.color = "Corgi";
  }

  public Dog(String name, double weight, String color) {
    this.name = name;
    this.weight = weight;
    this.color = color;
  }

  public int Sleep(int minutes) {
    int sleep = minutes;

    if (weight > 20) {
        sleep = sleep + 10;
    }
    else if (weight < 10) {
        if (sleep < 5) {
            sleep = 0;
        }
        else {
            sleep = sleep - 5;
        }
    }

    return sleep; 
  }

  public void Eat(double amount) {
    weight = weight + amount;    
  }

  public boolean Play(double minutes) {
    if (weight < 1) {
        return false;
    }

    if (weight < (minutes / 5) * 0.1) {
        minutes = (weight - 1) * 100;
        if (weight < 1) {
            return false;
        }
    }
    weight = weight - (minutes / 5) * 0.1;
    return true; 
  }

  public boolean Bark() {
    if (weight < 1) {
        return false;
    }

    if (weight > 100) {
        return false;
    }

    return true;

  }

  public void ShowStatus() {
    System.out.println("Name is " + name);
    System.out.println("Weight is " + weight);
    System.out.println("Color is " + color);
  }

  public double GetWeight() {
    return weight;
  }

}