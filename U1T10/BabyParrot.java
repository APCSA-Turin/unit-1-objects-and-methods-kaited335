package U1T10;

public class BabyParrot {
    private String species;
    private int age;
    private String name;
    private double weight;

  public BabyParrot(String species, int age, double weight) {
    this.species = species;
    this.age = age;
    this.weight = weight;
    this.name = ""; // use a default value of the 'empty string'
  }

  public void setName(String newName) {
    name = newName;
  }
  
  // note this method RETURNS a String
  public String parrotInfo() {
    String str = "Species: " + species + "\n";
    str += "Name: " + name + "\n";
    str += "Age: " + age + "\n";
    str += "Weight: " + weight;
    return str;
  }

}
