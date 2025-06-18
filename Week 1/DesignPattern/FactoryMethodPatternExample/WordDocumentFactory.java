package DesignPattern.FactoryMethodPatternExample;

public class WordDocumentFactory extends DocumentFactory{
    public Document createDocument(){
        return new ExcelDocument();
    }
}
