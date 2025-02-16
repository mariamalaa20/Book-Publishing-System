public class Main {
    public static void main(String[] args) {
        PublishingHouseSingleton phs = PublishingHouseSingleton.getInstance();
        
        IBookFactory textbookFactory = phs.getFactory("Textbook");
        IBookFactory literaryWorkFactory = phs.getFactory("LiteraryWork");

        if (textbookFactory != null) {
            IBook book1 = textbookFactory.publishBook();
            book1.setName("Mathematics for Beginners");
            book1.setSummary("An introduction to basic math concepts.");
            System.out.println("Book Published: " + book1);
        }

        if (literaryWorkFactory != null) {
            IBook book2 = literaryWorkFactory.publishBook();
            book2.setName("The Great Novel");
            book2.setSummary("A thrilling adventure of self-discovery.");
            System.out.println("Book Published: " + book2);
        }
    }
}