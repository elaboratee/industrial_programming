package def;

interface Product {}
class ConcreteProductA implements Product {}
class ConcreteProductB implements Product {}

/**
 * <i>Фабричный метод</i> — порождающий шаблон проектирования,
 * предоставляющий подклассам интерфейс для создания экземпляров
 * некоторого класса. В момент создания наследники могут определить,
 * какой класс создавать.
 */
abstract class Creator {
    public abstract Product factoryMethod();
}

class ConcreteCreatorA extends Creator {
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}

class ConcreteCreatorB extends Creator {
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}
