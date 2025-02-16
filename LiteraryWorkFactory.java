class LiteraryWorkFactory implements IBookFactory {
    @Override
    public IBook publishBook() {
        return new LiteraryWork();
    }
}
