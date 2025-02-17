class Textbook implements IBook {
    private String bookName;
    private String bookSummary;

    @Override
    public String getName() {
        return this.bookName;
    }

    @Override
    public String getSummary() {
        return this.bookSummary;
    }

    @Override
    public void setName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public void setSummary(String bookSummary) {
        this.bookSummary = bookSummary;
    }

    @Override
    public String toString() {
        return "Textbook{Name='" + bookName + "', Summary='" + bookSummary + "'}";
    }
}