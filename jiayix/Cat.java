public class Cat implements HomePet {
  private String name;
  public double weight;
  private String color;

  public Cat() {
    this.name = "Lolly";
    this.weight = 12.0;
    this.color = "Gray";
  }

  public Cat(String name, double weight, String color) {
    this.name = name;
    this.weight = weight;
    this.color = color;
  }

  public int Sleep(int minutes) {
    int sleep = minutes;

    if (weight > 10) {
        sleep = sleep + 10;
    }
    else if (weight < 5) {
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
    weight = weight + amount * 0.5;    
  }

  public boolean Play(double minutes) {
    if (weight < 1) {
        return false;
    }

    if (weight < (minutes / 10) * 0.1) {
        minutes = (weight - 1) * 100;
    }

    if (weight > 30) {
        // FIXME
        minutes = minutes - 10;
    }

    weight = weight - (minutes / 10) * 0.1;
    return true; 
  }

  public boolean Meow() {
    if (weight < 1) {
        return false;
    }

    if (weight > 30) {
        return false;
    }

    return true;
  }

  public void ShowStatus() {
    System.out.println("Name is " + name);
    System.out.println("Weight is " + weight);
    System.out.println("Color is " + color);
  }

}
