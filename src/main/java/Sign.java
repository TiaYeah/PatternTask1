public class Sign implements IPrintable {
    private char sign;

    public Sign(char sign) {
        this.sign = sign;
    }

    public char getSign() {
        return sign;
    }

    @Override
    public void print(IPrinter printer) {
        printer.print(sign);
    }
}
