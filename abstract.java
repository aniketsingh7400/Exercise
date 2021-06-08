abstract class Human {
    abstract void move();

    abstract void eat();
}

class Human1 extends Human {
    void move() {
        System.out.println("Human1 moving");
    }

    void eat() {
        System.out.println("Human1 eating");
    }
}

class Human2 extends Human {
    void move() {
        System.out.println("Human2 moving");
    }

    void eat() {
        System.out.println("Human2 eating");
    }
}

class Main {
    public static void main(String[] args) {
        Human h1 = new Human1();
        Human h2 = new Human2();
        h1.move();
        h1.eat();
        h2.move();
        h2.eat();
    }
}