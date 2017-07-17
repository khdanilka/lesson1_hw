package p3;

public class Fruit {

    protected static final double APPLE = 1.5d;
    protected static final double ORANGE = 2.5d;

    private double fruitWeight;

    protected Fruit(double fruitWeight){
        this.fruitWeight = fruitWeight;
    }

    public double getFruitWeight(){
        return fruitWeight;
    }

    public static void main(String[] args) {

    }
}

class Apple extends Fruit{

    public Apple() {
        super(Fruit.APPLE);
    }
}

class Orange extends Fruit{

    public Orange() {
        super(Fruit.ORANGE);
    }
}
