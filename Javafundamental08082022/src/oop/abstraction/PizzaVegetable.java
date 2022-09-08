package oop.abstraction;

public class PizzaVegetable extends Pizza{
    public PizzaVegetable(String name) {
        super(name);
    }

    @Override
    void prepare() {
        System.out.println("Pizza Vegetable prepare");
    }

    @Override
    void sauce() {
        System.out.println("Pizza Vegetable sauce");
    }

    @Override
    void bake() {
        System.out.println("Pizza Vegetable bake");
    }

    @Override
    void cut() {
        System.out.println("Pizza Vegetable Cut");
    }
}
