public class PrinterDelegate implements IPrinterDelegate{
    @Override
    public void print(IPrintable printable) {
        printable.print(this);
    }

    @Override
    public void print(String wordToPrint) {
        System.out.print(wordToPrint);
    }

    @Override
    public void print(char signToPrint) {
        System.out.print(signToPrint);
    }
}
