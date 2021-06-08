class Animal {
    private String name;
    private double averageWeight;
    private int numberOfLegs;

    public String getName() {
        return name;
    }

    public double getAverageWeight() {
        return averageWeight;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAverageWeight(double averageWeight) {
        this.averageWeight = averageWeight;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Animal a1 = new Animal();

        a1.setName("Eagle");
        a1.setAverageWeight(1.5);
        a1.setNumberOfLegs(2);

        System.out.println("Name: " + a1.getName());
        System.out.println("Average Weight: " + a1.getAverageWeight());
        System.out.println("Number of Legs: " + a1.getNumberOfLegs());
    }
}
