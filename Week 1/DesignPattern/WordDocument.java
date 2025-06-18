package DesignPattern.FactoryMethodPatternExample;

public class WordDocument implements Document {
    public void create() {
        System.out.println("creating Word Document.");
    }
}