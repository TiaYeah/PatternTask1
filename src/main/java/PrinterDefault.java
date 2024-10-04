public class PrinterDefault implements IPrinter {

    @Override
    public void print(String wordToPrint) {
        System.out.print(wordToPrint);
    }

    @Override
    public void print(char signToPrint) {
        System.out.print(signToPrint);
    }
}
