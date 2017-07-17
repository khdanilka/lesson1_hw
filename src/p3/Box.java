package p3;


import java.util.ArrayList;

public class Box <T extends Fruit> {

    private boolean EMPTY = true;
    private ArrayList<T> fruitList = new ArrayList<>();

    private void add(T fruit) {
        if (EMPTY) {
            fruitList.add(fruit);
            EMPTY = false;
        } else if (fruit.getClass() == fruitList.get(0).getClass()){
            fruitList.add(fruit);
        } else System.out.println("Объект не может быть добавлен в данныую коробоку");
    }

    public double getWeight(){
        if (EMPTY) return 0.0;
        return fruitList.size() * fruitList.get(0).getFruitWeight();
    }

    public boolean compare2Box(Box<?> box){
        if (this.getWeight() == box.getWeight()) return true;
        return false;
    }

    public ArrayList<T> retArr(){
        return fruitList;
    }

    public void transferFruit2(Box<T> box){
        if (EMPTY) {
            System.out.println("Нечего передавть");
            return;
        }
        for(int i = 0; i < fruitList.size(); i++){
            box.add(fruitList.get(i));
        }
        fruitList.clear();
        this.EMPTY = true;
    }

    public static void main(String[] args) {

        Box<Orange> b = new Box<>();
        b.add(new Orange());
        b.add(new Orange());
        b.add(new Orange());
        b.add(new Orange());
        b.add(new Orange());
        b.add(new Orange());
        System.out.println("Orange box " + b.getWeight());

        Box<Apple> a = new Box<>();
        a.add(new Apple());
        a.add(new Apple());
        a.add(new Apple());
        a.add(new Apple());
        System.out.println("Apple box 1: " + a.getWeight());

        Box<Apple> a2 = new Box<>();
        a2.add(new Apple());
        System.out.println("Apple box 2: " + a2.getWeight());

        System.out.println("Коробки равны по весу a1 и a2: " +  a.compare2Box(a2));

        a.transferFruit2(a2);
        System.out.println("Apple box 1: " + a.getWeight());
        System.out.println("Apple box 2: " + a2.getWeight());

        a.transferFruit2(a2);


    }

}
