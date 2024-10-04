public class Text implements IPrintable{
    private IPrintable[] textArray;

    public Text(IPrintable ... printables) {
        textArray = printables;
    }

    public void print(IPrinterDelegate printer) {
        for (int i = 0; i < textArray.length; i++) {
//            textArray[i].print(printer);
            printer.print(textArray[i]);
        }
    }


    @Override
    public void print(IPrinter printer) {
        for (int i = 0; i < textArray.length; i++) {
            textArray[i].print(printer);
        }
    }
}
