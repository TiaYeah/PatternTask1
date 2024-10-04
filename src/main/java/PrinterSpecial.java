public class PrinterSpecial extends PrinterDefault{
    @Override
    public void print(String wordToPrint) {
        System.out.print("(" + wordToPrint + ")");
    }
}
