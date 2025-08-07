package TemplateMethod;

public class JSONDataProcessor extends DataProcessor {
    
    @Override
    protected void readData() {
        System.out.println("Reading data from JSON file");
    }
    
    @Override
    protected void processData() {
        System.out.println("Processing JSON data: parsing objects, validating structure");
    }
    
    @Override
    protected void writeData() {
        System.out.println("Writing processed JSON data to database");
    }
}