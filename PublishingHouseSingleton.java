class PublishingHouseSingleton {
    private static PublishingHouseSingleton instance;

    private PublishingHouseSingleton() {}

    public static PublishingHouseSingleton getInstance() {
        if (instance == null)
            instance = new PublishingHouseSingleton();
        return instance;
    }

    public IBookFactory getFactory(String bookType) {
        if (bookType.equalsIgnoreCase("LiteraryWork")) {
            return new LiteraryWorkFactory();
        } else if (bookType.equalsIgnoreCase("Textbook")) {
            return new TextbookFactory();
        }
        return null;
    }
}