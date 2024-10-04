public class Word implements IPrintable {
    private String word;

    public Word(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    @Override
    public void print(IPrinter printer) {
        printer.print(word);
    }
}
