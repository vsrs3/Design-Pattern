package TemplateMethod;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Processing CSV data:");
        DataProcessor csvProcessor = new CSVDataProcessor();
        csvProcessor.process();
        
        System.out.println("\nProcessing XML data:");
        DataProcessor xmlProcessor = new XMLDataProcessor();
        xmlProcessor.process();
        
        System.out.println("\nProcessing JSON data:");
        DataProcessor jsonProcessor = new JSONDataProcessor();
        jsonProcessor.process();
    }
}