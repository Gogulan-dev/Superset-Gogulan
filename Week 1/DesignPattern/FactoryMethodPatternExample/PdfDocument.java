package DesignPattern.FactoryMethodPatternExample;

public class PdfDocument implements Document {
    public void create() {
        System.out.println("Creating PDF Document.");
    }
}

