package DesignPattern.FactoryMethodPatternExample;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------");

        DocumentFactory wordFactory = new WordDocumentFactory();
        Document word = wordFactory.createDocument();
        word.create(); 

        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdf = pdfFactory.createDocument();
        pdf.create();

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excel = excelFactory.createDocument();
        excel.create();

        System.out.println("-----------------");
    }   
}
