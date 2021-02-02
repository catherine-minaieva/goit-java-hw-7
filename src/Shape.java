public abstract class Shape implements Namer {
    public abstract String getName();
}

class Test {
    public static void main(String[] args) {
        Quad quad = new Quad();
        Oval oval = new Oval();
        NamePrinter printer = new NamePrinter();
        printer.printName(quad);
        printer.printName(oval);
    }
}
