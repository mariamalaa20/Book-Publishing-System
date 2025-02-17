class TextbookFactory implements IBookFactory {
    @Override
    public IBook publishBook() {
        return new Textbook();
    }
}
