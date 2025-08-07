package TemplateMethod;

public class XMLDataProcessor extends DataProcessor {
    
    @Override
    protected void readData() {
        System.out.println("Reading data from XML file");
    }
    
    @Override
    protected void processData() {
        System.out.println("Processing XML data: parsing tags, validating schema");
    }
    
    @Override
    protected void writeData() {
        System.out.println("Writing processed XML data to database");
    }
}