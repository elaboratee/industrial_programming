package def;

/**
 * <i>Singleton</i> — порождающий шаблон проектирования, гарантирующий,
 * что в однопоточном приложении будет единственный экземпляр
 * некоторого класса, и предоставляющий глобальную точку доступа к этому экземпляру.
 */
class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
