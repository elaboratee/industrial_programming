package def;

import java.util.List;

class DefenceMain {
    public static void main(String[] args) {
        System.out.println("== SINGLETON TEST ==");
        Singleton test1 = Singleton.getInstance();
        System.out.println("The first instance hash code: " + test1);
        Singleton test2 = Singleton.getInstance();
        System.out.println("The second instance hash code: " + test2);

        System.out.println("\n== BUILDER TEST ==");
        Waiter waiter = new Waiter(new SpicyPizzaBuilder());

        System.out.println("\n== FACTORY TEST ==");
        List<Creator> creators = List.of(new ConcreteCreatorA(), new ConcreteCreatorB());
        creators.stream().map(Creator::factoryMethod).map(Object::getClass).forEach(System.out::println);
    }
}
