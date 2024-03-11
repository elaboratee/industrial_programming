package def;

class Pizza {
    private String dough = "";
    private String sauce = "";

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }
}

/**
 * <i>Builder</i> — порождающий шаблон проектирования,
 * который предоставляет способ создания составного объекта.
 * Отделяет конструирование сложного объекта от его представления так,
 * что в результате одного и того же процесса конструирования
 * могут получаться разные представления.
 */
abstract class PizzaBuilder {
    protected Pizza pizza;

    public void createNewPizzaProduct() {
        pizza = new Pizza();
    }

    public abstract void buildDough();
    public abstract void buildSauce();
}

class SpicyPizzaBuilder extends PizzaBuilder {
    public void buildDough() {
        pizza.setDough("pan baked");
    }

    public void buildSauce() {
        pizza.setSauce("hot");
    }
}

class Waiter {
    private final PizzaBuilder pizzaBuilder;

    public Waiter(PizzaBuilder pb) {
        pizzaBuilder = pb;
    }

    public void constructPizza() {
        pizzaBuilder.createNewPizzaProduct();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSauce();
    }
}
